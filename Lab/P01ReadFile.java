package Lab;

import java.io.*;

public class P01ReadFile {
    public static void main(String[] args) {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String userDir = System.getProperty("user.dir");
        String path = userDir + "/res/input.txt";

        try (FileInputStream fis = new FileInputStream(path)) {
            int oneByte = fis.read();

            while (oneByte >= 0) {
                String res = Integer.toBinaryString(oneByte);
                System.out.print(res + " ");
                oneByte = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
