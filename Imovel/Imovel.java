package imovel;

public class Imovel {

    public static void main(String[] args, ImovelR m) {
        System.out.println("***** DADOS DO IMÓVEL *****");
        ImovelR i= new ImovelR();
        i.setEndereco("Av. Canadá");
        i.setPreco(10000000);
        ImovelR.mostrarDados(m);
        
        Novo n= new Novo();
        n.setPrecoAdicional(80000);
        
        Velho v= new Velho();
        v.setDesconto(800);
    }
    
}
