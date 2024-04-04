public class atv3{
    public static void main (String[] args){
        int[] vetor = {6, 3, 23, 19, 10, 22, 2, 1, 44, 28};
        int soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        double media = (double) soma / vetor.length;

        System.out.print(" A média é :"  + media);
    }
}