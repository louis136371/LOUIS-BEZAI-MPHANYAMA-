import java.util.Scanner;

public class Luis {
    public static void main(String[] args) {
        Scanner Bezai = new Scanner(System.in);

        // allow the user to enter the four numbers
        System.out.println("Enter the four numbers: ");
        double w = Bezai.nextDouble();

        double x = Bezai.nextDouble();

        double y = Bezai.nextDouble();

        double z = Bezai.nextDouble();
        // calculating the sum of all four numbers
        double sum = w + x + y + z;

        // calculating the average of four numbers
        double average = sum / 4;

        // displaying the average results
        System.out.println("The average of four numbers written is " + average);

        Bezai.close();

    }
}