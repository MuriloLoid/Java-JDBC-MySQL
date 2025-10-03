package JDBC.src.dao;

import JDBC.src.conexao.Conexao;
import JDBC.src.entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    /**
     * Cadastra um novo usuário no banco de dados (min 12:37)
     * @param usuario O objeto Usuario a ser persistido.
     */
    public void cadastrarUsuario(Usuario usuario) {
        // Comando SQL para inserção (min 13:04)
        String sql = "INSERT INTO usuario (nome, login, senha, email) VALUES (?, ?, ?, ?)";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            // 1. Obtém a conexão (min 13:45)
            con = Conexao.getConexao();

            // 2. Prepara o comando SQL
            ps = con.prepareStatement(sql);

            // 3. Define os parâmetros da query (min 14:27)
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());

            // 4. Executa o comando (min 15:12)
            ps.execute();
            System.out.println("Usuário " + usuario.getNome() + " cadastrado com sucesso!");

        } catch (SQLException e) {
            // Tratamento de erro (min 14:16)
            System.err.println("Erro ao cadastrar usuário: " + e.getMessage());
        } finally {
            // Opcional: Fechar o PreparedStatement e a Conexão (min 15:25)
            try {
                if (ps != null) ps.close();
                // A conexão estática geralmente não é fechada aqui, mas sim ao final do programa.
            } catch (SQLException e) {
                System.err.println("Erro ao fechar recursos: " + e.getMessage());
            }
        }
    }
}