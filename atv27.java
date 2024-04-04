public class atv27 {
    private int[] arrayNumerico;
    private boolean[] podeModificar;

    public atv27(int tamanho) {
        arrayNumerico = new int[tamanho];
        podeModificar = new boolean[tamanho];
        for (int i = 0; i < tamanho; i++) {
            podeModificar[i] = true;
        }
    }
    public void modificarElemento(int indice, int novoValor) {
        if (podeModificar[indice]) {
            arrayNumerico[indice] = novoValor;
            podeModificar[indice] = false; 
        }
    }
    public void imprimirArray() {
        for (int i = 0; i < arrayNumerico.length; i++) {
            System.out.println("Elemento " + i + ": " + arrayNumerico[i] +
                               " (Pode modificar? " + podeModificar[i] + ")");
        }
    }
    public static void main(String[] args) {
        atv27 meuArray = new atv27(5);
        for (int i = 0; i < 5; i++) {
            meuArray.modificarElemento(i, i * 2); 
        }
        for (int i = 0; i < 5; i++) {
            meuArray.modificarElemento(i, i * 3); 
        }
        meuArray.imprimirArray();
    }
}
