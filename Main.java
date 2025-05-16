import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[3];
        Library library = new Library(books);

        books[0] = new Book("Das Parfum", "Anton Orangenbaum", 1990, "123456");
        books[1] = new Book("Animal Farm", "George Orwell", 1950, "378262");
        books[2]  = new Book("Schneemann", "Franz Tanzmeister", 1920, "183636");
        
        do {
            System.out.println();
            System.out.println("== Welcome to the library ==");
            System.out.println("Options:");
            System.out.println("1. Borrow a book");
            System.out.println("2. Return a book");
            System.out.println("3. View the list of books");
            System.out.println("4. Exit");

            System.out.print("Enter a number: ");
            choice = scanner.nextInt();
            System.out.println();

            switch(choice) {

                case 1:
                    System.out.print("Enter the ISBN of the book you want to borrow: ");
                    String input = scanner.next();

                    Book foundBook = library.findBookByIsbn(input);

                    if (foundBook != null) {
                        foundBook.borrowBook();
                    } 
                    else {
                        System.out.println("No book found with that ISBN.");
                    }
                    break; 
                case 2:
                    System.out.print("Enter the ISBN of the book you want to return: ");
                    String input2 = scanner.next();

                    Book foundBook2 = library.findBookByIsbn(input2);
                    if (foundBook2 != null) {
                        foundBook2.returnBook();
                    } 
                    else {
                        System.out.println("No book found with that ISBN.");
                    }
                    break;
                case 3:
                    library.displayBooks();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid entry.");
                    break;
            }

        } while(choice != 4);
        
        scanner.close();
    }
}

    

      
  