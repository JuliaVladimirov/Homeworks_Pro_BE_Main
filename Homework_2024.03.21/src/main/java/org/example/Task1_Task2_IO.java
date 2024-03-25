package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1_Task2_IO {
    public static void main(String[] args) {

//  1) Реализуйте механизм сохранения и чтения объекта POJO класса Client в файл.
//  Вот приблизительно наполнение класса Client.
//    private Long id;
//    private String status;
//    private Long taxCode;
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String address;
//    private String phone;
//2) ** Научите данный механизм сохранять также список таких объектов в файл, и читать эти объекты из файла в List.


//  Через IO:
        Client client1 = new Client(974599L, "Active", 73581L, "Tom", "Smith", "tomsmith@gmail.com", "Lake Street 34", "+171333997867");
        Client client2 = new Client(305881L, "Inactive", 74590L, "Bob", "Miller", "bobmiller@gmail.com", "Hill Street 12", "+172774899565");
        Client client3 = new Client(871029L, "Pending", 13835L, "Tim", "Brown", "timbrown@gmail.com", "  Park Street 56", "+179043659102");
        Client client4 = new Client(619341L, "Active", 95579L, "John", "Green", "johngreen@gmail.com", "Oak Street 78", "+176684550143");
        Client client5 = new Client(913835L, "VIP", 93835L, "Mary", "Wilson", "marywilson@gmail.com", "Pine Street 43", "+178774794727");

        ArrayList<Client> clientList = new ArrayList<> (Arrays.asList (client1, client2, client3, client4, client5));

//без сериализации:

        try (BufferedWriter fileWriter = new BufferedWriter(
                new FileWriter("src/main/resources/task1.csv"))) {
            fileWriter.write("Id, Status, Tax Code, First Name, Last Name, Email, Address, Phone");
            fileWriter.newLine();
            for (Client client : clientList) {
                fileWriter.write(String.valueOf(client.getId()));
                fileWriter.write(",");
                fileWriter.write(client.getStatus());
                fileWriter.write(",");
                fileWriter.write(String.valueOf(client.getTaxCode()));
                fileWriter.write(",");
                fileWriter.write(client.getFirstName());
                fileWriter.write(",");
                fileWriter.write(client.getLastName());
                fileWriter.write(",");
                fileWriter.write(client.getEmail());
                fileWriter.write(",");
                fileWriter.write(client.getAddress());
                fileWriter.write(",");
                fileWriter.write(client.getPhone());
                fileWriter.write(",");
                fileWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/task1.csv"))) {

            String line;
            int count = 0;
            ArrayList<Client> clientList1 = new ArrayList<>();
            String[] fields;

            while (true) {
                line = bufferedReader.readLine();

                if (line == null) {
                    break;
                }
                count = count + 1;
                if (count > 1) {
                    fields = line.split(" *, *");

                    clientList1.add(new Client(
                            Long.parseLong(fields[0].trim()),
                            fields[1],
                            Long.parseLong(fields[2].trim()),
                            fields[3],
                            fields[4],
                            fields[5],
                            fields[6],
                            fields[7]));
                }
            }
            System.out.println("Без сериализации");
            System.out.println(clientList1);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

// Сериализация:


        try (FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/task2.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(clientList);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/task2.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            ArrayList<Client> clientList2;

            clientList2=(ArrayList<Client>)objectInputStream.readObject();

            System.out.println("С сериализацией");
            System.out.println(clientList2);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

