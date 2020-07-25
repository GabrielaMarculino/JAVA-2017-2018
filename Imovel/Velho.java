package imovel;

public class Velho extends ImovelR{

    public double getDesconto() {
        return desconto=1000;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    private double desconto;
    
    public Velho(){
        this(0.0);
    }
    public Velho(double dDesconto){
        this.desconto=dDesconto;
    }
    public double Desconto(double precoAdicional){
        return precoAdicional-desconto;
    }
}
