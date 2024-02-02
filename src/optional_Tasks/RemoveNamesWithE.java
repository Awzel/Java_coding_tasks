package optional_Tasks;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveNamesWithE {

    public static void main(String[] args) {
        System.out.println(removeNamesWithE());
    }

    public static Set<String> removeNamesWithE() {
        String[] namesArray = {"Ali", "Veli", "Semavi", "Sami", "Hayati", "Memati", "Canan"};
        Set namesSet = new LinkedHashSet<>();
        namesSet.addAll(Arrays.asList(namesArray));
        Iterator namesSetIterator = namesSet.iterator(); // returns an Array of “namesSet”

        while (namesSetIterator.hasNext()) {
            String str = namesSetIterator.next().toString();
            if (str.toLowerCase().contains("e")) {
                namesSetIterator.remove();
            }
        }
        return namesSet;
    }
}
