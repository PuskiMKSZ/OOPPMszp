package oop.labor10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // === 1. FELADAT: Gyümölcsök rendezése ===
        System.out.println("1. Feladat");
        SortingDemo fruitDemo = new SortingDemo("fruits.txt");

        System.out.print("Eredeti lista: ");
        fruitDemo.printFruits();

        fruitDemo.sortAlphabetically();
        System.out.print("ABC sorrend:   ");
        fruitDemo.printFruits();

        fruitDemo.sortReverseAlphabetically();
        System.out.print("Visszafelé:    ");
        fruitDemo.printFruits();






        System.out.println(" 2. Feladat");
        ArrayList<MyDate> dates = new ArrayList<>();
        Random rand = new Random();
        int currentYear = 2026;


        while (dates.size() < 10) {
            int month = rand.nextInt(12) + 1;
            int day = rand.nextInt(31) + 1;

            if (DateUtil.isValidDate(currentYear, month, day)) {
                dates.add(new MyDate(currentYear, month, day));
            }
        }

        System.out.println("Dátumok rendezés előtt:");
        for (MyDate d : dates) {
            System.out.println(" - " + d);
        }

        // A Collections.sort itt a MyDate osztályban megírt compareTo-t használja
        Collections.sort(dates);

        System.out.println("\nDátumok rendezés után (időrendben):");
        for (MyDate d : dates) {
            System.out.println(" - " + d);
        }
    }
}