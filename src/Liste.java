import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// alt+enter

public class Liste {
    public static void main(String[] args) {
        //structuri de date ordonate
        // declaram o lista goala
        List<String> fructe = new ArrayList<>();
        // au o dimesiune dinamica
        //adaugam elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        //cum se iau elemente
        fructe.get(0);
        System.out.println(fructe.get(0));
        System.out.println(fructe.get(2));

        // cum se afla un element
        System.out.println(fructe.indexOf("banana"));

        // este lista goala?
//        System.out.println(fructe.isEmpty();

        if (!fructe.isEmpty()) { // daca nu este goala
            System.out.println("tinem ore");
        }else {
            System.out.println("nu vom tine ore");
        }
//        // eliminam toate elementele din lista
//        fructe.clear();
//        if (!fructe.isEmpty()) { // daca nu este goala
//            System.out.println("avem ce manca");
//        }else {
//            System.out.println("nu avem ce manca");
//        }
        // scoatem un element
        fructe.remove("mar");

        // listam elemente
        System.out.println(fructe);
        if (!fructe.isEmpty()) { // daca nu este goala
            System.out.println("avem ce manca");
        }else {
            System.out.println("nu avem ce manca");
        }
        // aflam dimesiunea listei
        System.out.println(fructe.size());

        // declaram o lista imutabila si o initializam cu valori
        List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 77});
        System.out.println(numere);

        // declaram o lista dinamica
        String[] flowers = { "Ageratum", "Allium", "Poppy", "Catmint"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("Rose");
        System.out.println(Arrays.toString(flowerList.toArray()));

        // aflam unde este Poppy
        int Poppy_index = flowerList.indexOf("Poppy");
        // stergem ce este in acea pozitie
        flowerList.remove(Poppy_index);
        System.out.println(Arrays.toString(flowerList.toArray()));

        //scoatem in functie de valoare
        flowerList.remove("Catmint");
        System.out.println(Arrays.toString(flowerList.toArray()));
        //sau
        System.out.println(flowerList);


    }
}
