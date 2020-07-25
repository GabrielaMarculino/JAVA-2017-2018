
package figura;


public class Figura {

    public static void main(String[] args) {
           
          Circulo cCirculo=new Circulo("Thanos", "Roxo",8);
          
          Triangulo cTriangulo=new Triangulo("Thor", "Azul",8,5);
          
          Quadrado cQuadrado=new Quadrado("Homem-Aranha", "Vermelho",8);
          
          Retangulo cRetangulo=new Retangulo("Doutor Estranho", "Amarelo",8,10);
          
          System.out.println(cCirculo.calcularArea());
          System.out.println(cTriangulo.calcularArea());
          System.out.println(cQuadrado.calcularArea());
          System.out.println(cRetangulo.calcularArea());
        
    }
    
}
