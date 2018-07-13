import java.util.Scanner;

public class forloop1 {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);

        System.out.println("Geef een getal:");
        int getal1 = Integer.parseInt(invoer.nextLine());
        for (int m = 1; m < 11 ; m++) {
            System.out.println(getal1 * m);

        }
    }
}
