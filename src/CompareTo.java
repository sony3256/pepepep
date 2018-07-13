import java.util.Scanner;

public class CompareTo {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);

        String woord;
        String woord2;

        System.out.println("Geef een woord:");
        woord = invoer.nextLine();
        do {






        System.out.println("Geef een woord dat na dit woord komt:");
        woord2 = invoer.nextLine();


        if (woord.compareTo(woord2) < 0){
            System.out.println(woord + "\n" +  woord2 + "\n" + "Goed Zo!!!");
        }
        else if (woord.compareTo(woord2)  > 0){
            System.out.println("Letter kom niet na " + "\"" + woord + "\"" +  "!" + "\n" + "Probeer nog eens!");
        }

        }while (woord.compareTo(woord2)  > 0);


    }
}
