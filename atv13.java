import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro N para encontrar todos os números primos até N: ");
        int N = scanner.nextInt();

        System.out.println("Números primos menores ou iguais a " + N + ":");
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
