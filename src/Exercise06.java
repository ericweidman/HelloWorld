import java.util.*;

/**
 * Created by ericweidman on 2/25/16.
 */
public class Exercise06 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "Hope", "Charlie", "Brown"};

        ArrayList<String> reversedNames = new ArrayList<>(Arrays.asList(names));
        Collections.reverse(reversedNames);


        HashMap<String, String> nameMap = new HashMap<>();

        for (int i = 0; i < reversedNames.size(); i += 2) ;
       // nameMap.put(reversedNames.get(i), reversedNames.get(i + 1));
        System.out.println(reversedNames);


        String jake = "jake";
        String doug = "doug";

        jake = doug;


    }
    }

