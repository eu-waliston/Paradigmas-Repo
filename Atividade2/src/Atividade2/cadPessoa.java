package Atividade2;

public class cadPessoa {
    String nome;
    int idade;
    String sexo;
    String nacionalidade;

    public cadPessoa() {
    }

    public cadPessoa(String nome, int idade, String sexo, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
