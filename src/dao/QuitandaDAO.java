//PROJECT NAME: prjBruno-quitanda
package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Quitanda;
import persistence.ConexaoBanco;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:11
 * @version 1.0 beta
 */
public class QuitandaDAO {
    
    public void insert(Quitanda obj) throws SQLException, ClassNotFoundException{
        Connection con = ConexaoBanco.getConexao();
        Statement sta = con.createStatement();
        try {
            
            String sql = "INSERT INTO test.quitandas_quitanda(id_quitanda, nome, cliente, funcionario, data_registro, hora_registro)"
                    + "VALUES (NULL, '" + obj.getNome() + "', '" + obj.getClientes() + "', '" + obj.getFuncionarios() + "', NOW(), NOW());";
            sta.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            con.close();
            sta.close();
        }
    }
    
    public ArrayList<Quitanda> select() throws SQLException, ClassNotFoundException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            
          
            String sql = "SELECT * FROM test.quitandas_quitanda;";

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<Quitanda> qs = new ArrayList<>();

            while (rs.next()) {
                
                Quitanda q = new Quitanda();
                
                q.setIdQuitanda(rs.getLong("id_quitanda"));
                q.setNome(rs.getString("nome"));
                q.setClientes(rs.getString("cliente"));
                q.setFuncionarios(rs.getString("funcionario"));

                qs.add(q);
            }
            return qs;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<Quitanda> filter(String query) throws SQLException, ClassNotFoundException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
                      
            String sql = "SELECT * FROM test.quitandas_quitanda " + query + ";";

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<Quitanda> qs = new ArrayList<>();

            while (rs.next()) {

                Quitanda q = new Quitanda();

                q.setIdQuitanda(rs.getLong("id_quitanda"));
                q.setNome(rs.getString("nome"));
                q.setClientes(rs.getString("cliente"));
                q.setFuncionarios(rs.getString("funcionario"));

                qs.add(q);
            }

            return qs;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void deletarQuitanda(long id) throws SQLException, ClassNotFoundException{       
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();    
        try{
            String sql = "DELETE FROM test.quitandas_quitanda WHERE id_quitanda = " + id + ";";
            stat.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            stat.close();
            con.close();
        }
    }
    
    public void update(Quitanda obj) throws SQLException, ClassNotFoundException {

        Connection con = ConexaoBanco.getConexao();
        
        Statement stat = con.createStatement();
        try {

            

            String sql = "UPDATE test.quitandas_quitanda SET nome = '" + obj.getNome() + "', cliente = '" + obj.getClientes() + "', funcionario = '" + obj.getFuncionarios() + "' WHERE id_quitanda = " + obj.getIdQuitanda() + ";";

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

