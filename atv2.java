public class atv2 {
    public static void main(String[] args) {
        int[] vetorA = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; 
        int[] vetorB = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; 
        int[] vetorIntercalado = new int[vetorA.length + vetorB.length]; 

        int indiceA = 0, indiceB = 0, indiceIntercalado = 0;
        while (indiceA < vetorA.length && indiceB < vetorB.length) {
            vetorIntercalado[indiceIntercalado++] = vetorA[indiceA++];
            vetorIntercalado[indiceIntercalado++] = vetorB[indiceB++];
        }
        System.out.println("Vetor resultante da intercalação:");
        for (int i = 0; i < vetorIntercalado.length; i++) {
            System.out.print(vetorIntercalado[i] + " ");
        }
    }
}
