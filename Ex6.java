/*Imprima produto dos números de ímpares 
de 15 a 30, usando os tipos de dados int 
e float.
*/
public class Ex6 {
    public static void main(String[] args){
        //long produtoInt = 1;
        int produtoInt = 1;
        float produtoFloat = 1.0f;

        for (int i = 15; i <= 30; i += 2){
            produtoInt *= i ;
            produtoFloat *= i;
           
        }
        System.out.println("O Produto dos números ímpares de 15 a 30: ");
        System.out.printf("int: %d%n", produtoInt);
        System.out.printf("float: %.2f%n", produtoFloat);
    }

}

/** o resultado de int dá negativo porque ultrapassa tamanho de 32 bits, para o resultado correto ser mostrado ideal é  
 utlizar long que o total do produto será 45808142625*/
