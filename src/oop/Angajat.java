package oop;

public class Angajat {
    String numeAngajat;
    String functie;
    int varsta;
    double salar = 5000;

    public Angajat(String numeAngajat, int varsta, String functie) {
        this.numeAngajat = numeAngajat;
        this.varsta = varsta;
        this.functie = functie;
        System.out.println("Angajatul este " + this.numeAngajat+ " cu varsta de " + this.varsta + " in functia de " + this.functie);
    }
    public void angajare(String numeAngajat, int varsta, String functie) {
        System.out.println("Angajat nou " + this.numeAngajat);
        System.out.println("In varsta de "+ this.varsta);
        System.out.println("Cu functia de " + this.functie);
    }
    public void stabilireSalar(int vechime) {
        if (vechime == 0) {
            System.out.println("Salarul este de " + this.salar);
        } else if (vechime == 5) {
            System.out.println("Salarul este de " + (this.salar + 500));
        }
        else {
            System.out.println("Salarul este de " + (this.salar + 700));
        }


    }
}
