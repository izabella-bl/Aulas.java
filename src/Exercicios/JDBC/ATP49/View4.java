package Exercicios.JDBC.ATP49;

import java.sql.*;


public class View4 {

    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {

            String sql = "DELETE FROM pessoas WHERE id = ?";
            
     
             try ( PreparedStatement prepStatement = conn.prepareStatement(sql)) {
                prepStatement.setInt(1,5 );
    
                prepStatement.execute();   
                int linhasAfetadas = prepStatement.getUpdateCount();
                System.out.println(linhasAfetadas);    
    
                conn.close();
     
            } catch (Exception e) {
                 e.printStackTrace();
            }            
             
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
 
}
    

