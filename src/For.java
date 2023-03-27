public class For {
    public static void main(String[] args) {
        // for - loop
        // de unde incepem
        // pana unde mergem
        // pasul de parcurgere - din 1 in 1, din 2 in 2
        // problema: printam 101 dalmatieni
        for (int i = 1; i <=101; i ++) {
            // i = 1
            System.out.println("Dalmatianul cu nr" + i);
        }
        // ne ajuta sa parcurgem un array cu ajutorul indexului
        int[] numere = {3, 7, 10, 20, 30}; // numer{[0] = 3
        for (int i = 0; i < numere.length; i=i+2) {
            System.out.println("elementul are index" + " " + 1 + " " + "si valoarea" + " " + numere [i]);
        }
        // for each - parcurge toate elementele din array si ajunge direct la valoare
        for (int numar : numere) {
            System.out.println("Numarul este:" + numar);
        }
        // parcurgem array de culori
        String[] culori = {"alb", "rosu", "galben"};
        for (String culoare : culori) {
            System.out.println("Culoarea actuala este " + culoare);
        }
        //suma numerelor din array
        int s = 0;
        for (int numar : numere) { //s= 3, 7 numere: [3, 7, 10, 20, 30] numar: 20
            s = s + numar; //10+10 s: 20 numar: 20
        }
        // afisam suma doar o singura data la final, in afara for-ului
        System.out.println(s);
    }
}
