import java.util.*;

import static javax.swing.UIManager.put;

public class ExercitiiArrayListeMaps {
    public static void main(String[] args) {
//        String [] animale = {"cal", "vaca", "caine", "oaie"};
//        double [] temperatura = {37.5, 38.6, 38.0, 39.5};
//        System.out.println(animale[3]);
//        System.out.println(temperatura[1]);
//        animale[1] = "bou";
//        System.out.println(animale[1]);
//        System.out.println(animale[0] + " "  + animale[1]  + " " + animale[2]+ " "  + animale[3]);
//        System.out.println(animale.length + 7);
//        System.out.println(animale.length);
//        System.out.println("ultima: " + animale[animale.length - 1] );
//        double [] valori = new double[3];
//        System.out.println(valori[2]);
//        valori[0] = 37.5;
//        valori[1] = 38.6;
//        System.out.println(valori[1]);
        // liste
//        List<String> animale = new ArrayList<>();
//        animale.add( "caine");
//        animale.add("pisica");
//        animale.add("soarece");
//        animale.add("hamster");
//        System.out.println(animale);
//        animale.get(3);
//        System.out.println(animale.get(3));
//        animale.remove("caine");
//        System.out.println(animale);
//        System.out.println(animale.get(1));
////        animale.clear();
//        System.out.println(animale);
//        if (!animale.isEmpty()) {
//            System.out.println("avem pets");
//        } else {
//            System.out.println("nu avem animale");
//        }
//        System.out.println(animale.size());
//        List<Integer> numere = Arrays.asList(1, 2, 3, 4, 5);
//        System.out.println(numere);
//        numere.add(6);
//        System.out.println(numere); // nu merge
//        Double [] temperaturi = {34.5, 36.9, 30.4, 13.5};
//        List<Double> templist = new ArrayList<>(Arrays.asList(temperaturi));
//        templist.add(20.4);
//        System.out.println(templist);
//        String [] animaleDomestice = {"vaci", "cai", "oi", "porci"};
//        List<String> anilist = new ArrayList<>(Arrays.asList(animaleDomestice));
//        int cai_index = anilist.indexOf("cai");
//        System.out.println(anilist.indexOf("cai"));
//        anilist.remove("oi");
//        System.out.println(anilist);
//        anilist.remove(cai_index);
//        System.out.println(anilist);

        //maps
//        Map<String, Integer> varsta_copii = new HashMap<>();
//        varsta_copii.put("Andrei", 4);
//        varsta_copii.put("Adi", 5);
//        varsta_copii.put("Cami", 11);
//        varsta_copii.put("Ada", 12);
//        System.out.println("Adi are varsta de " + varsta_copii.get("Adi") + " ani");
//        varsta_copii.replace("Andrei", 5);
//        System.out.println(varsta_copii.get("Andrei"));
//        System.out.println(varsta_copii.size());
//        varsta_copii.remove("Cami");
//        System.out.println(varsta_copii.get("Cami"));
//        System.out.println(varsta_copii);
//        Map<String, Integer> luni = new HashMap<>()
//        {{
//            put("Mai", 1);
//            put("Iunie", 2);
//            put("Iulie", 3);
//        }};
//        System.out.println(luni);

        //while
//        int litri_apa = 20;
//        while ( litri_apa > 0 ) {
//            System.out.println("vine apa");
//
//        litri_apa = litri_apa - 2;
//        if (litri_apa <= 4) {
//            System.out.println("nu mai vine");
//        }
//        }
//        System.out.println("gata!");

        //for
        for (int i = 1; i <= 20; i++) {
            System.out.println("piticul nr " + i);
        }
        int[] numere = {1, 3, 5, 7, 9};
        for (int i = 0; i < numere.length; i = i+2) {
            System.out.println("indexul este " + i + " valoarea " + numere[i]);
        }
        for (int numar : numere) {
            System.out.println("valoarea este " + numar );
        }
        String [] culori = {"alb", "gri", "rosu"};
        for (String culoare : culori) {
            System.out.println("culoarea este " + culoare);
        }
        int s = 0;
        for (int numar: numere) {
            s = s + numar;
        }
        System.out.println(s);













    }
}
