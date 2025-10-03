package JDBC.src.app;
import JDBC.src.dao.UsuarioDAO;
import JDBC.src.entidades.Usuario;

public class Principal {
    public static void main(String[] args) {

        // 1. Cria um novo objeto Usuário (min 15:44)
        Usuario novoUsuario = new Usuario();
        
        // CORRIGIDO: Remover o nome do parâmetro dentro do parênteses
        novoUsuario.setNome("Rogério Napoleão"); 
        novoUsuario.setLogin("rogerioj");       
        novoUsuario.setSenha("1234");           
        novoUsuario.setEmail("rogerioj@gmail.com"); 

        // 2. Instancia o DAO
        UsuarioDAO dao = new UsuarioDAO();

        // 3. Chama o método de cadastro (min 16:23)
        dao.cadastrarUsuario(novoUsuario);

        System.out.println("Fim da execução.");
    }
}