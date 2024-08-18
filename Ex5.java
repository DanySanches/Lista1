/** Faça um programa que solicite ao usuário um 
 número de 1 a 7, e imprima na tela o dia da semana correspondente.
Suponha que Segunda corresponde a 1 , Terça corresponde a 2, 
e assim por diante. Utilizando Array.
 */
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] dias = {"Segunda-Feira", "Terça-Feira", "Quarta-Feira",
                       "Quinta-Feira", "Sexta-Feira", "Sábado","Domingo"};
        
        System.out.println("Digite um número de 1 a 7");
        int n =scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println(dias[n-1]);
                break;
            case 2:
                System.out.println(dias[n-1]);
                break;
            case 3:
                System.out.println(dias[n-1]);
                break;
            case 4:
                System.out.println(dias[n-1]);
                break;
            case 5:
                System.out.println(dias[n-1]);
                break;
            case 6:
                System.out.println(dias[n-1]);
                break;
            case 7:
                System.out.println(dias[n-1]);
                break;        
            default:
                System.out.println("Insira um número válido.");
                break;
        }
        
            

        scanner.close();
        
    }
}