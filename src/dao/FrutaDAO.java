//PROJECT NAME: prjBruno-quitanda
package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Fruta;
import persistence.ConexaoBanco;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:10
 * @version 1.0 beta
 */
public class FrutaDAO {
    
    public void insert(Fruta obj) throws SQLException, ClassNotFoundException{
        Connection con = ConexaoBanco.getConexao();
        Statement sta = con.createStatement();
        try {
            String sql;
            
            sql = "INSERT INTO frutas_quitanda(id_fruta, nome, valor, quantidade, data_registro, hora_registro)"
                    + "VALUES (NULL, '" + obj.getNome() + "'," + obj.getValorCusto() + "," + obj.getQuantidade() + ", NOW(), NOW());";
            sta.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            con.close();
            sta.close();
        }
    }

    public ArrayList<Fruta> select() throws SQLException, ClassNotFoundException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
          
            sql = "SELECT * FROM frutas_quitanda;";

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<Fruta> fs = new ArrayList<>();

            while (rs.next()) {

                Fruta f = new Fruta();

                f.setIdFruta(rs.getLong("id_fruta"));
                f.setNome(rs.getString("nome"));
                f.setValorCusto(rs.getFloat("valor"));
                f.setQuantidade(rs.getInt("quantidade"));
                
                fs.add(f);
            }
            return fs;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<Fruta> filter(String query) throws SQLException, ClassNotFoundException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
                      
            sql = "SELECT * FROM frutas_quitanda " + query + ";";

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<Fruta> fs = new ArrayList<>();

            while (rs.next()) {

                Fruta c = new Fruta();

                c.setIdFruta(rs.getLong("id_fruta"));
                c.setNome(rs.getString("nome"));
                c.setValorCusto(rs.getFloat("valor"));
                c.setQuantidade(rs.getInt("quantidade"));

                fs.add(c);
            }

            return fs;
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
            String sql = "DELETE FROM frutas_quitanda WHERE id_fruta = " + id + ";";
            stat.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            stat.close();
            con.close();
        }
    }
    
    public void update(Fruta obj) throws SQLException, ClassNotFoundException {

        Connection con = ConexaoBanco.getConexao();

        Statement stat = con.createStatement();
        try {
            String sql = "UPDATE frutas_quitanda SET nome = '" + obj.getNome() + "', valor = " + obj.getValorCusto() + ", quantidade = " + obj.getQuantidade()+" WHERE id_fruta = " + obj.getIdFruta() + ";";

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
