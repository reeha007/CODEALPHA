import java.util.Scanner;

public class WordCounterApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Word Counter");
        System.out.println("Enter text (press Enter twice to finish):");

        StringBuilder inputText = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            inputText.append(line).append("\n");
        }

        String text = inputText.toString().trim();
        if (text.isEmpty()) {
            System.out.println("Word Count: 0");
        } else {
            String[] words = text.split("\\s+");
            int wordCount = words.length;
            System.out.println("Word Count: " + wordCount);
        }

        scanner.close();
    }
}