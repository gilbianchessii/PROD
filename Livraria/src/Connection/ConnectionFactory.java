
package Connection;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/livraria";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
    }
    
    // Fechando a Conexão
    public static void closeConnection(Connection con){
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
    }
    // Fechando o PreparedStatement
    public static void closeConnection(Connection con, PreparedStatement stmt){
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
        closeConnection(con);
    }
    
    //Fechando o ResultSet
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
        closeConnection(con,stmt);
    }
    
    
}
