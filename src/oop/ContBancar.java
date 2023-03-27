package oop;

public class ContBancar {
    // program files folosim logica unui cont bancar
    // oop= object oriented programing
    // poo = programare orientata pe obiecte

    // o clasa = este un tip nou
    // este definitia unui concept
    // reteta la paste carbonara, ADN-ul uman
    // ex: clasa Car

    // sa le am trebuie sa am:
    // un obiect = instanta unei clase
    // ex. de obiect - paste carbonara, un om
    // ex. 10 obiecte de tip Car

    // de ce este util oop -
    // reteta contine: fields = proprietati = atribute
    // fields - variabile
    // ex: culoare, marca, model, consum, pret

    // metode = actiuni ce pot fi facute de obiecte
    // ex: functii
    // accelereaza (), franeaza(), deschideUsa(), vopsire()

    // proprietatile
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;
    int incercari_activare = 0;

    // constructor = are rolul de a impune date de start
    // ca si * din formulare, required fileds
    // rolul de a se asigura ca nu putem avea un obiect fara anumite date esentiale

    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    // metode = actiunile clasei
    public void interogareSold() {
        System.out.println("Titular " + this.titularCont);
        System.out.println("IBAN " + this.iban);
        System.out.println("Sold " + this.sold);
        System.out.println("Activ " + this.activ);
        System.out.println("Nr de incercari gresite " + this.incercari_activare);
        System.out.println("---------------------------------------");
    }

    public void activareCont(int pinUtilizator) {
        // modifica activ in true doar daca pinul e corect
        System.out.println("Buna " + this.titularCont);
        //this.activ = true;
        if (pinUtilizator == this.pin) {
            System.out.println("Card activat cu succes");
            this.activ = true;
        }else {
            System.out.println("pin gresit");
            this.incercari_activare++; //incrementeaza
        }

    }
    public void alimentareCont(double suma_depusa) {
        //la ce aveam in cont (this.sold) se mai adauga suma depusa
        this.sold = this.sold + suma_depusa;
        System.out.println("Buna " + this.titularCont);
        System.out.println("Ati depus cu succea suma de " + suma_depusa + "Aveti in cont suma de " + this.sold);
    }

    public  void plataCard(double suma_cheltuita) {
        System.out.println("Buna " + this.titularCont);
        // pot sa cletuiesc doar ce am
        // daca suma cheltuita e <= sold
        if (suma_cheltuita <= this.sold) {
            //dispar banii din sold
            this.sold = this.sold - suma_cheltuita;
            System.out.println("Ai cheltuit " + suma_cheltuita);
            System.out.println("Mai ai " + this.sold);
        } else {
            System.out.println("Fonduri insuficiente");
        }

    }

    //mosteniri
    //polimorphism
    //encapsulation
    //abstractization
}
