package Lab;

import java.io.File;

public class P08NestedFolders {
    public static void main(String[] args) {

        String userDir = System.getProperty("user.dir");

        File f = new File("/Users/elena/Desktop/SoftUni/Задачи/JAVA ADVANCE/Stream, Files And Directories/04. Java-Advanced-Files-and-Streams-Lab-Resources/Files-and-Streams");

        DFS(f);

    }

   static void DFS(File root) {
        if (root == null) return;

        File[] files = root.listFiles();
        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("DIR: " + file.getName());
                DFS(file);
            } else {
                System.out.println(file.getName());
            }
        }
    }
}
