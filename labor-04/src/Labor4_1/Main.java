package Labor4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
        readFilePrintItsLineNumbered("labor-04/lab4_1_input.txt");
    }
    public static void readFilePrintItsLineNumbered( String lab4_1_input ) {
        try (Scanner scanner = new Scanner(new File(lab4_1_input))) {
//read and process the lines
            int nr=1;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(nr + " " + line);
                nr++;
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Person> readFromCSVFile(String lab4_1_input) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(lab4_1_input))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
// trim: eliminates leading and trailing spaces
                String firstName = items[0].trim();
                String lastName = items[1].trim();
// Convert String → int: Integer.parseInt( String)
                int birthYear = Integer.parseInt(items[2].trim());
                persons.add(new Person(firstName, lastName, birthYear));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }


}