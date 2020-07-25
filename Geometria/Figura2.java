package figura;

public abstract class Figura2 {
    private String NomeDaFigura;
    private String cor;
    
    public Figura2(){
        this("","");
               
    }
    public Figura2(String fNomeDaFigura, String fCor){
     this.NomeDaFigura="";
     this.cor="";
    }
    
   public String getNomeDaFigura(){
    return this.NomeDaFigura;
}
   public String getCor(){
       return this.cor;
   }
   
   public void setNomeDaFigura(String nomeDaFigura){
       this.NomeDaFigura=NomeDaFigura;
   }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public double calcularArea(){
        double x=0;
        return x;
    }
}
