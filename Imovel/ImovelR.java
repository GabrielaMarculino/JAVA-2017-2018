package imovel;

public class ImovelR {
    private String endereco;

    public String getEndereco() {
        return endereco="Rua dos Anjos";
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco=8000000;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    private double preco;
    
    public ImovelR(){
    this(" ",0.0);
}
    public ImovelR(String eEndereco, double pPreco){
        this.endereco=eEndereco;
        this.preco=pPreco;
    }
    public static void mostrarDados(ImovelR m){
        
        System.out.println("Dados referente ao Imóvel");  
        System.out.println("Endereço: "+m.getEndereco());         
        System.out.println("Preço:" +m.getPreco());        
        
                        
    }
}
