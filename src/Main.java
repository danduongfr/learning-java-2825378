public class Main {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        System.out.println("Triangle A area is " + triangleA.getArea());
        System.out.println("Triangle B area is " + triangleB.getArea());
        System.out.println("");

        System.out.println("Using class instance method ");
        System.out.println("Triangle A base is " + triangleA.getBase());
        System.out.println("Triangle A side 1 is " + triangleA.getSide1());
        System.out.println("");

        System.out.println("Using class static method ");
        System.out.println("Triangle A side 1 is " + Triangle.calculateArea(15, 8));
        System.out.println("");

        System.out.println("Using class static variable ");
        System.out.println("Triangle has " + Triangle.nbOfSides() + " sides");
        System.out.println("");
    }

}
