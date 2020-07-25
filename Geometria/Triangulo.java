package figura;

public class Triangulo extends Figura2 {

    private double base;
    private double altura;

    @Override
    public double calcularArea() {
        double y = 0;
        y = (base * altura) / 2;
        return y;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Triangulo() {
        super();
    }

    public Triangulo(String NomeDaFigura, String cor, double base, double altura) {
        this.setNomeDaFigura(NomeDaFigura);
        this.setCor(cor);
        this.base = base;
        this.altura = altura;

    }

}
