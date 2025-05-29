/* 
Write a Java program to create a class called Product with private instance variables productName, 
productCode, and price. Provide public getter and setter methods to access and modify these variables. 
Add a method called applyDiscount() that takes a percentage and reduces the price by that percentage.
*/

public class Exec14 {
    public static void main(String[] args)
    {
        Product product = new Product();

        product.setProductName("Laptop");
        product.setProductCode("LT01233");
        product.setPrice(1100.0);

        System.out.printf("\nProduct Name: %s", product.getProductName());
        System.out.printf("\nProduct Code: %s", product.getProductCode());
        System.out.printf("\nPrice after discount: $%,.1f\n", product.getPrice());

        product.applyDiscount(8);
        System.out.printf("\ndiscount by 8%%\n");

        System.out.printf("\nPrice after discount: $%,.1f\n", product.getPrice());
    }
}

class Product{
    private String productName;
    private String productCode;
    private double price;

    public String setProductName(String productName)
    {
        return this.productName = productName;
    }

    public String setProductCode(String productCode)
    {
        return this.productCode = productCode;
    }

    public double setPrice(double price)
    {
        return this.price = price;
    }

    public String getProductName()
    {
        return productName;
    }

    public String getProductCode()
    {
        return productCode;
    }

    public double getPrice()
    {
        return price;
    }

    public void applyDiscount(double discount)
    {
        price -= (price*discount)/100;
    }
}