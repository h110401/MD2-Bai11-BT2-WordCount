import java.util.Arrays;
import java.util.Locale;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        String string = "Today is a good day to learn code. I learn code every day";
        String[] words = string.toLowerCase().split("\\W+");
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(Arrays.toString(words));
        System.out.println();
        System.out.println(map);
    }
}
