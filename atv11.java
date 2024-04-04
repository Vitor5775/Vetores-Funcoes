import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[10];
        double soma = 0;

        System.out.println("Digite 10 valores de temperatura:");

        // Leitura das temperaturas
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Temperatura " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }

        // Calcula a média das temperaturas
        double media = soma / temperaturas.length;

        // Exibe a média das temperaturas
        System.out.println("A temperatura média é: " + media);

        scanner.close();
    }
}
