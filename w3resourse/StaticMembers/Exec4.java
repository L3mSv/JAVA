/*
Write a Java program to create a class called Constants with a static final variable 'PI' initialized to 3.14159. Create a method to calculate the area of a circle given its radius, using the 'PI' constant. Demonstrate the method in the main method.
*/

public class Exec4 {
    @SuppressWarnings("static-access")
    public static void main(String[] args){
        Constants circle = new Constants();
        double radius = 12;
        double angle = (4*Constants.PI/3);

        System.out.printf("\nThe area of circle with radius %.1f and angle %.1f is %.1f ",  radius, angle, circle.CircleArea(radius, angle));
    }
}

class Constants{
    static final double PI = 3.14159;

    public static final double CircleArea(double radius, double angle){
        return (angle/2) * Math.pow(radius, 2);
    }
}