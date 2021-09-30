//PROJECT NAME: prjBruno-quitanda
package services;
import dao.ClienteDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:04
 * @version 1.0 beta
 */
public class ClienteServices {
    
    public void insert(Cliente obj) throws SQLException, ClassNotFoundException{
        ClienteDAO clienteDAO = DAOFactory.getClienteDAO();
        clienteDAO.insert(obj);
    }
    
    public ArrayList<Cliente> select() throws SQLException, ClassNotFoundException {
        ClienteDAO clienteDAO = DAOFactory.getClienteDAO();
        return clienteDAO.select();
    }
    
    public ArrayList<Cliente> filter(String query) throws SQLException, ClassNotFoundException {
        ClienteDAO clienteDAO = DAOFactory.getClienteDAO();
        return clienteDAO.filter(query);
    }
    
    public  void delete(long id) throws SQLException, ClassNotFoundException {
      ClienteDAO clienteDAO = DAOFactory.getClienteDAO();
      clienteDAO.delete(id);
    }
    
    public void alter(Cliente obj) throws SQLException, ClassNotFoundException {
        ClienteDAO clienteDAO = DAOFactory.getClienteDAO();
        clienteDAO.update(obj);
    }
}
