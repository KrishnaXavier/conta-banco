package conta;

import java.util.Scanner;

public class Conta {    
    public String nome;
    public int conta;
    public int saldo;
    public boolean status;
    
    public Conta(String nome, int conta, int saldo){
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }
            
    public void deposito(int valor){        
        this.saldo +=  valor;        
    }
    
    public void entrada(){
        int n;
        int ni;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("___Menu___\n"+ 
                "0. Fim\n" +
                "1. Deposito\n" +
                "2. Saque\n" +
                "3. Saldo\n" +
                "4. Mostrar todas informações \n");                
            System.out.println("Entre com um valor correspondente: ");
            n = scanner.nextInt();
            switch(n){
                case 1:
                    System.out.println("Informe o valor do deposito: ");
                    this.deposito(scanner.nextInt());
                break;
                    
                case 2:
                   System.out.println("Informe o valor do saque: ");
                    this.saque(scanner.nextInt());                    
                break;
                    
                case 3:
                    System.out.println("Saldo: "+this.saldo());                    
                break;
                    
                case 4:
                    System.out.println(this.infs());
                break;                                                                 
                    
                default:
                    System.out.println("Valor digitado não corresponde a nem uma operação!");
                break;
            }
        }while(n!=0);
    }
    
    public int saldo(){
        return this.saldo;
    } 
    
    public boolean saque(int valor){
        if(this.saldo>=valor){
            this.saldo -= valor;
            System.out.println("Saque efuado com sucesso!");
            return true;
        }
        System.out.println("Saldo Insuficiente, impossivel fazer o saque ");
        return false;                                      
    }               
    
    public String infs(){
        return "Conta: "+this.conta+", Proprietario: "+this.nome+", Saldo atual: "+this.saldo;
    }
    
}

