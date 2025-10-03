package JDBC.src.entidades;

public class Usuario {

    // Atributos baseados na tabela criada no MySQL (min 01:15)
    private int idUsuario;
    private String nome;
    private String login;
    private String senha;
    private String email;

    // Construtor vazio
    public Usuario() {}

    // Getters e Setters (min 11:29)

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}