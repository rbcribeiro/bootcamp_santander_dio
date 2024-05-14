package simulacaoBancaria;
import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        try {
            System.out.println("Digite o limite diário de saque: ");
            double limiteDiario = scanner.nextDouble();

            for (int i = 1;; i++) {
                if (!scanner.hasNextDouble()) {
                    break;
                }

                System.out.println("Digite o valor do saque " + i + " (ou 0 para encerrar): ");
                double valorSaque = scanner.nextDouble();

                if (valorSaque == 0) {
                    System.out.println("Transacoes encerradas.");
                    break;
                } else {
                    if (valorSaque <= limiteDiario) {
                        limiteDiario -= valorSaque;
                        System.out.println("Saque realizado. Limite restante: " + limiteDiario);
                    } else {
                        System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Erro: Entrada invalida.");
        } finally {
            scanner.close(); 
        }
    }
}

