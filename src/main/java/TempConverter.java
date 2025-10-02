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
            System.out.println("---TempConverter Menu---");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("What is your choice:  ");
            int choice= sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter temperature in Fahrenheit:  ");
                    double tempF = sc.nextDouble();
                    double tempC =  (tempF - 32) * 5/9;
                    System.out.println(tempF + " degrees Fahrenheit " + "is " + tempC + " degrees Celsius");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("Enter temperature in Celsius:  ");
                    double tempCe = sc.nextDouble();
                    double tempFa =  (tempCe * (9/5)) + 32;
                    System.out.println(tempCe + " degrees Celsius " + "is " + tempFa + " degrees Fahrenheit");
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.print("Goodbye!");
                    running = false;
                    break;
            }
        }
    }
}