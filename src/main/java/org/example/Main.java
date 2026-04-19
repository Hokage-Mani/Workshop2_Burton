package org.example;

import java.util.Scanner;

//This template is to help you know where certain code should live
//This is to help you along if you're stuck
public class Main {
    public static void main(String[] args) {
        //You will only need ONE scanner
        Scanner scanner = new Scanner(System.in);
        Book[] iD = new Book[20];


        iD[0] = new Book("978-0062315007", "The Alchemist");
        iD[1] = new Book("978-1582405001", "Invincible");
        iD[2] = new Book("978-0765367302", "Halo: The Fall of Reach");
        iD[3] = new Book("978-0679456209", "My Life on the Road");
        iD[4] = new Book("978-0140268867", "The Odyssey");
        iD[5] = new Book("978-0451524935", "1984");
        iD[6] = new Book("978-0060935467", "To Kill a Mockingbird");
        iD[7] = new Book("978-0743273565", "The Great Gatsby");
        iD[8] = new Book("978-1503290563", "Pride and Prejudice");
        iD[9] = new Book("978-0316769174", "The Catcher in the Rye");
        iD[10] = new Book("978-0590353427", "Harry Potter and the Sorcerer's Stone");
        iD[11] = new Book("978-0544003415", "The Lord of the Rings");
        iD[12] = new Book("978-0441172719", "Dune");
        iD[13] = new Book("978-0345339683", "The Hobbit");
        iD[14] = new Book("978-1451673319", "Fahrenheit 451");
        iD[15] = new Book("978-0060850524", "Brave New World");
        iD[16] = new Book("978-0553418026", "The Martian");
        iD[17] = new Book("978-0593135204", "Project Hail Mary");
        iD[18] = new Book("978-0062316097", "Sapiens: A Brief History of Humankind");
        iD[19] = new Book("978-0399590504", "Educated");

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
            if (userInput == 1){
                System.out.println("\n--- Available Books ---");
                for(int i = 0; i < iD.length; i++){
                    if (iD[i] != null){
                        if(iD[i].isCheckedOut() == false){
                            System.out.println("ID: " + i + " | Title: " + iD[i].getTitle());

                        }

                    }else if(userInput ==2){
                        //for showing checked out books later
                        System.out.println("\n--- Checked Out Books ---");
                        if(iD[i].isCheckedOut() == true){
                            System.out.println("ID: " + i + "is already checked out.");
                        }

                    }
                }

            }
//            System.out.println("Enter the ID of the book you want: ");
//                int chosenId = scanner.nextInt();
//
//            System.out.println("Enter your name: ");
//            String userName = scanner.next();
//            iD[chosenId].setCheckedOut(true);
//            //For the next line I chose what IntellaJ recommended when I intially tried to make it (userName).
//            iD[chosenId].setName(userName);
//            System.out.println("Enjoy reading! " + iD[chosenId].getTitle() + " has been checked out by " + userName);




            //if(iD = 0)
            //System.out.println("Available Books: " + );

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