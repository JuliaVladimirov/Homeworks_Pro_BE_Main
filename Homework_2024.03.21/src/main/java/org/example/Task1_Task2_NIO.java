package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Task1_Task2_NIO {
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


//  Через NIO:

        Client client1 = new Client(974599L, "Active", 73581L, "Tom", "Smith", "tomsmith@gmail.com", "Lake Street 34", "+171333997867");
        Client client2 = new Client(305881L, "Inactive", 74590L, "Bob", "Miller", "bobmiller@gmail.com", "Hill Street 12", "+172774899565");
        Client client3 = new Client(871029L, "Pending", 13835L, "Tim", "Brown", "timbrown@gmail.com", "  Park Street 56", "+179043659102");
        Client client4 = new Client(619341L, "Active", 95579L, "John", "Green", "johngreen@gmail.com", "Oak Street 78", "+176684550143");
        Client client5 = new Client(913835L, "VIP", 93835L, "Mary", "Wilson", "marywilson@gmail.com", "Pine Street 43", "+178774794727");

        List<Client> clientList = List.of(client1, client2, client3, client4, client5);

        Path path = Paths.get("src/main/resources/task1.csv");
        if (Files.notExists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8,
                StandardOpenOption.WRITE, StandardOpenOption.APPEND)) {
            for (Client client : clientList) {
                try {
                    writer.write(String.valueOf(client.getId()));
                    writer.write(",");
                    writer.write(client.getStatus());
                    writer.write(",");
                    writer.write(String.valueOf(client.getTaxCode()));
                    writer.write(",");
                    writer.write(client.getFirstName());
                    writer.write(",");
                    writer.write(client.getLastName());
                    writer.write(",");
                    writer.write(client.getEmail());
                    writer.write(",");
                    writer.write(client.getAddress());
                    writer.write(",");
                    writer.write(client.getPhone());
                    writer.write(",");
                    writer.newLine();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        String line;
        int count = 0;
        List<Client> clientList1 = new ArrayList<>();
        String[] fields;

        if (Files.exists(path)) {
            try (BufferedReader bufferedReader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
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
                System.out.println(clientList1);


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
