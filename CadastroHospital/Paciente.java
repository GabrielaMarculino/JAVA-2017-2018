package exercício_too_agosto;

public class Paciente extends Pessoa {

    private int codPaciente;
    private String senhaPaciente;

    public boolean logar(String senha) {
        return true;
    }

    public int getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(int codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getSenhaPaciente() {
        return senhaPaciente;
    }

    public void setSenhaPaciente(String senhaPaciente) {
        this.senhaPaciente = senhaPaciente;
    }

}
