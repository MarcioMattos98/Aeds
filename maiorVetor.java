
package Recursivos;


public class maiorVetor {
    private static void exibeMaior(int vetor[], int inicio, int fim, int maior){
    if(inicio > fim){
        System.out.println(maior);
        return;
    }
        if(maior < vetor[inicio]){
            maior = vetor[inicio];
        }
        exibeMaior(vetor, inicio+1, fim, maior);
    }

    
    public static void main(String[] args) {
        int vetor[] = {1,3,5,7,9,4,11,67,55};
        exibeMaior(vetor, 0, vetor.length-1, -1);
    }
    
}
