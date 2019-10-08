package Lab;

import java.io.*;

public class P03CopyBytes {
    public static void main(String[] args) {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String userDir = System.getProperty("user.dir");
        String pathIn = userDir + "/res/input.txt";
        String pathOut = userDir + "/res/03.CopyBytesOutput.txt";

        try (FileInputStream fis = new FileInputStream(pathIn);
             FileOutputStream fos = new FileOutputStream(pathOut)) {

            int oneByte = fis.read();

            while (oneByte >= 0) {

                if (oneByte == 32 || oneByte == 10) {
                    fos.write(oneByte);
                } else {
                    String byteAsText  = String.valueOf(oneByte);

                    for (int i = 0; i < byteAsText.length(); i++) {
                        int symbol = byteAsText.charAt(i);
                        fos.write(symbol);
                    }
                }

                oneByte = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
