package hospitalsistema;

public class Paciente extends Pessoa {

    private int codPaciente;
    //private arrayList<Hospital>
    private String senhaPaciente;

    public boolean logar(String senha) {
        boolean result;
        if (senha == this.senhaPaciente) {
            result = true;
        }else{
            result = false;
        }
        return result;
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
