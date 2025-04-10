/* 
Write a Java program to create a class called Desktop with private instance variables brand, processor, 
and ramSize. Provide public getter and setter methods to access and modify these variables. 
Add a method called upgradeRam() that takes an integer value and increases the ramSize by that value.
*/

public class Exec10 {
    public static void main(String[] args) {
        
        Desktop desktop = new Desktop();

        desktop.setModel("ComputerMaster");
        desktop.setProcessor("Intel Core i7");
        desktop.setRamSize(64);

        System.out.printf("\nModel: %s", desktop.getModel());
        System.out.printf("\nProcessor: %s", desktop.getProcessor());
        System.out.printf("\nRam Size: %dGB\n", desktop.getRamSize());

        System.out.println("\nRam Size Update!\n");

        desktop.upgradeRam(64);
        System.out.printf("\nRam Size: %dGB\n", desktop.getRamSize());
    }   
}

class Desktop{
    private String model;
    private String processor;
    private int ramSize;

    public String setModel(String model)
    {
        return this.model = model;
    }

    public String setProcessor(String processor)
    {
        return this.processor = processor;
    }

    public int setRamSize(int ramSize)
    {
        return this.ramSize = ramSize;
    }

    public String getModel()
    {
        return model;
    }

    public String getProcessor()
    {
        return processor;
    }

    public int getRamSize()
    {
        return ramSize;
    }

    public void upgradeRam(int ramSize)
    {
        this.ramSize += ramSize;
    }
}