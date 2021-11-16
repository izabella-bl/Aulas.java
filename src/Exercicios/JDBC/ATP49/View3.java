package Exercicios.JDBC.ATP49;

import java.sql.*;

public class View3 {
    
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {

            String sql = "UPDATE pessoas SET sobrenome=? WHERE id = ?";
            
     
             try ( PreparedStatement prepStatement = conn.prepareStatement(sql)) {
                prepStatement.setString(1, "Leite");
                prepStatement.setInt(2, 7);
            

                prepStatement.execute();
                
                int linhasAfetadas = prepStatement.getUpdateCount();
                System.out.println(linhasAfetadas);

            
               conn.close();
     
             } catch (Exception e) {
                 e.printStackTrace();
             }            
             
         } catch (SQLException e) {
             e.printStackTrace();
         }
     
     }
}
