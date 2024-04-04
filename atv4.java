import java.util.Random;

public class atv4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] vetor = new int[20];
        boolean numeroEncontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(30) + 1;
            System.out.println("Vetor[" + i + "] = " + vetor[i]);
        }
        for (int num : vetor) {
            if (num == 25) {
                numeroEncontrado = true;
                break;
            }
        }

        if (numeroEncontrado) {
            System.out.println("O número 25 está presente no vetor.");
        } else {
            System.out.println("O número 25 não foi encontrado no vetor.");
        }
    }
}