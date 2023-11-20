//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Animale animale = new Animale("canarino");

        Set<Animale> canarino = creaHashset(animale);
        if (canarino.contains(animale))
            System.out.print("L'animale è nel set");
        else {
            System.out.print("L'animale non è contenuto nel set");
        }
    }

    public static Set<Animale> creaHashset(Animale animale) {

        Set<Animale> hashSet = new HashSet<>();
        hashSet.add((animale));
        hashSet.add(new Animale("cane"));
        hashSet.add(new Animale("gatto"));
        hashSet.add(new Animale("pesce rosso"));
        return hashSet;
    }
}



