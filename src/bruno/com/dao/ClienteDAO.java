//PROJECT NAME: prjBruno-quitanda
package bruno.com.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import bruno.com.model.Cliente;
import bruno.com.persistence.ConexaoMysqlBruno;
import bruno.com.persistence.ConexaoMysqlGente;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:08
 * @version 1.0 beta
 */
public class ClienteDAO {
    
    private String selectAll = "SELECT * FROM clientes_quitanda";
    
    public void insert(Cliente cliente) throws SQLException, ClassNotFoundException{
        System.out.println("into method insert");
        
        Statement statement = null;
        Connection conexaoMysqlBruno = null;
        Connection conexaoMysqlGente = null;
        ArrayList<Cliente> lista = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
        if (conexaoMysqlBruno == null) {
            conexaoMysqlGente = ConexaoMysqlGente.conectar();
            statement = conexaoMysqlGente.createStatement();
        } else {
            statement = conexaoMysqlBruno.createStatement();
        }
        try {            
            String sql = "INSERT INTO clientes_quitanda(id_cliente, nome, cpf, idade, data_registro, hora_registro)"
                    + "VALUES (NULL, '" + cliente.getNome() + "', '" + cliente.getCpf()+ "', " + cliente.getIdade() + ", NOW(), NOW());";
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            statement.close();
        }
        if (conexaoMysqlBruno == null) {
            conexaoMysqlGente.close();
        } else {
            conexaoMysqlBruno.close();
        }
    }
    
    public ArrayList<Cliente> selectAll() throws SQLException, ClassNotFoundException {
        System.out.println("into method selectAll");
        
        Statement statement = null;
        Connection conexaoMysqlBruno = null;
        Connection conexaoMysqlGente = null;
        ArrayList<Cliente> lista = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
        if (conexaoMysqlBruno == null) {
            conexaoMysqlGente = ConexaoMysqlGente.conectar();
            statement = conexaoMysqlGente.createStatement();
        } else {
            statement = conexaoMysqlBruno.createStatement();
        }
        
        try {          
            ResultSet resultSet = statement.executeQuery(this.selectAll);
            lista = new ArrayList<>();
            while (resultSet.next()) {
                Cliente cliente = new Cliente();

                cliente.setIdCliente(resultSet.getLong("id_cliente"));
                cliente.setNome(resultSet.getString("nome"));
                cliente.setCpf((resultSet.getString("cpf")));
                cliente.setIdade(resultSet.getInt("idade"));
                lista.add(cliente);
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            statement.close();
        }
        if (conexaoMysqlBruno == null) {
            conexaoMysqlGente.close();
        } else {
            conexaoMysqlBruno.close();
        }
         return lista;
    }
    
    public ArrayList<Cliente> selectBy(String query) throws SQLException, ClassNotFoundException {
        System.out.println("into method selectBy");
        
        Statement statement = null;
        Connection conexaoMysqlBruno = null;
        Connection conexaoMysqlGente = null;
        ArrayList<Cliente> lista = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
        if (conexaoMysqlBruno == null) {
            conexaoMysqlGente = ConexaoMysqlGente.conectar();
            statement = conexaoMysqlGente.createStatement();
        } else {
            statement = conexaoMysqlBruno.createStatement();
        }
        
        try {
            ResultSet resultSet = statement.executeQuery(this.selectAll + " " + query + ";");
            lista = new ArrayList<>();
            while (resultSet.next()) {
                Cliente obj = new Cliente();

                obj.setIdCliente(resultSet.getLong("id_cliente"));
                obj.setNome(resultSet.getString("nome"));
                obj.setCpf(resultSet.getString("cpf"));
                obj.setIdade(resultSet.getInt("idade"));
                lista.add(obj);
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            statement.close();
        }
        if (conexaoMysqlBruno == null) {
            conexaoMysqlGente.close();
        } else {
            conexaoMysqlBruno.close();
        }
        return lista;
    }
    
    public void delete(long id) throws SQLException, ClassNotFoundException{
        System.out.println("into method delete");
        
        Statement statement = null;
        Connection conexaoMysqlBruno = null;
        Connection conexaoMysqlGente = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
        if (conexaoMysqlBruno == null) {
            conexaoMysqlGente = ConexaoMysqlGente.conectar();
            statement = conexaoMysqlGente.createStatement();
        } else {
            statement = conexaoMysqlBruno.createStatement();
        }
        
        try{
            String sql = "DELETE FROM clientes_quitanda WHERE id_cliente = " + id + ";";
            statement.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            statement.close();
        }
        if (conexaoMysqlBruno == null) {
            conexaoMysqlGente.close();
        } else {
            conexaoMysqlBruno.close();
        }
    }
    
    public void update(Cliente obj) throws SQLException, ClassNotFoundException {
        System.out.println("into method update");

        Statement statement = null;
        Connection conexaoMysqlBruno = null;
        Connection conexaoMysqlGente = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
        if (conexaoMysqlBruno == null) {
            conexaoMysqlGente = ConexaoMysqlGente.conectar();
            statement = conexaoMysqlGente.createStatement();
        } else {
            statement = conexaoMysqlBruno.createStatement();
        }
        
        try {
            String sql = "UPDATE clientes_quitanda SET nome = '" + obj.getNome() + "', cpf = '" + obj.getCpf()+ "', idade = " + obj.getIdade() + " WHERE id_cliente = " + obj.getIdCliente() + ";";
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            statement.close();
        }
        if (conexaoMysqlBruno == null) {
            conexaoMysqlGente.close();
        } else {
            conexaoMysqlBruno.close();
        }
    }
}
