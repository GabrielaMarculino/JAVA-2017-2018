package figura;

public class Quadrado extends Figura2 {

    private double ladoA;

    @Override
    public double calcularArea() {
        double y = 0;
        y = ladoA * ladoA;
        return y;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public Quadrado() {
        super();
    }

    public Quadrado(String NomeDaFigura, String cor, double ladoA) {
        this.setNomeDaFigura(NomeDaFigura);
        this.setCor(cor);
        this.ladoA = ladoA;

    }
}
