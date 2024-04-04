public class atv7 {
    public static void main(String[] args) {
        double[] numeros = {1.5, 3.7, 2.8, 4.2, 0.9};

        double maior = numeros[0];
        double menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
            System.out.println("O maior valor é: " + maior);
            System.out.println("O menor valor é: " + menor);
    }
}
