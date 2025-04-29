/*
Faça um programa para calcular a média aritmética de duas
notas. Também calcule e apresente a nota ponderada,
considerando peso 2 e 3, respectivamente.
*/

public class Exec1{
    public static void main(String[] args) {
        float nota1 = 4;
        float nota2 = 5;

        float media_aritmetica = (nota1 + nota2)/2;
        float meida_ponderada = ((nota1 * 2) + (nota2 * 3))/5;

        System.out.println("MEDIA ARITMETICA: " + media_aritmetica);
                System.out.println("MEDIA PONDERADA: " + meida_ponderada);
    }
}