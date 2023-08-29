public class CircleMain {
    public static void main(String[] args) {
         Circle circleProp = new Circle(1.0,"red");
        double area = circleProp.getArea();
        //System.out.println("The area is: " + circleProp.getArea());
        System.out.println("The radius is: " + circleProp.getRadius());
        System.out.println("The colour is: " + circleProp.getColour());
        System.out.println("The area of the circle is: " + circleProp.getArea());

    }
}


