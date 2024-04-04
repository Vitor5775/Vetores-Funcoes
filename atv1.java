public class atv1 {
    public static void main(String[] args) {
        int[] vetor = {29, 13, 10, 24, 17, 3, 5, 7, 9, 31}; 
        System.out.println("Números primos no vetor e suas posições:");

        for (int i = 0; i < vetor.length; i++) {
            if (isPrime(vetor[i])) {
                System.out.println("Número " + vetor[i] + " na posição " + i);
            }
        }
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
