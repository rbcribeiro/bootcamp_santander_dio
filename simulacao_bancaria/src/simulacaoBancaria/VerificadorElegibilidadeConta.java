package simulacaoBancaria;

import java.util.Scanner;

public class VerificadorElegibilidadeConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        try {
            System.out.println("Digite a idade: ");
            int idade = scanner.nextInt();
            verificarIdade(idade);
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        } catch (IllegalArgumentException e) {
            System.out.println(": " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void verificarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Voce nao esta elegivel para criar uma conta bancaria.");
        }
    }
}
