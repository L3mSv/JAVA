/*
Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea(). 
Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and 
surface area of each shape.
*/

public class Exec6 {
    public static void main(String[] args)
    {
        Sphere sphere = new Sphere(7);
        Cube cube = new Cube(6);

        System.out.printf("\nSphere Volume: %.1f", sphere.calculateVolume());
        System.out.printf("\nSphere Surface Area: %.1f", sphere.calculateSurfaceArea());
        System.out.printf("\nCube Volume: %.1f", cube.calculateVolume());
        System.out.printf("\nCube Surface Area: %.1f\n", cube.calculateSurfaceArea());
    }
}

abstract class Shape3D{


    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
}

class Sphere extends Shape3D{

    private double radius;

    public Sphere(double radius)
    {
        this.radius = radius;
    }


    @Override
    public double calculateVolume()
    {
        return (4*Math.PI*Math.pow(radius,3))/3;
    }

    @Override
    public double calculateSurfaceArea()
    {
        return 4*Math.PI*Math.pow(radius,2);
    }
}

class Cube extends  Shape3D{

    private double edge;

    public Cube(double edge)
    {
        this.edge = edge;
    }

    @Override
    public double calculateVolume()
    {
        return Math.pow(edge, 3);
    }

    @Override
    public double calculateSurfaceArea()
    {
        return 6 * Math.pow(edge, 2);
    }
}

