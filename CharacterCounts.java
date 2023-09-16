import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CharacterCounts {

    public static void main(String[] args) throws IOException {
        // Read the file as a stream of lines
        Map<Character, Long> charCounts = Files.lines(Paths.get("C:\\Users\\EGYPT\\IdeaProjects\\StreamOfLines\\src\\Fille.txt"))
                .flatMap(line -> line.chars().mapToObj(c -> (char) c))
                .collect(Collectors.groupingBy(Character::toLowerCase,
                        TreeMap::new, Collectors.counting()));

        charCounts.forEach((character, count) ->
                System.out.printf("%c: %d%n", character, count));
    }
}
