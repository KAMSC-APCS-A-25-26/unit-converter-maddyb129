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
                    System.out.println("---DistanceConverter Menu---");
                    System.out.println("1. Miles to Kilometers");
                    System.out.println("2. Kilometers to Miles");
                    System.out.println("3. Exit");
                    System.out.print("Enter your choice:  ");
                    int choice = sc.nextInt();
                    switch(choice){
                        case 1:
                            System.out.print("Enter distance (miles):  ");
                            double miles = sc.nextDouble();
                            double kilometers = miles * 1.60935;
                            System.out.println(miles + " miles is equal to " + kilometers + " kilometers \n");
                            break;
                        case 2:
                            System.out.print("Enter distance (kilometers):  ");
                            double kilo = sc.nextDouble();
                            double mil = kilo / 1.60935;
                            System.out.println(kilo + " kilometers is equal to " + mil + " miles \n");
                            break;
                        case 3:
                            System.out.println("Goodbye!");
                            running = false;
                            break;
                    }
                }
            }
        }
