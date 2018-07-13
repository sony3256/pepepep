package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef de dag: ");
        String dag = invoer.nextLine();
        System.out.println("Geef de maand: ");
        String maand = invoer.nextLine();
        System.out.println("Geef het jaar: ");
        String jaar = invoer.nextLine();
        System.out.println(dag + maand + jaar);






    }
}

