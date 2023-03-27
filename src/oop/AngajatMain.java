package oop;

public class AngajatMain {
    public static void main(String[] args) {
        Angajat pers1 = new Angajat("Marius P", 30, "programator");
        Angajat pers2 = new Angajat("Dana C", 27, "programator");
        Angajat pers3 = new Angajat("Cristina K", 35, "manager");
        pers1.angajare("Marius P", 30, "programator");
        pers1.stabilireSalar(0);
        pers2.angajare("Dana C", 27, "programator");
        pers2.stabilireSalar(5);
        pers3.angajare("Crisitna K", 35, "manager");
        pers3.stabilireSalar(7);
    }
}
