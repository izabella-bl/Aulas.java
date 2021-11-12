package Exercicios.JDBC.ATP47;


import java.sql.*;

public class View3 {
    public static void main(String[] args) {

        try{
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;
            String database = "postgres";
            String pwd = "123456";

            String connectionString = String.format("%s:%s://%s:%d/%s",driverType,driverName,host,port,database);
            Connection coon = DriverManager.getConnection(connectionString,database, pwd);

            Statement statement = coon.createStatement();
            String sql = "update categoria set nome = 'Eletro' where id = 1; update categoria set nome = 'Alimentos' where id = 2;";

            statement.execute(sql);

            int linhasAfetadas = statement.getUpdateCount();
            System.out.println(linhasAfetadas);   
           
            coon.close();

        }catch(SQLException e){
             e.printStackTrace();
        }   
     }
    
}
