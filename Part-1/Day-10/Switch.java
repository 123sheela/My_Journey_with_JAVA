import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7:");
        int a = sc.nextInt();

        String b;

        switch (a) {
            case 1:
                b = "Sunday";
                break;
            case 2:
                b = "Monday";
                break;
            case 3:
                b = "Tuesday";
                break;
            case 4:
                b = "Wednesday";
                break;
            case 5:
                b = "Thursday";
                break;
            case 6:
                b = "Friday";
                break;
            case 7:
                b = "Saturday";
                break;
            default:
                b = "Invalid day number";
        }

        System.out.println("The day corresponding to the number " + a + " is " + b);
    }
}
