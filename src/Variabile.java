public class Variabile {
    public static void main(String[] args) {
        //declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

            //strongly typed - trebuie sa specificam tipul variabilelor
        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        //suprascrierea
        modelMasina= "XC 60 facelift";

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        //declarare
        String nume;
        String prenume;
        //initializare
        prenume = "Andy";
        nume = "Sinpetrean";
        int varsta = 34;
        //concatenare de stringuri
        System.out.println(prenume + " " + nume + " cu varsata de " + varsta);
    }
}
