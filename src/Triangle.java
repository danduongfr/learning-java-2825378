public class Triangle {

    // Properties
    private static int nbOfSides = 3;

    private double base;
    private double height;
    private double side1, side2, side3;

    //Constructor
    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Static methods
    public static int nbOfSides(){
        return nbOfSides;
    }
    public static double calculateArea(double base, double height) {
        return base * height / 2;
    }

    // Instance methods
    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public double getSide() {
        return this.base;
    }

    public double getArea (){
        return (this.base * this.height)/2;
    }

}
