package hospitalsistema;

import java.util.ArrayList;

public class Hospital {

    private String nome;
    private String endereco;
    private ArrayList<Funcionario> Funcionario = new ArrayList();
    private ArrayList<Paciente> Paciente = new ArrayList();
    private ArrayList<ProntoSocorro> ProntoSocorro = new ArrayList();

    public void addFuncionarios(Funcionario fun) {
        this.Funcionario.add(fun);
    }

    public void addPacientes(Paciente pa) {
        this.Paciente.add(pa);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return Funcionario;
    }

    public ArrayList<Paciente> getPacientes() {
        return Paciente;
    }

    public ArrayList<ProntoSocorro> getFiliais() {
        return ProntoSocorro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Funcionario> getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(ArrayList<Funcionario> Funcionario) {
        this.Funcionario = Funcionario;
    }

    public ArrayList<Paciente> getPaciente() {
        return Paciente;
    }

    public void setPaciente(ArrayList<Paciente> Paciente) {
        this.Paciente = Paciente;
    }

    public ArrayList<ProntoSocorro> getProntoSocorro() {
        return ProntoSocorro;
    }

    public void setProntoSocorro(ArrayList<ProntoSocorro> ProntoSocorro) {
        this.ProntoSocorro = ProntoSocorro;
    }

    public void listarFuncionario(Funcionario f, Pessoa p) {

        for (Funcionario funcionario : Funcionario) {
            System.out.println("Nome : " + p.getNome() + " " + p.getSobrenome());
            System.out.println("CPF : " + p.getCPF());
            System.out.println("RG : " + p.getRG());
            System.out.println("Codigos : " + f.getCodFuncionario());
            System.out.println("Salario : " + f.getSalario());
            System.out.println("\n");
        }
    }

    public void listarPaciente(Paciente pa, Pessoa p) {
        for (Paciente paciente : Paciente) {
            System.out.println("Nome : " + p.getNome() + " " + p.getSobrenome());
            System.out.println("Codigo : " + pa.getCodPaciente());
            System.out.println("\n");
        }
    }

    public void listarProntoSocorro(ProntoSocorro p) {
        for (ProntoSocorro prontoSocorro : ProntoSocorro) {
            System.out.println("Codigo : " + p.getCodProntoSocorro());
            System.out.println("Endereço : " + p.getEndereco());
            System.out.println("\n");
        }
    }

}
