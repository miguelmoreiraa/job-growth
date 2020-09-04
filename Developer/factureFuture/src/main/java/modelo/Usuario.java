package modelo;

public abstract class Usuario {
    private String nome;
    private String endereco;
    private String email;
    private String senha;


    public abstract boolean cadastrar(Usuario user);

    public void login(Usuario user){

    }

    public void logoff(){

    }
}
