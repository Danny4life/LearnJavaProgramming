import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int birthYear = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter Your Name:");

            String name = scanner.nextLine();

            int age = 2022 - birthYear;

            if(age >= 0 && age <= 100){
                System.out.println("Your name is " + name + " you are " + age + " years old");

            } else {
                System.out.println("Invalid age");
            }

        } else {
            System.out.println("wrong entry");
        }


        scanner.close();
    }
}
