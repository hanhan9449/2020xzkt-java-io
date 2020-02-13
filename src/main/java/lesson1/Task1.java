package lesson1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Task1 {
    /**
     * 当前文件夹的相对位置
     */
    final String totalDir = "src/main/resources/";

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.makeAndCopy();
    }

    @lombok.SneakyThrows
    void makeAndCopy() {

        try (FileInputStream in = new FileInputStream(totalDir + "xiaoBai");
             FileOutputStream out = new FileOutputStream(totalDir + "daBai");
        ) {
            int ch;
            while ((ch = in.read()) != -1) {
                out.write(ch);
            }
        }
    }
}
