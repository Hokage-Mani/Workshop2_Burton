package org.example;

import java.util.Scanner;

//This template is to help you know where certain code should live
//This is to help you along if you're stuck
public class Main {
    public static void main(String[] args) {
        //You will only need ONE scanner
        Scanner scanner = new Scanner(System.in);
        AvailableBooks.Book[] library = new AvailableBooks.Book[20];

        library[0] = new AvailableBooks.Book("978-0062315007", "The Alchemist");
        library[1] = new AvailableBooks.Book("978-1582405001", "Invincible");
        library[2] = new AvailableBooks.Book("978-0765367302", "Halo: The Fall of Reach");
        library[3] = new AvailableBooks.Book("978-0679456209", "My Life on the Road");
        library[4] = new AvailableBooks.Book("978-0140268867", "The Odyssey");
        library[5] = new AvailableBooks.Book("978-0451524935", "1984");
        library[6] = new AvailableBooks.Book("978-0060935467", "To Kill a Mockingbird");
        library[7] = new AvailableBooks.Book("978-0743273565", "The Great Gatsby");
        library[8] = new AvailableBooks.Book("978-1503290563", "Pride and Prejudice");
        library[9] = new AvailableBooks.Book("978-0316769174", "The Catcher in the Rye");
        library[10] = new AvailableBooks.Book("978-0590353427", "Harry Potter and the Sorcerer's Stone");
        library[11] = new AvailableBooks.Book("978-0544003415", "The Lord of the Rings");
        library[12] = new AvailableBooks.Book("978-0441172719", "Dune");
        library[13] = new AvailableBooks.Book("978-0345339683", "The Hobbit");
        library[14] = new AvailableBooks.Book("978-1451673319", "Fahrenheit 451");
        library[15] = new AvailableBooks.Book("978-0060850524", "Brave New World");
        library[16] = new AvailableBooks.Book("978-0553418026", "The Martian");
        library[17] = new AvailableBooks.Book("978-0593135204", "Project Hail Mary");
        library[18] = new AvailableBooks.Book("978-0062316097", "Sapiens: A Brief History of Humankind");
        library[19] = new AvailableBooks.Book("978-0399590504", "Educated");

        // Create 20 Book objects manually in an array
        //Or have ChatGPT help you

        //This while loop runs forever
        //That means the program will run until we tell it to stop.
        while (true) {
            //Show a menu to the user
            //Use the scanner to take in the user input
            //For example
            System.out.println("\n=== BOOK STORE HOME SCREEN ===");

            System.out.println("1. Show Available Books");

            System.out.println("2. Show Checked Out Books");

            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int userInput = scanner.nextInt();
            if (userInput == 1);
            System.out.println("Available Books: " + );

            //Now use if statements depending on what the person typed
            //How many possibilities are there? Write your if statement structure first

            //Loop through your array of books and use if statements
            //Do we show all books? Only checked-in books?

            //How do we exit the program?
            //This command kills the program at whatever point its at.
            System.exit(0);
        }
    }
}