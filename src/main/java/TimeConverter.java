import java.util.Scanner;
public class TimeConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running)
        {
            System.out.println("Convert time to total seconds");
            System.out.print("\nEnter hours:  ");
            int hours = sc.nextInt();
            System.out.print("Enter minutes:  ");
            int minutes = sc.nextInt();
            System.out.print("Enter seconds:  ");
            int seconds = sc.nextInt();

            int totalHours = hours * 3600;
            int totalMinutes = minutes * 60;
            int totalSeconds = seconds;

            System.out.println("\nTime Conversion:");
            System.out.println("Input: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
            long total = (long) totalHours + (long) totalMinutes + (long) totalSeconds;
            System.out.println("Total seconds: " + total + " seconds");

            System.out.println("\nCalculation:");
            System.out.println(hours + " hours x 3600 = " + totalHours + " seconds.");
            System.out.println(minutes + " minutes x 60 = " + totalMinutes + " seconds.");
            System.out.println(seconds + " seconds = " + totalSeconds + " seconds.");

            System.out.print("\nDo you want to convert another time? (y/n):  ");
            String answer = sc.next().toLowerCase();
            if (answer.equals("y"))
            {
                running = true;
                System.out.println(" ");
            }
            if (answer.equals("n"))
            {
                running = false;
            }
        }
    }
}