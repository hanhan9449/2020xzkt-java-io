package lesson1;

import lombok.SneakyThrows;

import java.io.*;

public class Task3 {
    /**
     * 当前文件夹的相对位置
     */
    final String totalDir = "src/main/resources/";

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.readAndPrint();
        task3.readAndCreateANewFile();
    }

    @SneakyThrows
    void readAndPrint() {
        FileReader rd = new FileReader(totalDir + "xiaoBai");
        int ch;
        while ((ch = rd.read()) != -1) {
            System.out.print((char)ch);
        }

    }
    @SneakyThrows
    void readAndCreateANewFile() {
        FileReader rd = new FileReader(totalDir + "xiaoBai");
        FileWriter fw = new FileWriter(totalDir + "daDaBai");
        int ch;
        while((ch = rd.read()) != -1) {
            fw.write(ch);
            fw.flush();
        }
    }
}
