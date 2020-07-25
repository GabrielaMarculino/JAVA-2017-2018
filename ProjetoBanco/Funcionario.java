package too_projeto_setembro;

public class Funcionario extends Pessoa{

    private int codFuncionario;
    public String senhaFuncionario;
    private Banco banco;

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
    @Override
    public void MostrarDados(){
        System.out.println("Nome: " + this.getNome() + " " + this.getSobrenome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Cod; Funcionáis: " + this.codFuncionario);
        System.out.println("Banco: " + banco.getNome());
    }
    
}
