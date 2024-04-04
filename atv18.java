import java.util.Scanner;

public class atv18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maiorTemperatura = Double.MIN_VALUE; 
        System.out.println("Digite 8 valores de temperatura:");

        for (int i = 1; i <= 8; i++) {
            System.out.print("Temperatura " + i + ": ");
            double temperatura = scanner.nextDouble();
            if (temperatura > maiorTemperatura) {
                maiorTemperatura = temperatura;
            }
        }

        System.out.println("A maior temperatura registrada é: " + maiorTemperatura);

        scanner.close();
    }
}
