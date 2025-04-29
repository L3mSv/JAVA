/*
Faça um programa que calcule o fatorial.
*/

public class Exec4{
    public static void main(String[] args) {
        
        int num = 3;

        System.out.println("FATORIAL DE " + num + " E " + FATORIAL(num));
    }

    public static int FATORIAL(int num)
    {
        if(num == 0)
        {
            return 1;
        }
        return num * FATORIAL(num - 1);
    }
}