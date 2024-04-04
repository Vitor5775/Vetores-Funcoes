import java.util.Scanner;

public class atv21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] entradas = new double[5];
        double[] saidas = new double[5];
        double saldo = 0;

        // Lendo os valores de entrada
        System.out.println("Digite os valores de entrada:");
        for (int i = 0; i < entradas.length; i++) {
            entradas[i] = scanner.nextDouble();
            saldo += entradas[i]; // Somando ao saldo
        }

        // Lendo os valores de saída
        System.out.println("Digite os valores de saída:");
        for (int i = 0; i < saidas.length; i++) {
            saidas[i] = scanner.nextDouble();
            saldo -= saidas[i]; // Subtraindo do saldo
        }

        // Imprimindo o saldo final
        System.out.println("O saldo final é: " + saldo);

        scanner.close();
    }
}
