package Exercicios.JDBC.ATP48;

import java.sql.*;

public class View2 {
    public static void main(String[] args) {
        try{
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;
            String database = "postgres";
            String pwd = "123456";

            String connectionString = String.format("%s:%s://%s:%d/%s",driverType,driverName,host,port,database);
            Connection conn = DriverManager.getConnection(connectionString,database,pwd);

           
            PreparedStatement prepStatement = conn.prepareStatement("insert into pessoas(nome,sobrenome,idade,endereco) values(?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, "Luan");
            prepStatement.setString(2, "Gonçalves");
            prepStatement.setInt(3, 35);
            prepStatement.setString(4, "Rua lm");

            prepStatement.execute();

            ResultSet ids = prepStatement.getGeneratedKeys();

            while (ids.next()) {
                int id = ids.getInt("id");
                System.out.printf("id nº: %s inserido com sucesso! ",id);
            }

        
         conn.close();

        }catch( SQLException e){
            e.printStackTrace();
        }
    }
    
}
