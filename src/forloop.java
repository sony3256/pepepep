import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        int antwoord;
        do {


            System.out.println("Wilt u:");

            System.out.println("1. Twee getallen optellen.");
            System.out.println("2. Twee getallen aftrekken.");
            System.out.println("0. Stoppen");



            antwoord = Integer.parseInt(invoer.nextLine());


            switch (antwoord) {
                case 0:

                    System.out.print("Hier stoppen we.");
                    break;
                case 1:
                    System.out.print("Geef het eerste getal:");
                    int getal1 = Integer.parseInt(invoer.nextLine());
                    System.out.print("Geef het tweede getal:");
                    int getal2 = Integer.parseInt(invoer.nextLine());
                    System.out.print("De som van beiden is: " + (getal1 + getal2));
                    break;
                case 2:
                    System.out.println("Geef het eerste getal:");
                    getal1 = Integer.parseInt(invoer.nextLine());
                    System.out.println("Geef het tweede getal:");
                    getal2 = Integer.parseInt(invoer.nextLine());
                    System.out.println("Het verschil van beiden is: " + (getal1 - getal2));
                    break;
                    default:
                        System.out.println("Vul 1,2 of 0 in!!");

            }

        }while(antwoord != 0);


    }
}
