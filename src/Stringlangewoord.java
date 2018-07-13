import java.util.Scanner;

public class Stringlangewoord {
    public static void main(String[] args) {
        int lengte;
        do {


            Scanner invoer = new Scanner(System.in);
            System.out.println(" Geef een tekst van minstens 8 karakters in:");
            String vraag = invoer.nextLine();
            lengte = vraag.length();


            if (lengte < 8){
                System.out.println("Kieken, ik zei minstens 8. opnieuw: hoeveel");
            }


        }while(lengte < 8 );
        System.out.println("Je tekst is ok, minstens 8 dan");

    }
}
