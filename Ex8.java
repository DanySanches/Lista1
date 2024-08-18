/*Criar uma classe Java que receba uma palavra (String) retorne uma mensagem caso a
palavra fornecida seja uma palavra que pode ser lida da esquerda pra 
direita ou da direita pra esquerda obtendo-se a mesma palavra. 
Ex.: Ana, arara, osso, etc.*/
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite qualquer palavra: ");
        String palavra = scanner.nextLine();
        StringBuilder sb = new StringBuilder(palavra);
        String reverse = sb.reverse().toString();

        if(palavra.equals(reverse)){
            System.out.printf("A palavra %s é um Palíndromo", palavra);
        }
      
        scanner.close();
    }
}
