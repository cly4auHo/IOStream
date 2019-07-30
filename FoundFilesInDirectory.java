package iostream;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FoundFilesInDirectory {

    public static void main(String[] args) {
        ArrayList<File> fileList = new ArrayList<>();
        searchFiles(new File("E:\\"), fileList);
        for (File file : fileList) {
            System.out.println(file.getAbsolutePath());
        }
    }

    private static void searchFiles(File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()) {
            File[] derictoryFiles = rootFile.listFiles();
            if (derictoryFiles != null) {
                for (File file : derictoryFiles) {
                    if (file.isDirectory()) {
                        searchFiles(file, fileList);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".jpg")) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
}
