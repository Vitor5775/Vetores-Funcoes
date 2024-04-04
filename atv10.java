import java.util.Scanner;

public class atv10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número inteiro para a tabuada: ");
        int numero = scanner.nextInt();
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
    }
}