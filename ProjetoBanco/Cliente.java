package too_projeto_setembro;

import java.util.ArrayList;


public class Cliente extends Pessoa implements IDados{
    private int nr_cliente;
    private double saldo;
    private String tipoConta;
    private ArrayList<Banco> banco = new ArrayList<Banco>();

    public int getNr_cliente() {
        return nr_cliente;
    }

    public void setNr_cliente(int nr_cliente) {
        this.nr_cliente = nr_cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    
        @Override
        public void MostrarDados(){
        System.out.println("Nome: " + this.getNome() + " " + this.getSobrenome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Num. Cliente: " + this.nr_cliente);
        System.out.println("Tipo Conta: " + this.tipoConta);
        System.out.println("Saldo: " + this.saldo);
    }
    
        public void MostrarConta(){
            System.out.println("Conta: " + this.tipoConta);
        }
        
        public void Deposita(double valor){
            this.saldo += valor;
        }
        
        public void Saca(double valor){
            if(this.saldo>= valor){
                this.saldo -= valor;
            }
        }
}
