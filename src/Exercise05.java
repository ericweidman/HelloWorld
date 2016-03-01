import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * Created by ericweidman on 2/24/16.
 */
public class Exercise05 {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie", "andrew", "edward", "alex"};

        ArrayList<String> newNames = new ArrayList<>(Arrays.asList(names));
        newNames = new ArrayList<>(newNames.subList(0, 5));

        solveViaStream(newNames);
        solveViaDirectModification(newNames);
        solveViaTempLists(newNames);
    }

    static void solveViaDirectModification(ArrayList<String> names) {
        for (int i = 0; i < names.size(); i++) {
            names.set(i, names.get(i).toUpperCase());
        }

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (!name.startsWith("A")) {
                iterator.remove();
            }
        }
        System.out.println(names);
    }

    static void solveViaTempLists(ArrayList<String> names) {
        ArrayList<String> temp = new ArrayList<>();
        for (String name : names) {
            temp.add(name.toUpperCase());
        }
        names = temp;
        temp = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A")) {
                temp.add(name);
            }
            names = temp;
        }
        System.out.println(names);
    }

    static void solveViaStream(ArrayList<String> names) {
        names = names.stream()
                .map((name) -> {
                    return name.toUpperCase();
                })
                .filter((name) -> {
                    return name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(names);
    }
}
