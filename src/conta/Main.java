package conta;

import java.util.Scanner;

/**
 *
 * @author Krishna Xavier
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Testando Conta */
        System.out.println("___Vamos contruir uma conta___");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o nome do dono da conta: ");        
        String nome = scanner.next();
        System.out.println("Informe numero da conta: ");        
        int numeroConta = scanner.nextInt();
        System.out.println("Informe a valor do Saldo inicial: ");        
        int saldo = scanner.nextInt();
                
        Conta conta1 = new Conta(nome, numeroConta, saldo);   
        conta1.entrada();
    }
    
}
