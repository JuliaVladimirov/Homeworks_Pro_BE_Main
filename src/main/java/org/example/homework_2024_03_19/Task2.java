package org.example.homework_2024_03_19;

import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

//2*. Написать приложение, которое будет копировать содержимое одной папки в другую со всеми вложениями
//(другие папки, файлы).
//Путь к существующей папке и имя новой папки нужно вводить с клавиатуры.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к существующей папке");
        String dirPath = scanner.nextLine();
        File dir = new File(dirPath);

        System.out.println("Введите название новой директории");
        String newDirName = scanner.nextLine();

        int index = dirPath.lastIndexOf(File.separatorChar);
        String subPath = dirPath.substring(0, index + 1);
        String newPath = subPath.concat(newDirName);

        File newDir = new File(newPath);
        boolean created = newDir.mkdir();
        if (created)
            System.out.println("Папка создана");

        copyDirectory(dir, newDir);

    }


    public static void copyDirectory(File dir, File newDir) {

        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {

                    String newPath = newDir.getPath().concat(File.separator + file.getName());

                    File newDir1 = new File(newPath);
                    boolean created = newDir1.mkdir();
                    if (created){
                        newDir = newDir1;
                        copyDirectory(file, newDir);
                    }

                } else {
                    File file1 = new File(newDir, file.getName());


                    try (
                            FileInputStream fileInputStream = new FileInputStream(file);
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

                            FileOutputStream fileOutputStream = new FileOutputStream(file1);
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)
                    ) {
                        int count;
                        while ((count = bufferedInputStream.read()) != -1) {
                            bufferedOutputStream.write(count);
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);

                    }
                }
            }
        }
    }
}

