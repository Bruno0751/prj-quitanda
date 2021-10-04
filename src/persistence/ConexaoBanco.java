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

    //private static final String DRIVE = "com.mysql.jdbc.Driver";
    private static final String DRIVE = "com.mysql.cj.jdbc.Driver";
    //private static final String URL = "jdbc:mysql://10.1.0.201:3306/test";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/quitanda?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConexao() throws SQLException, ClassNotFoundException {
        Connection objConnection = null;
        try {
            Class.forName(DRIVE);
            //String URL = "jdbc:mysql://localhost:3306/quitanda?useTimezone=true&serverTimezone=UTC&user=root&password=9320";
            objConnection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro de conexão\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(0);
        } finally {
            return objConnection;
        }
    }
}
