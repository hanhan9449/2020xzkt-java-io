package lesson1;

import lombok.SneakyThrows;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Task2 {
    /**
     * 当前文件夹的相对位置
     */
    final String totalDir = "src/main/resources/";

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.readAndPrint();
    }

    @SneakyThrows
    void readAndPrint() {
        try (
                FileInputStream fis = new FileInputStream(totalDir + "xiaoBai");
                BufferedInputStream bis = new BufferedInputStream(fis)
        ) {
            int ch;
            while ((ch = bis.read()) != -1) {
                System.out.write(ch);
                System.out.flush();
            }
        }
    }
}
