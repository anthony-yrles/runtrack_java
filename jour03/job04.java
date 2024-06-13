package jour03;

import java.util.HashMap;
import java.util.Map;

public class job04 {
    public static void main(String[] args) {
        
        int[] tableau = {3, 7, 3, 9, 8};

        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int nombre : tableau) {
            if (occurrences.containsKey(nombre)) {
                occurrences.put(nombre, occurrences.get(nombre) + 1);
            } else {
                occurrences.put(nombre, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println("Nombre " + entry.getKey() + " : " + entry.getValue() + " occurrence(s)");
        }
    }
}

