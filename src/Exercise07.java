import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by ericweidman on 3/1/16.
 */
public class Exercise07 {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> names = new ArrayList<>();

        File f = new File("people.csv");
        Scanner fileScanner = new Scanner(f);
        fileScanner.nextLine();
        while (fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            String[] columns = line.split(",");

            names.add(columns[1] + " " + columns[2]);
        }
        String searchTerm = "ali";

        ArrayList<String> results = new ArrayList<>();
        for (String name : names) {
            if (name.toLowerCase().contains(searchTerm)) {
                ;
                results.add(name);
            }
        }
        System.out.println(results);

        results = names.stream()
                .filter((name) ->{
                    return name.toLowerCase().contains(searchTerm);
                })
            .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(results);
    }

}
