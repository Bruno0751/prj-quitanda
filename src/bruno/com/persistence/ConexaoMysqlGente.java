package bruno.com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 20/12/2021
 * @version 1
 */
public class ConexaoMysqlGente {
    
    private static final String URL = "jdbc:mysql://10.1.0.201:3306/test?useTimezone=true&serverTimezone=UTC";
    private static final String PASSWORD = "kaiser";
    private static final String USER = "root";
    private static final String DRIVE = "com.mysql.jdbc.Driver"; //5.1.30
    
    public static Connection conectar() throws SQLException, ClassNotFoundException {
        Connection connection = null;
        try {
            Class.forName(DRIVE);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("erro de conexão ConexaoMysqlGente\n" + e.getMessage());
            //e.printStackTrace();            
        }finally {}
        return connection;
    }
}
