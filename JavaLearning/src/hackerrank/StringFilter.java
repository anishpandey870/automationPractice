package hackerrank;

import java.util.Arrays;
import java.util.List;

public class StringFilter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("s", "AB", "ABC", "BC", "BCD", "AAA", "BBB");

        System.out.println("Strings starting with 'A' and having a length of 3:");
        strings.stream()
               .filter(s -> s.startsWith("A") && s.length() == 3)
               .forEach(i->System.out.println(i));
       
    }
}
