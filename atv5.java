import java.util.Random;
public class atv5 {
    public static void main (String[] args) {
        Random rand = new Random();
        int[] vetor = new int[15];
        int indeceDo20 = -1;

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = rand.nextInt(50) + 1;
            System.out.println("Vetor[" + i + "] = " + vetor[i]);

            if (vetor[i] == 20){
                indeceDo20 = i;
            }
        }
            if  (indeceDo20 != -1) {
                System.out.print("O número 20 foi encontrado no índice: " + indeceDo20);
            } else {
                System.out.print("O número 20 não está presente no vetor.");
            }
               
    }
}