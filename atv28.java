import java.util.Scanner;

public class atv28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precos = new double[10];
        int[] quantidades = new int[10];
        @SuppressWarnings("unused")
        double salarioBase = 545.00;
        double totalVendas = 0;
        int maisVendidoIndex = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o valor unitário do objeto " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
            System.out.print("Informe a quantidade vendida do objeto " + (i + 1) + ": ");
            quantidades[i] = scanner.nextInt();
            if (quantidades[i] > quantidades[maisVendidoIndex]) {
                maisVendidoIndex = i;
            }
            totalVendas += precos[i] * quantidades[i];
        }
        System.out.println("\nRelatório de Vendas:");
        for (int i = 0; i < 10; i++) {
            double valorTotal = precos[i] * quantidades[i];
            System.out.printf("Objeto %d: Quantidade Vendida: %d, Valor Unitário: R$%.2f, Valor Total: R$%.2f\n",
                    (i + 1), quantidades[i], precos[i], valorTotal);
        }
        double comissao = totalVendas * 0.05;
        System.out.printf("\nValor geral das vendas: R$%.2f\n", totalVendas);
        System.out.printf("Comissão do vendedor: R$%.2f\n", comissao);
        System.out.printf("\nO objeto mais vendido foi o número %d, com %d unidades vendidas.\n",
                (maisVendidoIndex + 1), quantidades[maisVendidoIndex]);

        scanner.close();
    }
}
