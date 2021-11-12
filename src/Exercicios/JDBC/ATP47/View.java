package Exercicios.JDBC.ATP47;

import java.sql.*;

public class View {
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
            String sql = " select * from categoria where id > 0 ORDER BY id ASC";

            statement.execute(sql);
            ResultSet result = statement.getResultSet();

            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String descricao = result.getString("descricao");
                System.out.printf("%d - Nome: %s | Descrição: %s \n",id,nome,descricao);
            }
         conn.close();

        }catch( SQLException e){
            e.printStackTrace();
        }
    }
    
}
