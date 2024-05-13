public class week3_ {
    public static void main(String[] args) {
    // 1) To find the maximum between three numbers
        int num1 = 10; 
        int num2 = 20; 
        int num3 = 30; 
        int max = (num1 > num2)? (num1 > num3? num1 : num3) : (num2 > num3? num2 : num3);
        System.out.println("Maximum is: " + max);
    
    //  2) Write a JAVA program to check whether a number is negative, positive, or zero.

        int num = 0;
        if (num>0) {
            System.out.println("Negative");
        }
        else if (num<0) {
            System.out.println("Positive");
        }
        else{
            System.out.println("zero");
        } 
    }
}

// To check whether a number is divisible by 5 and 11 or not,
public static void main(String[] args) {
        int num = 14;
        if(num % 5 ==0 && num % 11 == 0){
            System.out.println("number is divisible by 5 and 11");
        }else{
            System.out.println("number isnot divisiblee by 5 and 11");
        }
    

    // Write a JAVA program to check whether a number is even or odd.
 
    
        int number = 20;
        if(number % 2 == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
      
// Write a JAVA program to check whether a year is a leap year or not. 
        int year = 2001; 
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }
    
// Write a JAVA program to input any alphabet and check whether it is vowel or consonant.

        char ch = 'a';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is a vowel");
        }else{
            System.out.println(ch + "is a consonant");
        }

    
// some switch case statements questions
//  Write a Java program that takes a student's grade as input (A, B, C, D, or F) 
// converts it to the corresponding GPA value. Use a switch case statement to handle different grades.

    char grade = 'A'; 
    int gpa = 0;
    switch (grade) {
        case 'A':
            gpa = 4;
            break;
        case 'B':
            gpa = 3;
            break;
        case 'C':
            gpa = 2;
            break;
        case 'D':
            gpa = 1;
            break;
        case 'F':
            gpa = 0;
            break;
        default:
            System.out.println("Invalid Grade");
            return;
    }
    System.out.println("GPA: " + gpa);


// 2. Create a Java program that takes two numbers and an operator (+, -, *, /)
//.as inputs and performs the corresponding arithmetic operation using a switch case statement.
        int num1 = 10; 
        int num2 = 20; 
        char operator = '+'; 
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Result: " + result);
        
        // 4. Implement a Java program that calculates the area of different shapes 
        // (circle, rectangle, square, triangle) based on the user's choice using a switch case.

        int choice = 1; 
        double radius = 0;
        double length = 0;
        double width = 0;
        double height = 0;
        double area = 0;
        double base = 0;
        switch (choice) {
            case 1:
                radius = 5; 
                area = Math.PI * radius * radius;
                break;
            case 2:
                length = 5; 
                width = 10; 
                area = length * width;
                break;
            case 3:
                length = 5; 
                width = 10; 
                height = 15; 
                area = length * width * height;
                break;
            case 4:
                base = 5; 
                height = 10; 
                area = 0.5 * base * height;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        System.out.println("Area: " + area);
    }
