package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    

    public static Connection getConnetcion() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/banco","postgres","leitao1239@r");
        } catch (Exception e){
            throw new SQLException(e.getMessage());
        }
    }
}