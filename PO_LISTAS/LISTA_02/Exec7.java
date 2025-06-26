package PO_LISTAS.LISTA_02;

/*Faça um programa que leia um vetor X(15 posições) de inteiros e imprima a quantidade de valores pares em X. */

public class Exec7 {
    public static void main(String[] args)
    {
        int[] vetor = new int[15];

        for(int i = 0; i < vetor.length; ++i)
        {
            vetor[i] = i;
            
            if(vetor[i]%2 != 0)
                System.out.println(vetor[i] + " IMPAR");
            else
                System.out.println(vetor[i] + " PAR");
        }
        
    }
}
