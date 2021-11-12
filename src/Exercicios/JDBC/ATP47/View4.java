package Exercicios.JDBC.ATP47;

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
            
            Statement statement = conn.createStatement();
            String sql = "DELETE FROM categoria WHERE nome = 'Açougue' and id > 6";
            statement.execute(sql);   
                 
        
           conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
