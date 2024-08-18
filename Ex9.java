/*Escreva uma classe para calcular a área de um círculo, 
sabendo que a área é A = PI * r2, onde o raio (r) deve ser 
informado pelo usuário e o resultado terá que 
ser arredondado. */
import java.util.Scanner;

public class Ex9 {

    

    public static double Area(double raio){
       return Math.PI * Math.pow(raio, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        double area = Area(raio);
        System.out.printf("A área do círculo é %.2f cm²", area);

        scanner.close();
    }
}
