/*Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um
motorista monitorou vários tanques cheios de gasolina registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos com inteiros) para cada tanque cheio. O programa deve calcular e exibir o consumo em quilômetros/litro para cada tanque cheio e imprimir a quilometragem combinada e a soma total de litros de combustível consumidos até esse ponto. Todos os cálculos de média devem produzir resultados de ponto flutuante.
 */
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quilometragemTotal = 0;
        int litrosTotal = 0;

        while (true) {
            System.out.println("Digite a quilometragem dirigida (ou um número negativo para encerrar): ");
            int quilometragem = scanner.nextInt();

            
            if (quilometragem < 0) {
                break;
            }

            System.out.println("Digite a quantidade de litros de gasolina consumidos: ");
            int litros = scanner.nextInt();


            if (litros <= 0) {
                System.out.println("A quantidade de litros deve ser maior que zero.");
                continue; 
            }

          
            double consumo = (double) quilometragem / litros;
            System.out.printf("Consumo do tanque atual: %.2f km/l%n", consumo);

            quilometragemTotal += quilometragem;
            litrosTotal += litros;
        }

        if (litrosTotal > 0) {
            double consumoTotal = (double) quilometragemTotal / litrosTotal;
            System.out.printf("Quilometragem combinada: %d km%n", quilometragemTotal);
            System.out.printf("Total de litros consumidos: %d l%n", litrosTotal);
            System.out.printf("Consumo médio geral: %.2f km/l%n", consumoTotal);
        } else {
            System.out.println("Nenhum dado válido foi fornecido.");
        }

        scanner.close();
    }
}
