/*
Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
*/

interface ConvertStringUpper{
    String convertUppercase(String text);
}

interface ConvertStringLower{
    String convertLowercase(String text);
}

public class Exec3{
    public static void main(String[] args) {
        
        ConvertStringUpper textUppercase = (text) -> text.toUpperCase();
        ConvertStringLower textLowercase = (text) -> text.toLowerCase();

        System.out.println(textUppercase.convertUppercase("faz o l!"));
        System.out.println(textLowercase.convertLowercase("FAZ O U!"));

    }
}

