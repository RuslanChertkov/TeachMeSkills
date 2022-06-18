package lesson11.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextHandler {
    public String process(String src, String black) {
        StringBuilder builder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(src));
             BufferedReader readerBlack = new BufferedReader(new FileReader(black))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                builder.append(line).append(" "); // после этого текст склеится в одну строку
            }
            String text = builder.toString(); //toString - приведение объекта к строке
            String[] sentence = text.split("\\."); //после этого в [] будут лежать отдельно предложнения

            System.out.println(sentence);
            builder.append("\n"); // append - приклеить(+ плохо использовать) StringBuilder позволяет склеивать не испльзуя память
            StringBuilder builderBlack = new StringBuilder();
            while ((line = readerBlack.readLine()) != null) {
                builderBlack.append(line).append(" "); // после этого текст склеится в одну строку
            }
            String text2 = builderBlack.toString();
            String[] sentence2 = text2.split(" ");
            System.out.println(sentence2[1]);
        } catch (IOException e) {
            System.out.println(e);
        }
        return builder.toString();
    }

    private boolean isBadSentence(String text, String[] sentence2) {
        for (int i = 0; i < sentence2.length; i++) {
            if (text.contains(sentence2[i])) {
                return false;
            }
        }
        return true;
    }
}
