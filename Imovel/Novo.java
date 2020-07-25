package imovel;

public class Novo extends ImovelR {

    public double getPrecoAdicional() {
        return precoAdicional = 80.000;
    }

    public void setPrecoAdicional(double precoAdicional) {
        this.precoAdicional = precoAdicional;
    }
    private double precoAdicional;

    public Novo() {
        this(0.0);

    }

    public Novo(double pPrecoAdicional) {
        this.precoAdicional = pPrecoAdicional;
    }

    public String mostrarPrecoAdicional() {
        String mensagem;
        mensagem = "O preço adicional é: " + precoAdicional;
        return mensagem;
    }
}
