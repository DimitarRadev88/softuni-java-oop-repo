package com.designPatterns.exercise.builder;

import com.designPatterns.exercise.builder.contact.Contact;
import com.designPatterns.exercise.builder.phonebook.Phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String CREATE_COMMAND = "CREATE";
    private static final String CONTACT_INFO_COMMAND = "INFO";
    private static final String DELETE_CONTACT_COMMAND = "DELETE";
    private static final String PHONEBOOK_COMMAND = "PHONEBOOK";
    private static final String END_COMMAND = "END";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phonebook phonebook = new Phonebook();

        String input = scanner.nextLine();

        while (!END_COMMAND.equals(input)) {
            switch (input) {
                case CREATE_COMMAND -> phonebook.addContact(createContact(readContactInfo(scanner)));
                case CONTACT_INFO_COMMAND -> printContactInfo(phonebook, readContactName(scanner));
                case DELETE_CONTACT_COMMAND -> deleteContact(phonebook, readContactName(scanner));
                case PHONEBOOK_COMMAND -> printAllContactsInfo(phonebook);
                default -> throw new UnsupportedOperationException();
            }

            input = scanner.nextLine();
        }

    }

    private static void printAllContactsInfo(Phonebook phonebook) {
        phonebook.getAllContacts().forEach(System.out::println);
    }

    private static void deleteContact(Phonebook phonebook, String name) {
        phonebook.deleteContactByName(name);
    }

    private static void printContactInfo(Phonebook phonebook, String name) {
        System.out.println(phonebook.getContactByName(name));
    }

    private static String readContactName(Scanner input) {
        System.out.println("Name: ");
        return input.nextLine();
    }

    private static Contact createContact(List<String> contactInfo) {
        return new Contact.Builder()
                .name(contactInfo.get(0))
                .number(contactInfo.get(1))
                .company(contactInfo.get(2))
                .title(contactInfo.get(3))
                .email(contactInfo.get(4))
                .website(contactInfo.get(5))
                .birthday(contactInfo.get(6))
                .build();
    }

    private static List<String> readContactInfo(Scanner input) {
        List<String> contactInfo = new ArrayList<>();

        System.out.print("Name: ");
        contactInfo.add(input.nextLine());

        System.out.print("Number: ");
        contactInfo.add(input.nextLine());

        System.out.print("Company: ");
        contactInfo.add(input.nextLine());

        System.out.print("Title: ");
        contactInfo.add(input.nextLine());

        System.out.print("Email: ");
        contactInfo.add(input.nextLine());

        System.out.print("Website: ");
        contactInfo.add(input.nextLine());

        System.out.print("Birthday: ");
        contactInfo.add(input.nextLine());

        return contactInfo;
    }
}
