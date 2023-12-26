import java.util.Map;
import java.util.TreeMap;

public class treemap {

    public static void main(String[] args) {
        
        Map<String, Integer> values = new TreeMap<>();

        
        values.put("Second", 2);
        values.put("First", 1);
        System.out.println("Map using TreeMap: " + values);

        
        values.replace("First", 16);
        values.replace("Second", 2);
        System.out.println("New Map: " + values);

        
        int removedValue = values.remove("First");
        System.out.println("Removed Value: " + removedValue);
    }
}

