package Exercicios.JDBC.ATP46;

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
            String sql = " select p.*, c.id , c.nome as \"nome_categoria\" from produto as p join categoria as c on p.categoria_id = c.id where p.id > 0 ORDER BY p.id ASC";

            statement.execute(sql);
            ResultSet result = statement.getResultSet();

            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String preco = result.getString("preco");
                String categoria = result.getString("nome_categoria");
                System.out.printf("%d - Nome: %s | Preço: %s | Categoria: %s\n",id,nome,preco,categoria);
            }
         conn.close();

        }catch( SQLException e){
            e.printStackTrace();
        }
    }

    
}
