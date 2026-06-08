
public class Book {
    private int bookId;
    private String title;
    private String author;
    private String genre;
     
     public Book(int bookId, String title, String author, String genre) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
     }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public String toFileString() {
        return bookId + ";" + title + ";" + author + ";" + genre;
    }
    
    @Override
    public String toString() {
        return String.format("%-5d | %-35s | %-25s | %-10s%n", 
                         bookId, title, author, genre);
        
    }
}
