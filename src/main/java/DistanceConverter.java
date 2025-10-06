import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        // TODO: Implement distance converter
        // Requirements:
        // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles, 3. Exit
        // - Loop until user chooses to exit
        // - Use conversion factor: 1 mile = 1.60935 kilometers
        // - Display conversion results
        // - Handle invalid menu choices
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running)
        {
            System.out.println("\nChoose conversion direction:");
            System.out.println("1. Convert Miles to Kilometers");
            System.out.println("2. Convert Kilometers to Miles");
            System.out.println("3. Exit\n");
            System.out.print("Enter your choice:  ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter distance (miles):  ");
                    double miles = sc.nextDouble();
                    double kilometers = miles * 1.60935;
                    System.out.println("\nConversion Results:");
                    System.out.println("Miles: " + miles);
                    System.out.printf("Kilometers: %.5f\n", kilometers);
                    break;
                case 2:
                    System.out.print("Enter distance (kilometers):  ");
                    double kilo = sc.nextDouble();
                    double mil = kilo / 1.60935;
                    System.out.println("\nConversion Results:");
                    System.out.println("Kilometers: " + kilo);
                    System.out.printf("Miles: %.5f\n", mil);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid menu choice.");

            }
        }
    }
}