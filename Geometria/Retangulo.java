
package figura;


public class Retangulo extends Quadrado{
    
    private double ladoB;
    
     @Override
    public double calcularArea() {
        double z = 0;
        z = this.getLadoA() * this.ladoB;
        return z;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    
    public Retangulo(){
        super();
    }
    public Retangulo(String NomeDaFigura, String cor, double ladoA,double ladoB) {
        this.setNomeDaFigura(NomeDaFigura);
        this.setCor(cor);
        this.setLadoA(ladoA);
        this.ladoB=ladoB;
}
}
