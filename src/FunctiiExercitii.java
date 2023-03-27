import jdk.jshell.spi.SPIResolutionException;

public class FunctiiExercitii {
    public static void printSalut() {
        System.out.println("Salut!");
    }
    public static void printSalutDupaNume(String nume, String prenume)   {
        System.out.println("salut " + nume + " " + prenume);
    }
    public static int AriaDr(int a, int b) {
        int AriaDr = a * b;
        return AriaDr;
    }
    public static double spValue() {
        final double sp = 2.80;
        return sp;
    }

    public static double ariaCerc( double pi, double r) {
        double ariaCerc = pi * r * r;
        return ariaCerc;
    }

    public static String countNume( String nume, String prenume) {
        String countNume = nume + prenume;
        return countNume;

    }

    public static void main(String[] args) {
        printSalut();
        printSalut();
        printSalut();
        printSalutDupaNume( " Cucu",  "Mirela");
        printSalutDupaNume( " Cucu",  "Mircea");
        System.out.println(AriaDr( 4, 5   ));
        int AriaDr1 = AriaDr(6, 7);
        int AriaDr2 = AriaDr(3, 8);
        System.out.println(AriaDr1);
        System.out.println(AriaDr2);
        System.out.println(spValue());
        System.out.println(spValue());
        double ariaCerc1 = ariaCerc( 3.14, 1);
        double ariaCerc2 = ariaCerc(3.14,2);
        System.out.println(ariaCerc1);
        System.out.println(ariaCerc2);
        String countNume1 = countNume( "Marin", "Maria");
        String countNume2 = countNume( "Asap", "Adonis");
        System.out.println(countNume1.length());
        System.out.println(countNume2.length());

        // avand 3 numere, returnati pe cel mai mare




    }
}
