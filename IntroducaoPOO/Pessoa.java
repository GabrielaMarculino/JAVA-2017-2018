package exemplotooum;

public class Pessoa {
    //Criando atributos da classe
    String nome;
    String sobrenome;
    int idade;
    
    //Criando os métodos da classe
    public void mostrarNome () {
        System.out.println("Nome: " + this.nome);
    }
    public int anoNascimento (int anoAtual) {
        return anoAtual - this.idade;
         
    }
}
