import java.util.Scanner;

public class atv19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] codigosProdutos = {101, 202, 303, 404, 505}; 

        System.out.print("Digite o código do produto para verificar: ");
        int codigo = scanner.nextInt();
        boolean encontrado = false;

        for (int cod : codigosProdutos) {
            if (cod == codigo) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O código do produto " + codigo + " está presente no estoque.");
        } else {
            System.out.println("O código do produto " + codigo + " não foi encontrado no estoque.");
        }

        scanner.close();
    }
}
