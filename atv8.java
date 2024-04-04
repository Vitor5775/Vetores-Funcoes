import java.util.Random;

public class atv8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[vetorA.length - 1 - i];
        }

        System.out.print("Vetor A: ");
        for (int valor : vetorA) {
            System.out.print(valor + " ");
        }
        System.out.println();

        System.out.print("Vetor B (reverso de A): ");
        for (int valor : vetorB) {
            System.out.print(valor + " ");
        }
    }
}
