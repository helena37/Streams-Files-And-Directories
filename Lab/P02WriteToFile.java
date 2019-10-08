package Lab;

import java.io.*;

public class P02WriteToFile {
    public static void main(String[] args) {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String userDir = System.getProperty("user.dir");

        String pathIn = userDir + "/res/input.txt";
        String pathOut = userDir + "/res/02.WriteToFileOutput.txt";

        try (FileInputStream fis = new FileInputStream(pathIn);
        FileOutputStream fos = new FileOutputStream(pathOut)) {

            int oneByte = fis.read();

            while (oneByte >= 0) {
                if (oneByte != '.' &&
                oneByte != ',' &&
                oneByte != '?' &&
                oneByte != '!') {
                    fos.write(oneByte);
                }
                oneByte = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
