/* 
Write a Java program to create a class called Smartphone with private instance variables brand, model, and 
storageCapacity. Provide public getter and setter methods to access and modify these variables. 
Add a method called increaseStorage() that takes an integer value and increases the storageCapacity by that value.
*/

public class Exec9 {
    public static void main(String[] args)
    {
        Smartphone smartphone = new Smartphone();

        smartphone.setBrand("SmartMobile");
        smartphone.setModel("W1000");
        smartphone.setStorageCapacity(128);

        System.out.printf("\nBrand: %s", smartphone.getBrand());
        System.out.printf("\nModel: %s", smartphone.getModel());
        System.out.printf("\nStorage Capacity: %dGB\n", smartphone.getStorageCapacity());

        System.out.println("\nStorage Capacity Update!\n");

        smartphone.increaseStorage(128);
        System.out.printf("Storage Capacity: %dGB", smartphone.getStorageCapacity());

    }    
}

class Smartphone{
    private String brand;
    private String model;
    private int storageCapacity;

    public String setBrand(String brand)
    {
        return this.brand = brand;
    }

    public String setModel(String model)
    {
        return this.model = model;
    }

    public int setStorageCapacity(int storageCapacity)
    {
        return this.storageCapacity = storageCapacity;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public int getStorageCapacity()
    {
        return storageCapacity;
    }

    public void increaseStorage(int increase)
    {
        storageCapacity += increase;
    }
}
