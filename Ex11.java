/* Escreva um programa que tenha duas palavras
 como entrada, e a saída imprima as palavras em ordem alfabética 
  (utilize o método compareTo da classe String),. Informe também, qual das palavras tem o maior número de caracteres.
 */

import java.util.Scanner;

public class Ex11 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.println("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        if (palavra1.compareTo(palavra2) < 0) {
            System.out.println("Ordem alfabética:");
            System.out.println(palavra1);
            System.out.println(palavra2);
        } else {
            System.out.println("Ordem alfabética:");
            System.out.println(palavra2);
            System.out.println(palavra1);
        }

        if (palavra1.length() > palavra2.length()) {
            System.out.printf("A palavra com mais caracteres é \"%s\" com %d caracteres.%n", palavra1, palavra1.length());
        } else if (palavra1.length() < palavra2.length()) {
            System.out.printf("A palavra com mais caracteres é \"%s\" com %d caracteres.%n", palavra2, palavra2.length());
        } else {
            System.out.println("As duas palavras têm o mesmo número de caracteres.");
        }

        scanner.close();
    }
}
