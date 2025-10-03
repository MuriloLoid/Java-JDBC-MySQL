package JDBC.src.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    // Constantes de conexão (min 07:01)
    private static final String URL = "jdbc:mysql://localhost:3306/exemploBD";
    private static final String USER = "root";       // Alterar se necessário
    private static final String PASSWORD = "root";   // Alterar se necessário

    // Objeto estático da conexão
    private static Connection con = null;

    /**
     * Retorna a conexão com o banco de dados.
     * Cria a conexão apenas uma vez (se 'con' for nulo).
     */
    public static Connection getConexao() {
        if (con == null) {
            try {
                // Tenta estabelecer a conexão (min 09:08)
                con = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexão estabelecida com sucesso!");
            } catch (SQLException e) {
                // Caso ocorra um erro de conexão (min 09:31)
                System.err.println("Erro ao conectar com o banco de dados: " + e.getMessage());
                con = null; // Retorna nulo em caso de falha
            }
        }
        return con;
    }
}