//PROJECT NAME: prjBruno-quitanda
package persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:04
 * @version 1.0 beta
 */
public class ConexaoBanco {
    
    private static final String URL = "jdbc:mysql://10.1.0.201:3306/test";
    // private static final String URL = "jdbc:mysql://localhost:3306/bdjava";
    private static final String USUARIO = "";
    // private static final String SENHA = "kaiser";
    private static final String SENHA = "";
    private static final String DRIVE = "com.mysql.jdbc.Driver";
        
    public static Connection getConexao() throws SQLException, ClassNotFoundException{
       Connection c = null; 
        try {
            Class.forName(DRIVE);
            c = DriverManager.getConnection(URL,USUARIO,SENHA);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro de conexão\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return c;    
    }    
}
