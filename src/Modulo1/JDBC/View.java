package Modulo1.JDBC;

import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;

public class View {
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
            statement.execute("SELECT * FROM PESSOAS WHERE ID > 0 ORDER BY ID ASC");
            // Result = retorno da consulta
            ResultSet result = statement.getResultSet();

            //Imprimir resultado
            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String sobrenome = result.getString("sobrenome");
                System.out.printf("%d - %s %s \n",id,nome,sobrenome);
            }
            conn.close();

        } catch (SQLException e) {
            System.out.println("nao foi possível conectar ao banco");
        }
        
    }

}
