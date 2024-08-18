//Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, usando os tipos de dados int e double .
public class Ex7 {
    public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				int result1 = i / 2;
				double result2 = (double)  i / 2;
				System.out.printf(" %d , int: %d , double: %.2f%n", i, result1, result2);
			}

		}
	}
}
