public class Functii {

        // functie = logica delimitata care poate fi refolosita
        // o functie simpla care ne printeaza ceva pe ecran
        // nu ne da niciun raspuns (nu are return)
        // nu are parametri
        // reguli: nu putem folosi spatii in nume
        // nu putem defini o functie in alta functie (nu pot instala firefox in chrome)
        public static void printGreeting() {
            System.out.println("Buna ziua! bine ati venit!");
        }
        // o functie care saluta clientul in functie de numele lui
        public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Buna ziua " + nume + prenume);
    }
    // o functie care calculeaza media a 3 numere
    // ne da un raspuns - suma nr. va avea return
    // are nevoie de parametri
    // ce tip de date va avea raspunsul?
    public static double mediaNr(double a, double b, double c) {
            double mediaNr = (a + b + c) / 3;
            return mediaNr;
    }

    // o functie care ne da valoare lui pi
    // ne da un raspuns? - da
    // ce tip de date va avea raspunsul? - raspunsul va fi double
    // are nevoie de parametri? nu
    public static double piValue() {
            // constanta care nu poate fi suprascrisa
           final double PI = 3.14;
           return PI;

    }
        public static void main(String[] args) {
            // intra clientul 1
            printGreeting(); // se apeleaza functia

            // intra clientul 2
            printGreeting(); // ctrl+ click pe f => ne duce la corpul ei

            //public - poate fi accesat din orice clasa
            //static - inca nu avem nevoie sa stim
            //void - nu returneaza nimic
            // cum verific ca nu returneaza
            // String hello = printGreeting(); - nu functioneaza

            // o functie care saluta clientul in functie de numele lui

                //apelam o functie cu parametri, oferind argumente
                printGreetingByName("Lupu ",  "Andy");
                printGreetingByName("Lupu ",  "Crina");
                printGreetingByName("Lupu ",  "Ares");

            System.out.println(mediaNr( 3, 3, 4));
            double media1 = mediaNr( 31213, 312313, 423);
            double media2 = mediaNr( 35, 324, 41);
            double media3 = mediaNr( 33, 11, 11);
            System.out.println(media1);
            System.out.println(media2);
            System.out.println(media3);
            System.out.println(piValue());
            System.out.println(piValue());

            // tema: aria unui dreptunghi, aria cercului, suma a doua nr
            // o functie care returneaza cate caractere are numele + prenumele
            String nume= "anfy";
            System.out.println(nume.length());
            // identificaati pb



    }

}
