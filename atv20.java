import java.util.Arrays;
import java.util.Scanner;

public class atv20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precos = new double[10];

        for (int i = 0; i < precos.length; i++) {
            System.out.println("Digite o preço do produto " + (i + 1) + ":");
            precos[i] = scanner.nextDouble();
        }

        Arrays.sort(precos);

        System.out.println("Preços ordenados em ordem crescente:");
        for (double preco : precos) {
            System.out.println(preco);
        }

        scanner.close();
    }
}
