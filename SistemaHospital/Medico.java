
package hospitalsistema;


public class Medico extends Funcionario{
    private String especialidade;
    private String crm;
    private String senhaMedico;
    

    

    public boolean logar(String senhaMedico) {
        boolean result;
        if (senhaMedico==this.senhaMedico){
            result=true;
        }else{
            result=false;
        }
        return result;
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

    
    

}
