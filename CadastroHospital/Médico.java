package exercício_too_agosto;

public class Médico extends Pessoa {

    private String especialidade;
    private String crm;
    private String senhaMedico;
    private double salario;

    public Médico() {
        this.salario = salario;
    }

    public boolean logar(String senhaMedico) {
        return true;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getSenhaMedico() {
        return senhaMedico;
    }

    public void setSenhaMedico(String senhaMedico) {
        this.senhaMedico = senhaMedico;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
