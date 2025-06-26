package PO_LISTAS.LISTA_02;
import java.util.Arrays;
import java.util.Scanner;

/* Escreva um programa que pergunte ao usuário quantos números ele deseja digitar, logo após, imprima todos os
números na sequência informada e todos os números ordenados.(ordem crescente). Obs.: Difícil imprimir em ordem
decrescente? */

public class Exec8 {
    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            System.out.println("Digite a quantidade de elementos desejada para o seu vetor: ");
            int n = scanner.nextInt();

            int[] vetor = new int[n];

            for(int i = 0; i < vetor.length; ++i)
            {
                System.out.println("\nDigite o elemento da posicao " + i + " do seu vetor: ");
                int prox_elemento = scanner.nextInt();
                vetor[i] = prox_elemento;
            }

            System.out.println("\nVETOR ORIGINAL:");
            for(int i = 0; i < vetor.length; ++i)
            {
                System.out.printf(" %d, ", vetor[i]);
            }

            Arrays.sort(vetor);

            System.out.println("\nVETOR CRESCENTE:");
            for(int i = 0; i < vetor.length; ++i)
            {
                System.out.printf(" %d, ", vetor[i]);
            }

            System.out.println("\nVETOR DECRESCENTE:");
            for(int i = vetor.length - 1; i >= 0; --i)
            {
                System.out.printf(" %d, ", vetor[i]);
            }
        }
    }    
}
