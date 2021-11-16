package Exercicios.JDBC.ATP49;

import java.sql.*;

public class View2 {

    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {

            String sql = "insert into pessoas(nome,sobrenome,idade,endereco) values(?,?,?,?)";
            
     
             try ( PreparedStatement prepStatement = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
                prepStatement.setString(1, "Antonio");
                prepStatement.setString(2, "Pereira");
                prepStatement.setInt(3, 36);
                prepStatement.setString(4, "Rua ol");
    
                prepStatement.execute();
    
                ResultSet ids = prepStatement.getGeneratedKeys();
    
                while (ids.next()) {
                    int id = ids.getInt("id");
                    System.out.printf("id nº: %s inserido com sucesso! ",id);
                }
    
            
             conn.close();
     
             } catch (Exception e) {
                 e.printStackTrace();
             }            
             
         } catch (SQLException e) {
             e.printStackTrace();
         }
    }
    
}
