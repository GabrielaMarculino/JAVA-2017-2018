package hospitalsistema;

public class Enfermeiro extends Funcionario {

    private String corem;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getCorem() {
        return corem;
    }

    public void setCorem(String corem) {
        this.corem = corem;
    }

}
