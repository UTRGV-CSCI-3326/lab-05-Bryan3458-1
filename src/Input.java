import java.util.Scanner;

public class Input {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Get and store the user's name. (Store as text)
        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        // Get and store the user's age. (Store as a whole number)
        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        // Get and store the user's weight. (Store it as a real number)
        float weight;
        System.out.print("Enter your weight: ");
        weight = scanner.nextFloat();

        // Get and store if the user is a smoker. (Store it as either true or false)
        boolean smoker;
        System.out.print("Do you smoke? Enter true for yes or false for no: ");
        smoker = scanner.nextBoolean();
        
        // Output all of the information back to the user
        System.out.println(name);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(smoker);
    }
}
