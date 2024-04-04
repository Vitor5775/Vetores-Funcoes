import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

    public class atv6 {
    public static void main (String[] args) {
        ArrayList<Integer> vetor = new ArrayList<>();
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in); 
        
         for (int i = 0; i< 30; i++) {
            vetor.add(rand.nextInt(100) + 1);

         }
         System.out.println("Digite o valor para verificar o vetor: ");
         
         int valor = scanner.nextInt();

         if (vetor.contains(valor)) {
            vetor.remove(Integer.valueOf(valor));
            System.out.println("O valor " + valor + " foi removido do vetor");

         } else {
            System.out.print("O valor " + valor + " Não foi encontrado no vetor");
         }
         scanner.close();

    }
}
    