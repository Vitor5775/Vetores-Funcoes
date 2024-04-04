import java.util.Scanner;

public class atv14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de etapas de produção: ");
        int etapas = scanner.nextInt();

        int tempoTotal = etapas * 30;

        System.out.println("O tempo total de produção é: " + tempoTotal + " minutos.");

        scanner.close();
    }
}
