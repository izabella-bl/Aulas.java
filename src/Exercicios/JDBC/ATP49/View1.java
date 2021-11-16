package Exercicios.JDBC.ATP49;

import java.sql.*;

import Exercicios.JDBC.ATP49.*;

public class View1 {

    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {

           String sql = "select * from pessoas where id > ? order by id ASC";
           
    
            try ( PreparedStatement prepStatement = conn.prepareStatement(sql)) {
                prepStatement.setInt(1, 0 );
                prepStatement.execute();            
                ResultSet result = prepStatement.getResultSet();
    
                while(result.next()){
                    int id = result.getInt("id");
                    String nome = result.getString("nome");
                    String sobrenome = result.getString("sobrenome");
                    int idade = result.getInt("idade");
                    System.out.printf("%d - Nome completo: %s | Idade: %s \n",id,nome,sobrenome,idade);
                }
    
            } catch (Exception e) {
                e.printStackTrace();
            }            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
    }
}


    
    

