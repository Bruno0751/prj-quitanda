//PROJECT NAME: prjBruno-quitanda
package services;
import dao.FrutaDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Fruta;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:04
 * @version 1.0 beta
 */
public class FrutaServices {
    
    public void insert(Fruta obj) throws SQLException, ClassNotFoundException{
        FrutaDAO frutaDAO = DAOFactory.getFrutasDAO();
        frutaDAO.insert(obj);
    }
    
    public ArrayList<Fruta> select() throws SQLException, ClassNotFoundException {
        FrutaDAO frutaDAO = DAOFactory.getFrutasDAO();
        return frutaDAO.select();
    }
    
    public ArrayList<Fruta> filter(String query) throws SQLException, ClassNotFoundException {
        FrutaDAO frutaDAO = DAOFactory.getFrutasDAO();
        return frutaDAO.filter(query);
    }
    
    public  void delete(long id) throws SQLException, ClassNotFoundException {
      FrutaDAO frutaDAO = DAOFactory.getFrutasDAO();
      frutaDAO.delete(id);
    }
    
    public void update(Fruta obj) throws SQLException, ClassNotFoundException {
        FrutaDAO frutaDAO = DAOFactory.getFrutasDAO();
        frutaDAO.update(obj);
    }
}
