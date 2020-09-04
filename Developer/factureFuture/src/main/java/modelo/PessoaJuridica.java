package modelo;

public class PessoaJuridica extends Usuario{
    private String cnpj;
    private String descricao;


    public boolean cadastrar(Usuario user) {
        return false;
    }
}
