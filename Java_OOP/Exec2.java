/* 
Write a Java program to create a class called "Dog" with a name and breed attribute. 
Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes
 using the setter methods and print the updated values.
*/

public class Exec2 {
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Rex", "Pitbull");
        Dog dog2 = new Dog("Snow", "Siberian Husky");

        System.out.printf("\nName: %s|Breed: %s", dog1.getName(), dog1.getBreed());
        System.out.printf("\nName: %s|Breed: %s\n", dog2.getName(), dog2.getBreed());

        dog1.setName("Void");
        dog2.setName("Naboo");

        System.out.println("\nThe names have changed!\n");

        System.out.printf("\nName: %s|Breed: %s", dog1.getName(), dog1.getBreed());
        System.out.printf("\nName: %s|Breed: %s\n", dog2.getName(), dog2.getBreed());
    }    
}

class Dog{
    private String name;
    private String breed;

    public Dog(String name, String breed)
    {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public String getName()
    {
        return name;
    }

    public String getBreed()
    {
        return breed;
    }
}
