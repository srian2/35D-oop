public class week2_ {
    public static void main(String[] args) {
    //WAP to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote. 
        int age = 17;
       
        if(age>=18){
            System.out.println("eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    

//  Write a program to calculate SI. 
// Formula Simple Interest = (PrincipleAmount*Time*Rate/100);
        double principleAmount = 1000;
        int time = 7; 
        double rate = 2; 
        double simpleInterest = (principleAmount * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        // 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
        // Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side;
  
        double base = 9;
        double heightoftriangle = 7;
        // area of triangle
        double trianglearea = 0.5 * base * heightoftriangle;
        System.out.println("Area of triangle" + trianglearea);

    // volume of cube
        double side = 6;
        double volumeOfCube = side*side*side;
        System.out.println("volume of cube" + volumeOfCube);

    // volume of cuboid
        double length = 3;
        double width = 2;
        double heightOfCuboid = 4;
        double VolumeOfCuboid = length*width*heightOfCuboid;
        System.out.println("Volume of cuboid" + VolumeOfCuboid);
    
//4. Write the ternary operator for question no. 1
        int age1 = 18; 
        String result = (age1 >= 18)? "You can cast a vote." : "You cannot cast a vote.";
        System.out.println(result);
    
// 5. Write a program to take two integer inputs from the user and print the sum and product of them.
        int num1 = 55; 
        int num2 = 10; 
        int sum = num1 + num2;
        int product = num1 * num2;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // 7. Take the name, roll number, and field of interest from the user and print in the format below:
        // Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.
        String name = "sandesh kandel"; 
        int rollNumber = 222;
        String fieldOfInterest = "Computer Science"; 
        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ". My field of interest are " + fieldOfInterest + ".");
    

        //  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.

        
        double length1 = 6; 
        double breadth = 7; 
        int area = (int) (length1 * breadth);
        System.out.println("Area: " + area);


        //10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;
        //a. If equal to or more than 70 -> First Class
        // b. If more than 59 -> Upper Second Class
        // c. If more than 49 -> Second class
        //  d. If more than 39 -> Third class and if below than 40 the result is fail. 
        //  Hint: Use ternary operator
         
        int sub1 = 70;
        int sub2 = 60; 
        int sub3 = 50; 
        int sub4 = 40; 
        int totalMarks = sub1 + sub2 + sub3 + sub4;
        double percentage = (totalMarks * 100) / 400.0;
        String result1 = (percentage >= 70)? "First Class" : (percentage > 59)? "Upper Second Class" : (percentage > 49)? "Second Class" : (percentage >= 39)? "Third Class" : "Fail";
        System.out.println("Total Percentage: " + percentage + "%");
        System.out.println("Result: " + result1);

    }
}


        