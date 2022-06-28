package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to my library!");
        Scanner scanner = new Scanner(System.in);
        boolean runValue = true;
        int userChoice = whatIsUserDoing(scanner);
        Library library = new Library();

        while (runValue) {
            if (userChoice != 2) {
                Book book = getBookInfo(scanner);
                library.add(book);
                userChoice = whatIsUserDoing(scanner);
            } else {
                runValue = false;
                System.out.println("Thanks for using my library!");
            }
        }

        
        System.out.println(library);
    }

    public static int whatIsUserDoing(Scanner scanner) {
        int userChoice = 0;
        System.out.println("What would you like to do?");
        System.out.println("1. Add a book\n2. Exit");
        String sampleString = scanner.next();
        userChoice = getInput(sampleString);
        return userChoice;
    }

    public static Book getBookInfo(Scanner scanner) {
        System.out.println("Please enter the title of the book:");
        String title = scanner.next();
        System.out.println("Please enter the genre of the book:");
        String genre = scanner.next();
        System.out.println("Please enter the number of pages in the book:");
        String sampleString = scanner.next();
        int numPages = getInput(sampleString);
        Book book = new Book(title, genre, numPages);
        return book;
    }

    private static int getInput(String sampleString) {
        try {
            return Integer.parseInt(sampleString);
        } catch (Exception e) {

            return 2;
        }
    }
}
