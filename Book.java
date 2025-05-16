public class Book {

    private String title; 
    private String author; 
    private int year; 
    private boolean isBorrowed = false;
    private String isbn;

    // constructor to add a book
    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
    
    public void borrowBook() {
        if(!isBorrowed) {
            System.out.printf("Book '%s' (ISBN: %s) is now borrowed.\n", title, isbn);
            isBorrowed = true;
        }
        else {
            System.out.println("Book \"" + title + "\" is already borrowed.");
        }
    }

    public void returnBook() {
        if(isBorrowed) {
            System.out.printf("Book '%s' (ISBN: %s) has been returned.\n", title, isbn);
            isBorrowed = false;
        }  
        else {
            System.out.printf("Book '%s' is not borrowed and can't be returned.\n", title);
        }
    }
}