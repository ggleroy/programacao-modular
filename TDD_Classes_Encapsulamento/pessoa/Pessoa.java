package TDD_Classes_Encapsulamento.pessoa;


public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private boolean sexo;

    public Pessoa(String nome, String cpf, int idade, boolean sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }
    public Pessoa() {
        this.nome = "João";
        this.cpf = "123.456.789-00";
        this.idade = 18;
        this.sexo = true;    
    }
    

}