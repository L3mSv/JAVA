/* 
Write a Java program to create a class called Car with private instance variables company_name, model_name, 
year, and mileage. 
Provide public getter and setter methods to access and modify the company_name, model_name, and year variables. 
However, only provide a getter method for the mileage variable.
*/

public class Exec6 {
    public static void main(String[] args)
    {
        Car car = new Car();

        car.setCompanyName("Lamborghini");
        car.setModelName("Urus");
        car.setYear(2018);
        car.setMileage(60);

        System.out.printf("\nCompany: %s", car.getCompanyName());
        System.out.printf("\nModel: %s", car.getModelName());
        System.out.printf("\nYear: %d", car.getYear());
        System.out.printf("\nMileage: %.1f km\\h\n", car.getMileage());
    }
}

class Car{
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    public String setCompanyName(String company_name)
    {
        return this.company_name = company_name;
    }

    public String setModelName(String model_name)
    {
        return this.model_name = model_name;
    }

    public int setYear(int year)
    {
        return this.year = year;
    }

    public double setMileage(double mileage)
    {
        return this.mileage = mileage;
    }

    public String getCompanyName()
    {
        return company_name;
    }

    public String getModelName()
    {
        return model_name;
    }

    public int getYear()
    {
        return year;
    }

    public double getMileage()
    {
        return mileage;
    }
}