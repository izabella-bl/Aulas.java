package Modulo1.JDBC;

import java.sql.*;

public class View2 {
    public static void main (String[]args){
      
        try {
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;
            String database = "postgres";
            String user = "postgres";

            String pwd = "123456";

            String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);

            Connection conn = DriverManager.getConnection(connectionString, user, pwd);
            
            // Statement - query SQL
            Statement statement = conn.createStatement();
            statement.execute("insert into pessoas (nome,sobrenome,idade,endereco)values('Amanda','Alves',28,'Rua P');",statement.RETURN_GENERATED_KEYS);
            
           
            ResultSet result = statement.getResultSet();

        
            conn.close();

        } catch (SQLException e) {
            System.out.println("nao foi possível conectar ao banco");
        }
        
    }
}
