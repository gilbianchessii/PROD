
/**
 *
 * @author Rodrigo
 */
/*
import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnect {
    Connection con;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/livraria";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection ConnectDb(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
    }
    // Conexão SQLite
    /*public static Connection ConnectDb(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Administrador\\Desktop\\LIV\\Livraria.sqlite");

            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }*/
   
//}
