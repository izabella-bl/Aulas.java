package Exercicios.JDBC.ATP48;

import java.sql.*;

public class View4 {
    public static void main(String[] args) {
        try {
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;
            String database = "postgres";
            String pwd = "123456";

            String connectionString = String.format("%s:%s://%s:%d/%s",driverType,driverName,host,port,database);
            Connection conn = DriverManager.getConnection(connectionString,database,pwd);
  
            String sql = "DELETE FROM pessoas WHERE id = ?";
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setInt(1,4 );

            prepStatement.execute();   
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);    

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
