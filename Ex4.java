/** Pretende-se escrever um programa que leia do teclado 
  uma distância expressa em milhas, converte-a para quilômetros 
  e apresenta o resultado no console.
  (fórmula de conversão: 1 milha = 1.609 km).
 */
import java.util.Scanner;

public class Ex4 {
     public static double milhasParaKm(double milhas){
        return milhas * 1.609;
     }

     public static void main(String[] args){
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distância em milhas: ");
        double milhas = scanner.nextDouble();
        double Km = milhasParaKm(milhas);
        System.out.printf("%.2f milhas equivale a %.2f Km", milhas,Km);
        scanner.close();
     }

     

}
