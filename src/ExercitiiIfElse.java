import java.util.Scanner;

public class ExercitiiIfElse {
    public static void main(String[] args) {
//        int nr = 16;
//        if (nr < 18) {
//            System.out.println("nu poate paria");
//        } else {
//            System.out.println("poate paria");
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("alege melodia");
//        int melodia = sc.nextInt();
//        if (melodia == 1) {
//            System.out.println("Good bye!");
//        } else if (melodia == 2) {
//            System.out.println("I love you");
//        } else if (melodia == 3) {
//            System.out.println("Welcome");
//        } else; {
//            System.out.println("nu exista");
//        }
        // switch
        Scanner sc = new Scanner(System.in);
        System.out.println("alege cantecul");
        int cantecul = sc.nextInt();
        switch (cantecul) {
            case 1:
                System.out.println("Good Bye");
                break;
            case 2:
                System.out.println("I love you");
                break;
            case 3:
                System.out.println("Welcome");
                break;
            default:
                System.out.println("nu exista");
        }
    }
}
