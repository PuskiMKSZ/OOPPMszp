package oop.labor10;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingDemo {
    private ArrayList<String> fruits = new ArrayList<>();


    public SortingDemo(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {

                String fruit = scanner.next().replace(",", "");
                fruits.add(fruit);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Hiba: A fájl nem található!");
        }
    }


    public void sortAlphabetically() {
        Collections.sort(fruits);
    }


    public void sortReverseAlphabetically() {
        fruits.sort(Collections.reverseOrder());

    }


    public void printFruits() {
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }


}
