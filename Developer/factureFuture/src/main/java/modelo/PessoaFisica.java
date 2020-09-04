package modelo;

import java.util.ArrayList;

public class PessoaFisica extends Usuario{
    private String cpf;
    private String contato;
    private ArrayList<Conquista> conquistas;
    private Curriculo[] curriculo = new Curriculo[1];
    private ArrayList<Curso> cursos;
    private ArrayList<Experiencia> expreriencia;


    public boolean cadastrar(Usuario user) {
        return false;
    }
}
