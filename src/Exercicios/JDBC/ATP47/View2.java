package Exercicios.JDBC.ATP47;

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

            Statement statement = conn.createStatement();
            String sql = "insert into categoria(nome,descricao) values('Açougue','Variedade de carnes')";
    
            statement.execute(sql, statement.RETURN_GENERATED_KEYS);

            ResultSet ids = statement.getGeneratedKeys();

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
