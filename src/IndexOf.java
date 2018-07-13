import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef een tekst: ");
        String tekst = invoer.nextLine();
        System.out.println("Geef een zoektekst: ");
        String zoek = invoer.nextLine();
        int positie = tekst.indexOf(zoek);
        int positie2 = tekst.lastIndexOf(zoek);
        if (positie != -1){
        if (positie == positie2){
            System.out.println("\"" + zoek + "\"" + " komt eenmaal voor.");
        }
        else
            System.out.println("\"" + zoek + "\"" + " komt meerdere male voor.");
        }

        }
    }