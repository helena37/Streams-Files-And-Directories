package Exercises;

import java.io.*;

public class EP01SumLines {
    public static void main(String[] args) {

        String userDir = System.getProperty("user.dir");
        String filePath = userDir + "/res2/input.txt";

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader(filePath));

            String line = reader.readLine();

            while (line != null) {

                int asciiSum = 0;

                for (char symbol : line.toCharArray()) {
                    asciiSum += symbol;
                }
                System.out.println(asciiSum);
                line = reader.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
