import java.io.*;
import javax.swing.JOptionPane;

public class BookList {
    private Book [] bookList;
    private int count;
    private int nextId;
    private File file = new File("LibraryDB.txt");
    
    public BookList(){
        bookList = new Book [1000];
        count = 0;
        nextId = 1;
        loadFile();
    }
    
    // ================= CHECKS =================
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == bookList.length;
    }
    
    // ================= GETTERS =================
    public int getCount(){
        return count;
    }
    
    public int getNextId() {
        return nextId;
    }
    
    public Book getBookByIndex(int index){
        return bookList[index];
    }
    
    // ================= LOAD FILE =================
    public void loadFile(){
        if (!file.exists()) {
            System.err.println("Database file not found at: " + file);
            return;
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            count = 0;
            int maxId = 0;
            while ((line = reader.readLine()) != null){
                String [] data = line.split(";");
                if(data.length == 4){
                    int id = Integer.parseInt(data[0]);
                    String title = data[1];
                    String author = data[2];
                    String genre = data[3];
                    bookList[count++] = new Book(id, title, author, genre);
                    if (id > maxId) {
                        maxId = id;
                    }
                }
            }
            nextId = maxId + 1;  
            reader.close();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error Reading File");
        }
    }
    
    // ================= SAVE FILE =================
    public void saveFile(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < count; i++) { 
                bw.write(bookList[i].toFileString());
                bw.newLine();
            }
            bw.close();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error Saving File");
        }
    }
    
    // ================= ADD BOOK =================
    public void addBook(Book newData){
        if(isFull()){
            JOptionPane.showMessageDialog(null,"List is full. Cannot Add Book Anymore.","Info",JOptionPane.INFORMATION_MESSAGE);
            return;
        }else {
            bookList[count] = new Book(nextId, newData.getTitle(), newData.getAuthor(), newData.getGenre());
            count++;
            nextId++;
            saveFile();
        }      
    }
    // ================= DELETE BOOK =================
    public void deleteBook(int id){
        if(isEmpty()){
            JOptionPane.showMessageDialog(null,"List is empty.","Info",JOptionPane.INFORMATION_MESSAGE);
        }else{
            int found = search(id);
            if(found == -1){
               JOptionPane.showMessageDialog(null,"Book not found.","Info",JOptionPane.INFORMATION_MESSAGE);
            }else{       
                for(int i = found; i<count-1; i++){
                    bookList[i] = bookList[i+1];
                }
                count--;
                JOptionPane.showMessageDialog(null,"Book Deleted successfully!","Info",JOptionPane.INFORMATION_MESSAGE);
                saveFile();
            }
        }
    }
    
    // ================= SEARCH =================
    public int search(int id){
        for(int i = 0; i<count; i++){
            if(bookList[i].getBookId() == id){
                return i;
            }
        }               
        return -1;
    }
    
    public void updateBook(int id, Book newData){
        int found = search(id);
        if(found == -1){
            JOptionPane.showMessageDialog(null,"Book not found.","Info",JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{       
            bookList[found] = new Book(id, newData.getTitle(), newData.getAuthor(), newData.getGenre());
            saveFile();
        }
    }
    
    // ================= SELECTION SORT BY ID =================
    public void sortById() {
        for (int i = 0; i < count - 1; i++) {
            int min = i;
            for (int j = i + 1; j < count; j++) {
                if (bookList[j].getBookId() < bookList[min].getBookId()) {
                    min = j;
                } 
            }
            Book temp = bookList[i];
            bookList[i] = bookList[min];
            bookList[min] = temp;  
        }
    }
    
    // ================= SELECTION SORT BY TITLE =================
    public void sortByTitle() {
        for (int i = 0; i < count - 1; i++) {
            int min = i;
            for (int j = i + 1; j < count; j++) {
                if (bookList[j].getTitle().compareToIgnoreCase(bookList[min].getTitle()) < 0) {
                    min = j;
                }  
            }
            Book temp = bookList[i];
            bookList[i] = bookList[min];
            bookList[min] = temp;  
        }
    }
    
    // ================= SELECTION SORT BY AUTHOR =================
    public void sortByAuthor() {
        for (int i = 0; i < count - 1; i++) {
            int min = i;
            for (int j = i + 1; j < count; j++) {
                if (bookList[j].getAuthor().compareToIgnoreCase(bookList[min].getAuthor()) < 0) {
                    min = j;
                }
            }
            Book temp = bookList[i];
            bookList[i] = bookList[min];
            bookList[min] = temp;  
        }
    }
    
    // ================= SELECTION SORT BY GENRE =================
    public void sortByGenre() {
        for (int i = 0; i < count - 1; i++) {
            int min = i;
            for (int j = i + 1; j < count; j++) {
                if (bookList[j].getGenre().compareToIgnoreCase(bookList[min].getGenre()) < 0) {
                    min = j;
                }
            }
            Book temp = bookList[i];
            bookList[i] = bookList[min];
            bookList[min] = temp;  
        }
    }
}

