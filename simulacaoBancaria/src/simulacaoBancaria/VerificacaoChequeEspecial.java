package simulacaoBancaria;
import java.util.Scanner;

public class VerificacaoChequeEspecial { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        try {
            System.out.println("Digite o saldo disponível na conta: ");
            double saldo = scanner.nextDouble(); 

            System.out.println("Digite o valor do saque: ");
            double saque = scanner.nextDouble(); 
            
            double limiteChequeEspecial = 500; 

            if (saque <= saldo) {
                saldo -= saque;
                System.out.println("Transacao realizada com sucesso.");
            } else {
                if (saque <= saldo + limiteChequeEspecial) {
                    System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
                } else {
                    System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
                }
            }
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida.");
        } finally {
            scanner.close(); 
        }
    }
}
