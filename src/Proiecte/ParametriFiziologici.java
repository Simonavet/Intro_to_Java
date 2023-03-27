package Proiecte;

import java.util.Scanner;

public class ParametriFiziologici {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti specia: ");
        System.out.println("Introduceti parametri");
        String specia = sc.next("vaca");
        int respiratii = sc.nextInt();
        if (respiratii < 30) {
            System.out.println("Valori scazute");
        } else if (respiratii <= 60) {
            System.out.println("Valori normale");
        } else {
            System.out.println("Valori crescute");
        }


        String speciaCal = sc.next("cal");
        int respiratiiCal = sc.nextInt();
        if (respiratiiCal <= 20) {
            System.out.println("Valori scazute");
        } else if (respiratiiCal <= 40) {
            System.out.println("Valori normale");
        } else {
            System.out.println("Valori crescute");
        }
    }
}
