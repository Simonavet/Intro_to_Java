public class Array {
    public static void main(String[] args) {
      // declarare si initializare
      String[] elevi = {"Gigel", "Costel", "Mari", "Ela", "Ada", "Mari"};
      int[] numere = {1, 33, 81, 99, 201};
      // contine mai multe elemente de acelasi tip
      // accesam elementele prin index, care incepe de la 0
      // are o dimesiune fixa
      //are proprietatea length care ne da dimesiunea array-ului

        System.out.println(elevi[2]);
        elevi[2] = "Sebi"; // suprascriere
        System.out.println(elevi[2]);
        System.out.println(elevi.length);

        // putem sa ne jucat cu valorile din spate
        System.out.println(elevi[0] + " " + elevi[1]); // gigel + Costel
        System.out.println(elevi.length + 5);

        // sa printam tot timpul ultimul element indiferent de marime
        System.out.println("Last place:" + elevi[3]);
        System.out.println("Last place: " + elevi[elevi.length-1] );

        // declarare si alocare de memorie
        int[] note = new int[5];
        System.out.println(note[1]);
        note[0] = 10;
        note[1] = 9;
        System.out.println(note[0]);
    }
}
