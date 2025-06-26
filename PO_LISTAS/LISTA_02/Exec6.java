package PO_LISTAS.LISTA_02;

/*Escreva um programa que leia um vetor de 20 posições, calcule a média dos elementos e imprima: todos os valores,
a média, o maior e o menor elemento do vetor. */

public class Exec6{
    public static void main(String[] args)
    {
        int[] vetor = new int[20];
        float media = 0;
        int menor_elemento = Integer.MAX_VALUE;
        int maior_elemento = Integer.MIN_VALUE;

        for(int i = 0; i < vetor.length; ++i)
        {
            vetor[i] = i;

            if(vetor[i] > maior_elemento)
                maior_elemento = vetor[i];
            if(vetor[i] < menor_elemento)
                menor_elemento = vetor[i];
            
            media += vetor[i];
        }
        
        for(int i = 0; i < vetor.length; ++i)
        {
            System.out.printf("%d, ", vetor[i]);
        }

        System.out.println("\nMEDIA: " + media/20);
        System.out.println("MAIOR ELEMENTO: " + maior_elemento);
        System.err.println("MENOR ELEMENTO: " + menor_elemento);

    }
}
