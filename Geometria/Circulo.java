package figura;

public class Circulo extends Figura2 {

    private double raio;

    @Override
    public double calcularArea() {
        double x;
        x = 3.14 * (this.raio * this.raio);
        return x;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public Circulo(){
        super();
    }
    public  Circulo (String NomeDaFigura, String cor, double raio){
        this.setNomeDaFigura(NomeDaFigura);
        this.setCor(cor);
        this.raio=raio;
        
    }

}
