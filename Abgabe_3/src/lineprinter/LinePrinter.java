package lineprinter;

public class LinePrinter {
    public static void main(String[] args) {
        String word = "Hallo!";
        int maximumNumberOfChars = 100;
        String line = "";
        int lineCount = 0;
        int charCount = 0;
        int wordCount = 0;

        while (charCount < maximumNumberOfChars) {
            line += word;
            lineCount++;
            charCount += line.length();
            wordCount += lineCount;
            System.out.println(line);
        }

        System.out.println();
        System.out.println("Maximale Anzahl von Zeichen: " + maximumNumberOfChars);
        System.out.println("Es wurden " + charCount + " Zeichen ausgegeben.");
        System.out.println("Es wurden " + lineCount + " Zeilen ausgegeben.");
        System.out.println("Es wurden " + wordCount + " Wörter ausgegeben.");
    }
}
