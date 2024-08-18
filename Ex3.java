
/**Crie uma classe e na função main() implemente um programa que 
 lê um número inteiro do teclado e imprime todos os números primos 
 menores que ele (divisíveis por 1 ou por ele mesmo).
*/
import java.util.Scanner;

public class Ex3 {

    int a;

    public static boolean Primo(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int a = scanner.nextInt();
        System.out.println("Números primos menores que " + a + ":");
        for (int i = 2; i < a; i++) {
            if (Primo(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

}
