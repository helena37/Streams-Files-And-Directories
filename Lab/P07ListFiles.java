package Lab;

import java.io.File;

public class P07ListFiles {
    public static void main(String[] args) {

        String userDir = System.getProperty("user.dir");

        File f = new File("/Users/elena/Desktop/SoftUni/Задачи/JAVA ADVANCE/Stream, Files And Directories/04. Java-Advanced-Files-and-Streams-Lab-Resources/Files-and-Streams");
        File[] allFiles = f.listFiles();

        if (allFiles == null) {
            return;
        }

        for (File file : allFiles) {
            if (!file.isDirectory()) {
                System.out.println(String.format("%s: [%d]",
                        file.getName(), file.length()));
            }
        }
    }
}
