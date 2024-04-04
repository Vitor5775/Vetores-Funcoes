import java.util.Scanner;

public class atv23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] modelos = new String[5];
        double[] consumos = new double[5];

        for (int i = 0; i < modelos.length; i++) {
            System.out.print("Informe o modelo do carro " + (i + 1) + ": ");
            modelos[i] = scanner.nextLine();
        }
        for (int i = 0; i < consumos.length; i++) {
            System.out.print("Informe o consumo do carro " + modelos[i] + " (km/l): ");
            consumos[i] = scanner.nextDouble();
        }
        int indiceMaisEconomico = 0;
        for (int i = 1; i < consumos.length; i++) {
            if (consumos[i] > consumos[indiceMaisEconomico]) {
                indiceMaisEconomico = i;
            }
        }
        System.out.println("O modelo de carro mais econômico é: " + modelos[indiceMaisEconomico]);
        System.out.println("Consumo de combustível para percorrer 1000 km:");
        for (int i = 0; i < modelos.length; i++) {
            double litrosPara1000Km = 1000 / consumos[i];
            System.out.printf("O carro %s consome %.2f litros para 1000 km.\n", modelos[i], litrosPara1000Km);
        }

        scanner.close();
    }
}
