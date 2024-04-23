package org.example.homework_2024_03_19;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

//1. Написать приложение, которое будет копировать информацию из файла в другой файл.
//Путь к существующему файлу и имя нового файла нужно вводить с клавиатуры.

//  Решила сначала создать пару файлов и заполнить их данными, чтобы было из чего копировать информацию:

        try (FileWriter writer = new FileWriter("C:\\Temp\\test\\notes.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(
                    "О сколько нам открытий чудных\n" +
                            "Готовят просвещенья дух\n" +
                            "И опыт, сын ошибок трудных,\n" +
                            "И гений, парадоксов друг,\n" +
                            "И случай, бог изобретатель.");

        } catch (IOException e) {
            e.printStackTrace();
        }

//  Это иврит, захотелось посмотреть как ведет себя нестандартный язык
        try (FileWriter writer = new FileWriter("C:\\Temp\\test\\files.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(
                    "אם נלמד לתת כמו שאנחנו לוקחים\n" +
                            "אם נדע להקשיב לפני שמתווכחים\n" +
                            "אם נשקול שנית בטרם מתרתחים\n" +
                            "\n" +
                            "אם לעיתים נוותר ונהיה הסולחים\n" +
                            "אם נשתדל לשמח גם אחרים\n" +
                            "אם נזכור שבסבלנות כולנו מנצחים...\n" +
                            "\n" +
                            "אז נדע סוף סוף ויידעו כולם\n" +
                            "שגדלנו ובגרנו בתור בני אדם.");

        } catch (IOException e) {
            e.printStackTrace();
        }


//  Копирование информации из файла в другой файл
//  Вариант с InputStream/OutputStream;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите путь к существующему файлу");
        String filePath = scanner.nextLine();
        System.out.println("Введите имя нового файла");
        String newFileName = scanner.nextLine();

        int index = filePath.lastIndexOf(File.separatorChar);
        String subPath = filePath.substring(0, index + 1);
        String newPath = subPath.concat(newFileName);

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

                FileOutputStream fileOutputStream = new FileOutputStream(newPath);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)
        ) {
            int count;
            while ((count = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(count);
            }
            if (Files.exists(Path.of(newPath))) {
                System.out.println("Файл " + newFileName + " создан");
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

//  Копирование информации из файла в другой файл
//  Вариант с Reader/Writer

        System.out.println("Введите путь к существующему файлу");
        String filePath1 = scanner.nextLine();
        System.out.println("Введите имя нового файла");
        String newFileName1 = scanner.nextLine();

        int index1 = filePath1.lastIndexOf(File.separatorChar);
        String subPath1 = filePath1.substring(0, index1 + 1);
        String newPath1 = subPath1.concat(newFileName1);

        try (
                FileReader fileReader = new FileReader(filePath1);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                FileWriter fileWriter = new FileWriter(newPath1);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line + "\n");
            }
            if (Files.exists(Path.of(newPath1))) {
                System.out.println("Файл " + newFileName1 + " создан");
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

