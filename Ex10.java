/* Escreva uma classe que conte a quantidade de vogais, 
espaços em brancos e consoantes de uma cadeia de caracteres.*/
import java.util.Scanner;


public class Ex10 {
    public static void contarString(String texto) {
        int contVogais = 0;
        int contConsoantes = 0;
        int contEspacos = 0 ;

        String vogais = "aeiouáéíóúãõâêîôûàèìòùäëïöü";
    
        texto = texto.toLowerCase();

        for(char c:texto.toCharArray()){
            if(Character.isWhitespace(c)){
                contEspacos++;
            }else if (vogais.indexOf(c) != -1){
                contVogais++;
            }else if (Character.isLetter(c)){
                contConsoantes++;
            }
        }
        System.out.println("Quantidade de vogais: " + contVogais);
        System.out.println("Quantidade de espaços em branco: " + contEspacos);
        System.out.println("Quantidade de consoantes: " + contConsoantes);
    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String texto = scanner.nextLine();
        contarString(texto);
        scanner.close();
    }
    
    
}
