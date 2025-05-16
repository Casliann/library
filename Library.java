import java.util.Scanner;

public class Library {
        
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }
    
    public Book findBookByIsbn(String isbn) {
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            // Die Methode equals(...) in Java wird verwendet, um zwei Objekte auf inhaltliche Gleichheit zu prüfen – insbesondere bei Strings.
            if(books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
            
        }
        return null;

    }

    public void displayBooks() {
        System.out.println("List of books ISBN:");
            for(int i = 0; i < books.length; i++) {
                System.out.printf("%d. %s (%s)\n", i + 1, books[i].getTitle() ,books[i].getIsbn());
            }
    }
}

