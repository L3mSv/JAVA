

/*
Faça um programa que verifique se um número é primo.
*/

public class Exec3{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5, 6};

        for(int num : array)
        {
            if(E_PRIMO(num))
            {
                System.out.println(num + " e numero primo!\n");
            }
        }
    }

    public static boolean E_PRIMO(int num)
    {
        if(num <= 1)
        {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); ++i)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}