import java.util.Scanner;

public class atv15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo N para gerar a sequência de Fibonacci: ");
        int N = scanner.nextInt();

        int primeiroTermo = 0;
        int segundoTermo = 1;
        int proximoTermo;

        System.out.println("Sequência de Fibonacci até " + N + " termos:");
        for (int i = 1; i <= N; ++i) {
            System.out.print(primeiroTermo + " ");

            proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        scanner.close();
    }
}
