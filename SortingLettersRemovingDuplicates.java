import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class SortingLettersRemovingDuplicates {
    public static void main(String[] args) {
        Random random = new Random();
        List<Character> ListLetters = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            char randomLetter = (char) (random.nextInt(26) + 'a');
            ListLetters.add(randomLetter);
        }

        List<Character>  AscendingList = ListLetters.stream()
                                        .sorted()
                                        .collect(Collectors.toList());

        List<Character> DesendingList = ListLetters.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        List<Character> noDuplicate = ListLetters.stream().distinct().collect(Collectors.toList());

        System.out.println("Original List: " + ListLetters);
        System.out.println("Sorted in Ascending Order: " + AscendingList);
        System.out.println("Sorted in Descending Order: " + DesendingList);
        System.out.println("Distinct " + noDuplicate);

    }
}
