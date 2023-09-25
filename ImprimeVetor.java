package imprimevetor;

public class ImprimeVetor {

    private static void imprimeElementosVetor(int[] v, int inicial, int fim) {
        if (inicial <= fim) {
            System.out.println(v[inicial]);
            imprimeElementosVetor(v, inicial + 1, fim);
        }
    }

    public static void main(String[] args) {
        int v[] = {1, 3, 5, 4, 8, 9};
        imprimeElementosVetor(v, 0, v.length - 1);
    }

}
