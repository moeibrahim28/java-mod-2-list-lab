package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to my library!");
        Scanner scanner = new Scanner(System.in);
        boolean runValue = true;
        
        Library library = new Library();

        while (runValue) {
            int userChoice = whatIsUserDoing(scanner);
            if (userChoice != 2) {
                switch (userChoice) {
                    case 1:
                        Book book = getBookInfo(scanner);
                        library.add(book);
                        break;
                    case 2:
                        isFound(scanner, library);
                        break;
                    case 3:
                        runValue = false;
                        System.out.println("Thanks for using my library!");
                        break;

                }
            }

            System.out.println(library);
        }
    }

    public static int whatIsUserDoing(Scanner scanner) {
        int userChoice = 0;
        System.out.println("What would you like to do?");
        System.out.println("1. Add a book\n2. Look up a book\n3. Exit");
        String sampleString = scanner.next();
        userChoice = getInput(sampleString);
        return userChoice;
    }

    public static void isFound(Scanner scanner, Library library) {
        String input;
        System.out.println("What book are you searching for? Please enter the title:");
        input = scanner.next();
        boolean containsKey = library.containsBook(input);
        if (containsKey == false) {
            System.out.println("This book does not exist");
        } else {
            System.out.println(library.getBook(input));
        }
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

            return 3;
        }
    }
}
