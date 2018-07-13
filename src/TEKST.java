import java.util.Scanner;

public class TEKST {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        int lengte;
        String tekst;
        do {

            System.out.println(" Geef een tekst van minstens 8 karakters in:");
            tekst = invoer.nextLine();
            lengte = tekst.length();



            if (lengte < 8){
                System.out.println("Kieken, ik zei minstens 8. opnieuw: hoeveel");
            }


        }while(lengte < 8 );
        tekst = tekst.toUpperCase();
        System.out.println( "\"" + tekst + "\"");

    }
}

