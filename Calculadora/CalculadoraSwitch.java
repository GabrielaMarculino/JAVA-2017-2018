
package calculadoraswitch;

import javax.swing.JOptionPane;


public class CalculadoraSwitch {

    public static void main(String[] args) {
       int num1 = 0;
       int num2 = 0;
       int opc = 0;
       
       num1= Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
       num2= Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
    
       opc= Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejda: \n"
                + "1- SOMA\n"
                + "2- SUBTRAÇÃO\n"
                + "3- DIVISÃO\n"
                + "4- MULTIPLICAÇÃO\n"
                + "5- RESTO DA DIVISÃO")); 

        switch (opc)
        {
            case 1: JOptionPane.showMessageDialog(null, "O resultado da soma é: "+ (num1+num2));
            break;
            case 2: JOptionPane.showMessageDialog(null, "O resultado da subtração é: "+ (num1-num2));
            break;
            case 3: JOptionPane.showMessageDialog(null, "O resultado da divisão é: "+ (num1/num2));
            break;
            case 4: JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: "+ (num1*num2));
            break;
            case 5: JOptionPane.showMessageDialog(null, "O resultado do resto da divisão é: "+ (num1%num2));
            break;
        }
    }
    
    
}
