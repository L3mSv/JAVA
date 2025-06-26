package PO_LISTAS.LISTA_02;

/*Escreva um programa que inicialize uma matriz identidade de ordem 5 e exiba-a na tela
(com o formato matricial). */

public class Exec11 {
    public static void main(String[] args) {
        {
            int[][] matriz = new int[5][5];

            for(int i = 0; i < matriz.length; ++i)
            {
                for(int j = 0; j < matriz[i].length; ++j)
                {
                    matriz[i][j] = i * matriz[i].length + j;
                }
            }

            for(int i = 0; i < matriz.length; ++i)
            {
                for(int j = 0; j < matriz[i].length; ++j)
                {
                    System.out.printf("%d, ", matriz[i][j]);
                }

                System.out.println("");
            }
        }
    }
}
