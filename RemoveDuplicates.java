import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an sentace with duplicate to trim it");
        String sentance = input.nextLine();
        String[] words = sentance.toLowerCase().split(" ");

        List<String> uniqueWords = Arrays.stream(words)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        for(String w : uniqueWords){
            System.out.println(w );
        }








    }
}
