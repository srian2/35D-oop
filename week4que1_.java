import java.util.Scanner; 
public class week4que1_ {
    // 1. Write a program that asks your name and prints “Hello your name” five times. Use a loop.
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String name = scanner.nextLine();
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello " + name);
            }
}
     

