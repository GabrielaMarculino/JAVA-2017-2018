package exemplotooum;

public class Principal {

    public static void main(String[] args) {
        //Instanciando classe pessoa - criando objeto
        Pessoa p = new Pessoa ();
        //Passando valor pora os atributos 
        p.nome = "Dougras";
        p.sobrenome = "Camilo";
        p.idade = 18;
        
        //System.out.println("Nome: " + p.nome);
        p.mostrarNome();
        System.out.println("Ano nascimento: " + p.anoNascimento(2018));
        
        
        
        
        
                
        
        
    }
    
}
