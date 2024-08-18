/** Faça um programa que receba 2 valores e retorne o maior entre eles.*/
<<<<<<< HEAD
=======

>>>>>>> 0f67f14531b894b1ad219ae4153274c9da3ce928
import java.util.Scanner;
 
public class Ex2{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a , b;
        System.out.println("Digite o primeiro valor: ");
        a = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scanner.nextInt();

        if(a > b){
            System.out.printf("O maior valor é : %d", a);
        }
        else
        {
            System.out.printf("O maior valor é : %d", b);
        }
        
        scanner.close();
    }
<<<<<<< HEAD
}
=======

}
>>>>>>> 0f67f14531b894b1ad219ae4153274c9da3ce928
