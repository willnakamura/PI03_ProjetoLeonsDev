/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.DAOs;

import br.senac.tads3.pi3b.leonsdev.aeronave.classes.Aeronave;
import br.senac.tads3.pi3b.leonsdev.dbUtils.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Josué
 */
public class DaoAeronaves {
    public static void inserir(Aeronave aeronave)
            throws SQLException, Exception {
        
        String sql = "INSERT INTO Aeronaves (Fabricante, Modelo, Total_Assentos, Ativo"
                + "VALUES (?, ?, ?)";
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, aeronave.getFabricante());
            preparedStatement.setString(2, aeronave.getModelo());
            preparedStatement.setInt(3, aeronave.getTotalAssentos());
            preparedStatement.setBoolean(4, true);

            //Executa o comando no banco de dados
            preparedStatement.execute();

        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static void atualizar(Aeronave aeronave)
            throws SQLException, Exception {
        String sql = "UPDATE Aeronaves SET Fabricante=?, Modelo=?, Total_Assentos, Ativo"
                + "WHERE (Aeronave_id=?)";
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, aeronave.getFabricante());
            preparedStatement.setString(2, aeronave.getModelo());
            preparedStatement.setInt(3, aeronave.getTotalAssentos());
            preparedStatement.setInt(4, aeronave.getId());

            //Executa o comando no banco de dados
            preparedStatement.execute();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static void excluir(Integer id) throws SQLException, Exception {
        //Monta a string de atualização do aeronave no BD, utilizando
        //prepared statement
        String sql = "UPDATE aeronave SET enabled=? WHERE (aeronave_id=?)";
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setBoolean(1, false);
            preparedStatement.setInt(2, id);

            //Executa o comando no banco de dados
            preparedStatement.execute();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

 
    public static List<Aeronave> listar()
            throws SQLException, Exception {
        String sql = "SELECT * FROM aeronave WHERE (enabled=?)";
 
        List<Aeronave> listaAeronaves = null;
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, true);

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaAeronaves == null) {
                    listaAeronaves = new ArrayList<>();
                }
                
                Aeronave aeronave = new Aeronave();
                aeronave.setId(result.getInt("aeronave_id"));
                aeronave.setNome(result.getString("nome"));
                aeronave.setCpf(Long.toString(result.getLong("cpf")));
                aeronave.setCep(Integer.toString(result.getInt("cep")));
                aeronave.setEndereco(result.getString("endereco"));
                aeronave.setCidade(result.getString("cidade"));
                aeronave.setGenero(result.getString("sexo"));
                aeronave.setEstado(result.getString("estado"));
                aeronave.setTelefone(result.getString("telefone"));
                aeronave.setEmail(result.getString("email"));
                Date d = new Date(result.getTimestamp("data_nasc").getTime());
                aeronave.setDataNascimento(d);
                //Adiciona a instância na lista
                listaAeronaves.add(aeronave);
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        //Retorna a lista de aeronaves do banco de dados
        return listaAeronaves;
    }

    
    public static List<Aeronave> procurar(String valor)
            throws SQLException, Exception {
    
        String sql = "SELECT * FROM aeronave WHERE cpf=? AND enabled=?";
    
        List<Aeronave> listaAeronaves = null;
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setLong(1, Long.parseLong(valor));
            preparedStatement.setBoolean(2, true);

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaAeronaves == null) {
                    listaAeronaves = new ArrayList<>();
                }
    
                Aeronave aeronave = new Aeronave();
                aeronave.setId(result.getInt("aeronave_id"));
                aeronave.setNome(result.getString("nome"));
                aeronave.setCpf(Long.toString(result.getLong("cpf")));
                aeronave.setCep(Integer.toString(result.getInt("cep")));
                aeronave.setEndereco(result.getString("endereco"));
                aeronave.setCidade(result.getString("cidade"));
                aeronave.setGenero(result.getString("sexo"));
                aeronave.setEstado(result.getString("estado"));
                aeronave.setTelefone(result.getString("telefone"));
                aeronave.setEmail(result.getString("email"));
                Date d = new Date(result.getTimestamp("data_nasc").getTime());
                aeronave.setDataNascimento(d);
                //Adiciona a instância na lista
                listaAeronaves.add(aeronave);
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    
        return listaAeronaves;
    }
    
    
    public static List<Aeronave> procurarNome(String valor)
            throws SQLException, Exception {
        //Monta a string de consulta de aeronaves no banco
        String sql = "SELECT * FROM aeronave WHERE nome LIKE ? AND enabled=?";
    
        List<Aeronave> listaAeronaves = null;
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, valor);
            preparedStatement.setString(1, '%' + valor + '%');
            preparedStatement.setBoolean(2, true);

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaAeronaves == null) {
                    listaAeronaves = new ArrayList<>();
                }
    
                Aeronave aeronave = new Aeronave();
                aeronave.setId(result.getInt("aeronave_id"));
                aeronave.setNome(result.getString("nome"));
                aeronave.setCpf(Long.toString(result.getLong("cpf")));
                aeronave.setCep(Integer.toString(result.getInt("cep")));
                aeronave.setEndereco(result.getString("endereco"));
                aeronave.setCidade(result.getString("cidade"));
                aeronave.setGenero(result.getString("sexo"));
                aeronave.setEstado(result.getString("estado"));
                aeronave.setTelefone(result.getString("telefone"));
                aeronave.setEmail(result.getString("email"));
                Date d = new Date(result.getTimestamp("data_nasc").getTime());
                aeronave.setDataNascimento(d);
                //Adiciona a instância na lista
                listaAeronaves.add(aeronave);
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    
        return listaAeronaves;
    }

    
    public static Aeronave obter(Integer id)
            throws SQLException, Exception {
        
        String sql = "SELECT * FROM aeronave WHERE (aeronave_id=? AND enabled=?)";

        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setInt(1, id);
            preparedStatement.setBoolean(2, true);

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Verifica se há pelo menos um resultado
            if (result.next()) {
        
                Aeronave aeronave = new Aeronave();
                aeronave.setId(result.getInt("aeronave_id"));
                aeronave.setNome(result.getString("nome"));
                aeronave.setCpf(Long.toString(result.getLong("cpf")));
                aeronave.setCep(Integer.toString(result.getInt("cep")));
                aeronave.setEndereco(result.getString("endereco"));
                aeronave.setCidade(result.getString("cidade"));
                aeronave.setGenero(result.getString("sexo"));
                aeronave.setEstado(result.getString("estado"));
                aeronave.setTelefone(result.getString("telefone"));
                aeronave.setEmail(result.getString("email"));
                Date d = new Date(result.getTimestamp("data_nasc").getTime());
                aeronave.setDataNascimento(d);
                //Retorna o resultado
                return aeronave;
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }

        //Se chegamos aqui, o "return" anterior não foi executado porque
        //a pesquisa não teve resultados
        //Neste caso, não há um elemento a retornar, então retornamos "null"
        return null;
    }
}
