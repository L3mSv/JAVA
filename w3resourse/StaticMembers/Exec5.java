/*
Write a Java program to create a class called Configuration with a static block that initializes a static variable 'configValue' from a configuration file (simulated with a default value). Print the value of 'configValue' in the main method.
*/

public class Exec5 {
    public static void main(String[] args)
    {
        System.out.printf("ConfigValue: %s", Configuration.configValue);
    }
}


class Configuration{
    static String configValue;

    static{
        configValue = "Default Value";
        System.out.println("ConfigValue Executed\n");
    }
}