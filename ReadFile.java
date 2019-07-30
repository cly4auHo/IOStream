package iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadFile {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\Арсен\\Desktop\\Новый текстовый документ.txt";
        printFile(fileName);

    }

    public static void m(String name1, String name2) {

        byte[] array = null;

        try (InputStream input = new FileInputStream(name1);
                BufferedInputStream bis = new BufferedInputStream(input, 1000000);
                OutputStream os = new FileOutputStream(name2);
                BufferedOutputStream bos = new BufferedOutputStream(os, 20000);) {

//            array = new byte[input.available()];
//            input.read(array);
//            String s = new String(array, "Cp1251"); // чтобы читать русский язык, его кодировка в винде
//            System.out.println(s);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("File not found");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Can`t read file");
        }
    }

    public static void printFile(String fileName) {

        byte[] array = null;

        try (InputStream input = new FileInputStream(fileName);) {

            array = new byte[input.available()];
            input.read(array);
            String s = new String(array, "Cp1251"); // чтобы читать русский язык, его кодировка в винде
            System.out.println(s);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("File not found");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Can`t read file");
        }
    }
}
