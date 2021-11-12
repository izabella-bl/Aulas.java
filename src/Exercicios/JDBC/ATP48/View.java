package Exercicios.JDBC.ATP48;

import java.sql.*;

public class View {
    public static void main(String[] args) {
        
        try {

            String drivertype = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;
            String database = "postgres";
            String pwd = "123456";

            String conectString = String.format("%s:%s://%s:%d/%s", drivertype,driverName,host,port,database);
            Connection conn = DriverManager.getConnection(conectString, database, pwd);

            PreparedStatement prepStatement = conn.prepareStatement("select * from pessoas where id > ? order by id ASC");
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


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    
}
