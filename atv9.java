import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de recibos que deseja imprimir: ");
        int quantidade = scanner.nextInt();
        int numeroDoRecibo = 1;

        while (numeroDoRecibo <= quantidade) {
            System.out.println("Recibo número: " + numeroDoRecibo);
            numeroDoRecibo++;
        }

        scanner.close();
    }
}
