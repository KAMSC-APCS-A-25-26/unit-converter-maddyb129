import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        // TODO: Implement temperature converter
        // Requirements:
        // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
        // - Loop until user chooses to exit
        // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
        // - Display conversion results
        // - Handle invalid menu choices
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running)
        {
            System.out.println("Choose conversion direction:");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("\nEnter your choice (1, 2, or 3):  ");
            int choice= sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter temperature in Fahrenheit:  ");
                    double tempF = sc.nextDouble();
                    double tempC =  (tempF - 32) * 0.556;
                    System.out.println("\nConversion Results:");
                    System.out.println("Fahrenheit: " + tempF);
                    System.out.printf("Celsius: %.1f\n\n", tempC);
                    break;
                case 2:
                    System.out.print("Enter temperature in Celsius:  ");
                    double tempCe = sc.nextDouble();
                    double tempFa =  (tempCe * 1.8) + 32;
                    System.out.println("\nConversion Results:");
                    System.out.printf("Celsius: %.1f\n", tempCe);
                    System.out.printf("Fahrenheit: %.1f\n", tempFa);
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.print("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid menu choice.");
                    break;
            }
        }
    }
}