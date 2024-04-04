import java.util.Scanner;

public class atv16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] respostas = new int[5];

        for (int i = 0; i < respostas.length; i++) {
            System.out.print("Digite a resposta " + (i + 1) + ": ");
            respostas[i] = scanner.nextInt();
        }

        System.out.println("Respostas na ordem inversa:");
        for (int i = respostas.length - 1; i >= 0; i--) {
            System.out.println("Resposta " + (i + 1) + ": " + respostas[i]);
        }

        scanner.close();
    }
}
