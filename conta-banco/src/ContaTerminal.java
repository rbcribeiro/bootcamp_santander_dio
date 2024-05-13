import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Por favor, digite o número da Agência: ");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o número da sua Conta: ");
            int numeroConta = scanner.nextInt();

            System.out.println("Por favor, digite o seu saldo: ");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco!");
            System.out.println("Sua agência é " + agencia + ", conta número " + numeroConta + ".");
            System.out.println("Seu saldo de " + saldo + " já está disponivel em sua conta.");
        }
    }
}