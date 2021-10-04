//PROJECT NAME: prjBruno-quitanda
package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Cliente;
import persistence.ConexaoBanco;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:08
 * @version 1.0 beta
 */
public class ClienteDAO {
    
    private final String QUERYALL = "SELECT * FROM clientes_quitanda;";
    
    public void insert(Cliente obj) throws SQLException, ClassNotFoundException{
        Connection con = ConexaoBanco.getConexao();
        Statement sta = con.createStatement();
        try {
            String sql;
            
            sql = "INSERT INTO clientes_quitanda(id_cliente, nome, cpf, idade, data_registro, hora_registro)"
                    + "VALUES (NULL, '" + obj.getNome() + "', '" + obj.getCpf()+ "', " + obj.getIdade() + ", NOW(), NOW());";
            sta.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            con.close();
            sta.close();
        }
    }
    
    public ArrayList<Cliente> select() throws SQLException, ClassNotFoundException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {          
            ResultSet rs = stat.executeQuery(QUERYALL);

            ArrayList<Cliente> listaClienttes = new ArrayList<>();

            while (rs.next()) {

                Cliente obj = new Cliente();

                obj.setIdCliente(rs.getLong("id_cliente"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf((rs.getString("cpf")));
                obj.setIdade(rs.getInt("idade"));

                listaClienttes.add(obj);
            }

            return listaClienttes;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<Cliente> filter(String query) throws SQLException, ClassNotFoundException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "SELECT * FROM clientes_quitanda " + query + ";";

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<Cliente> listaClienttes = new ArrayList<>();

            while (rs.next()) {

                Cliente obj = new Cliente();

                obj.setIdCliente(rs.getLong("id_cliente"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setIdade(rs.getInt("idade"));

                listaClienttes.add(obj);
            }

            return listaClienttes;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void delete(long id) throws SQLException, ClassNotFoundException{       
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();    
        try{
            String sql = "DELETE FROM clientes_quitanda WHERE id_cliente = " + id + ";";
            stat.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            stat.close();
            con.close();
        }
    }
    
    public void update(Cliente obj) throws SQLException, ClassNotFoundException {

        Connection con = ConexaoBanco.getConexao();

        Statement stat = con.createStatement();
        try {

            String sql = "UPDATE clientes_quitanda SET nome = '" + obj.getNome() + "', cpf = '" + obj.getCpf()+ "', idade = " + obj.getIdade() + " WHERE id_cliente = " + obj.getIdCliente() + ";";

            stat.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            con.close();
            stat.close();
        }
    }
}
