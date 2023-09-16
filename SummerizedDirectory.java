import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class SummerizedDirectory {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file or directory name:");

        Path path = Paths.get(input.nextLine());

        if(Files.exists(path)){
            System.out.printf("%n%s exists%n", path.getFileName());
            System.out.printf("%s a directory%n", Files.isDirectory(path)? "IS" :" NOT");
            System.out.printf("Last modified: %s%n", Files.getLastModifiedTime(path));
        }

        if (Files.isDirectory(path)){
            /*System.out.printf("%nDirectory contents:%n");
            DirectoryStream<Path> directoryStream =
                    Files.newDirectoryStream(path);

            for (Path p : directoryStream)
                System.out.println(p);*/

            System.out.printf("%nDirectory contents:%n");
            DirectoryStream<Path> stream = Files.newDirectoryStream(path);
            stream.forEach(entry -> System.out.println(entry.getFileName()));

        }




    }

}