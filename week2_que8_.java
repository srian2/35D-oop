public class week2_que8_ {
    public static void main(String[] args) {
        // To take side of a square from user and print area and perimeter of it. 
        // Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. 
        // Take the attributes as user input, you can use the following code:


        double side = 5; 
        double areaOfSquare = side * side;
        double perimeterOfSquare = 4 * side;
        System.out.println("Area of Square: " + areaOfSquare);
        System.out.println("Perimeter of Square: " + perimeterOfSquare);

        double principleAmount = 1000; 
        int time = 2;
        double rate = 5; 
        double simpleInterest = (principleAmount * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        double base = 5; 
        double height = 10; 
        double areaOfTriangle = 0.5 * base * height;
        System.out.println("Area of Triangle: " + areaOfTriangle);

        double sideOfCube = 3; 
        double volumeOfCube = sideOfCube * sideOfCube * sideOfCube;
        System.out.println("Volume of Cube: " + volumeOfCube);

        double length = 4; 
        double width = 5; 
        double heightOfCuboid = 6; 
        double volumeOfCuboid = length * width * heightOfCuboid;
        System.out.println("Volume of Cuboid: " + volumeOfCuboid);
    }
}
    

