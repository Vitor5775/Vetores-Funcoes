public class atv26 {

    public static void calcularEImprimirMedia(int[] notas) {
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        double media = (double) soma / notas.length;
        System.out.println("A média das notas é: " + media);
    }
    public static void main(String[] args) {
        int[] notasTurma = {90, 70, 80, 100, 65};
        calcularEImprimirMedia(notasTurma);
    }
}
