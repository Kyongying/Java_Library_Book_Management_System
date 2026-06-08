import java.awt.*;
import javax.swing.*;
public class LibraryManagementGUI extends javax.swing.JFrame {
    private BookList bookList = new BookList() ;
    
    public LibraryManagementGUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        editBTN = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();
        sortBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Library Book Management", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("STFangsong", 1, 24))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(391, 320));

        addBTN.setFont(new java.awt.Font("STKaiti", 1, 18)); // NOI18N
        addBTN.setText("Add Book");
        addBTN.setMaximumSize(new java.awt.Dimension(105, 30));
        addBTN.setMinimumSize(new java.awt.Dimension(105, 30));
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        deleteBTN.setFont(new java.awt.Font("STKaiti", 1, 18)); // NOI18N
        deleteBTN.setText("Delete Book");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        editBTN.setFont(new java.awt.Font("STKaiti", 1, 18)); // NOI18N
        editBTN.setText("Update Book");
        editBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBTNActionPerformed(evt);
            }
        });

        searchBTN.setFont(new java.awt.Font("STKaiti", 1, 18)); // NOI18N
        searchBTN.setText("Search Book");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        sortBTN.setFont(new java.awt.Font("STKaiti", 1, 18)); // NOI18N
        sortBTN.setText("Sort Book");
        sortBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(sortBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editBTN)
                .addGap(18, 18, 18)
                .addComponent(searchBTN)
                .addGap(18, 18, 18)
                .addComponent(deleteBTN)
                .addGap(18, 18, 18)
                .addComponent(sortBTN)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        exitBTN.setFont(new java.awt.Font("STKaiti", 1, 18)); // NOI18N
        exitBTN.setForeground(new java.awt.Color(255, 51, 51));
        exitBTN.setText("EXIT");
        exitBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed

    // First, ask for Book ID
    JTextField idTF = new JTextField();
    int check = JOptionPane.showConfirmDialog(this, 
        new Object[]{"Enter Book ID:", idTF}, 
        "Delete Book", 
        JOptionPane.OK_CANCEL_OPTION);
    
    if (check != JOptionPane.OK_OPTION) {
        return;
    }
    
    try {
        int id = Integer.parseInt(idTF.getText().trim());
        
        // Search for the book first
        int index = bookList.search(id);
        
        if (index == -1) {
            // Book not found
            JOptionPane.showMessageDialog(this, 
                "Book with ID " + id + " not found.", 
                "Book Not Found", 
                JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        // Get the book details
        Book bookToDelete = bookList.getBookByIndex(index);
        
        // Display book details and ask for confirmation
        JTextArea bookDetails = new JTextArea();
        bookDetails.setEditable(false);
        bookDetails.setFont(new Font("Monospaced", Font.PLAIN, 12));
        bookDetails.append("Book Details:\n");
        bookDetails.append("===================\n");
        bookDetails.append("ID    : " + bookToDelete.getBookId() + "\n");
        bookDetails.append("Title : " + bookToDelete.getTitle() + "\n");
        bookDetails.append("Author: " + bookToDelete.getAuthor() + "\n");
        bookDetails.append("Genre : " + bookToDelete.getGenre() + "\n");
        
        // Ask for confirmation
        int confirm = JOptionPane.showConfirmDialog(this,
            new Object[]{
                "Book to delete:",
                new JScrollPane(bookDetails),
                "Are you sure you want to delete this book?"
            },
            "Confirm Deletion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE);
        
        if (confirm == JOptionPane.YES_OPTION) {
            // Perform deletion (void method, doesn't return boolean)
            bookList.deleteBook(id);
            
            // Show success message
            JOptionPane.showMessageDialog(this,
                "Book deleted successfully!",
                "Deletion Successful",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                "Deletion cancelled.",
                "Cancelled",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this,
            "Invalid Book ID format. Please enter a valid number.",
            "Error",
            JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_deleteBTNActionPerformed

    private void editBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBTNActionPerformed
         while(true){
            JTextField idTF = new JTextField();

            int check = JOptionPane.showConfirmDialog(this,new Object[]{"Enter Book ID:", idTF},"Update Book",
 	      JOptionPane.OK_CANCEL_OPTION);

            if (check != JOptionPane.OK_OPTION) 
                return;
            try {
                int id = Integer.parseInt(idTF.getText().trim());
                // ===== USE search(id) =====
                int index = bookList.search(id);
                bookList.sortById();
                // NOT FOUND SHOW CURRENT BOOKS
                if (index == -1) {
                    StringBuilder sb = new StringBuilder("Current Books in System:\n");
                    sb.append(String.format("%-3s | %-35s | %-25s | %-10s%n", "ID", "Title", "Author", "Genre"));
                    sb.append("-------------------------------------------------------------------------------------\n");

                    for (int i = 0; i <bookList.getCount(); i++) {
                        sb.append(bookList.getBookByIndex(i).toString());
                    }

                    JTextArea ta = new JTextArea(sb.toString());
                    ta.setEditable(false);
                    ta.setFont(new Font("Monospaced", Font.BOLD, 9));
                    JScrollPane scrollPane = new JScrollPane(ta);
                    scrollPane.setPreferredSize(new Dimension(500, 300));
                    JOptionPane.showMessageDialog(this,scrollPane,"Available Books",JOptionPane.INFORMATION_MESSAGE);
                   
                    // ASK TO TRY AGAIN
                    int retry = JOptionPane.showConfirmDialog(this,"Do you want to try another Book ID?","Try Again",
 			                           JOptionPane.YES_NO_OPTION);
                    if (retry == JOptionPane.YES_OPTION) {
                        continue; // back to ID input
                    } else {
                        return;   // stop update
                    }
                }

                // ===== GET BOOK USING INDEX =====
                Book b = bookList.getBookByIndex(index);

                // ===== PRE-FILL DATA =====
                JTextField txtTitle = new JTextField(b.getTitle());
                JTextField txtAuthor = new JTextField(b.getAuthor());
                JComboBox<String> genreCB = new JComboBox<>(new String[]{"Fiction", "Novel", "Horror", "Drama",
                                                                         "Fantasy", "Mystery", "Comedy",
                                                                         "Education", "Science Fiction", "Others"});
                genreCB.setSelectedItem(b.getGenre());

                Object[] msg = {"Title:", txtTitle,
                               	"Author:", txtAuthor,
                                "Genre:", genreCB};

                int option = JOptionPane.showConfirmDialog(this,msg,"Update Book (ID: " + b.getBookId() + ")",
                                                                               JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION) {
                    if (txtTitle.getText().trim().isEmpty() || txtAuthor.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(this,"Please fill all fields","Input Error",
                                                 JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    bookList.updateBook(id,new Book(id,txtTitle.getText().trim(),txtAuthor.getText().trim(),genreCB.getSelectedItem().toString()));
                    JOptionPane.showMessageDialog(this,"Book updated successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this,"Invalid Book ID format","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_editBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        JTextField titleTF = new JTextField();
        JTextField authorTF = new JTextField();
        JComboBox<String> genreCB =
            new JComboBox<>(new String[]{"-", "Fiction", "Novel", "Horror", "Drama"
                                         ,"Fantasy", "Mystery", "Comedy"
                                         ,"Education", "Science Fiction", "Others"});

        Object[] msg = {"Book ID: " + bookList.getNextId(),
                        "Title:", titleTF,
                        "Author:", authorTF,
                        "Genre:", genreCB};
        int option = JOptionPane.showConfirmDialog(this, msg, "Add Book", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            String title = titleTF.getText().trim();
            String author = authorTF.getText().trim();
            String genre = genreCB.getSelectedItem().toString();
            
            if (title.isEmpty() || author.isEmpty() || genreCB.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Please fill all fields");
                return;
            }

            bookList.addBook(new Book(0, title, author, genre));
            
            JOptionPane.showMessageDialog(this,"Book added successfully!\nBook ID: " + (bookList.getNextId()-1));
        }                          
    }//GEN-LAST:event_addBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        if(bookList.isEmpty()){
            JOptionPane.showMessageDialog(this,"No books in the system.","Info",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JTextField idTF = new JTextField();
        int option = JOptionPane.showConfirmDialog(this,new Object[]{"Enter Book ID:", idTF},"Search Book",
            	            JOptionPane.OK_CANCEL_OPTION);

        if (option != JOptionPane.OK_OPTION){
            return;
        }
        try {
            int id = Integer.parseInt(idTF.getText().trim());
            int index = bookList.search(id);

            if (index == -1) {
                JOptionPane.showMessageDialog(this, "Book not found.");
                return;
            }

            Book b = bookList.getBookByIndex(index);

            JTextArea ta = new JTextArea( "Book ID : " + b.getBookId() + "\n" +
                			"Title   : " + b.getTitle() + "\n" +
              			  	"Author  : " + b.getAuthor() + "\n" +
                			"Genre   : " + b.getGenre());
            ta.setEditable(false);
            ta.setFont(new Font("Monospaced", Font.PLAIN, 12));
            JOptionPane.showMessageDialog(this,new JScrollPane(ta), "Search Result",JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid ID.");
        }
    }//GEN-LAST:event_searchBTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        int exit = JOptionPane.showConfirmDialog(this, "Are you want to exit?", 
        "Confirm Page", JOptionPane.YES_NO_OPTION);
        if (exit == JOptionPane.YES_OPTION){ 
            System.exit(0);
        }
    }//GEN-LAST:event_exitBTNActionPerformed

    private void sortBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortBTNActionPerformed
        if (bookList.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No books to sort.");
        return;
        }

        String[] options = {"Sort by ID",
                            "Sort by Title",
                            "Sort by Author",
                            "Sort by Genre"};

        int choice = JOptionPane.showOptionDialog(this,"Choose sorting method:","Sort Books",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,
            null, options, options[0]);

        if (choice == 0){
            bookList.sortById();
        }else if (choice == 1){
            bookList.sortByTitle();
        }else if (choice == 2){
            bookList.sortByAuthor();
        }else if(choice == 3){
            bookList.sortByGenre();
        }else{
            return;
        }

        JTextArea ta = new JTextArea();
        ta.setEditable(false);
        ta.setFont(new Font("Monospaced", Font.PLAIN, 10));

        ta.append(String.format("%-3s | %-35s | %-25s | %-10s%n","ID", "Title", "Author", "Genre"));
        ta.append("-------------------------------------------------------------------------------------\n");

        for (int i = 0; i < bookList.getCount(); i++) {
            ta.append(bookList.getBookByIndex(i).toString());
        }
        JScrollPane scrollPane = new JScrollPane(ta);
        scrollPane.setPreferredSize(new Dimension(600, 300));
        JOptionPane.showMessageDialog(this,scrollPane,"Sorted Book List",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_sortBTNActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryManagementGUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton editBTN;
    private javax.swing.JButton exitBTN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton searchBTN;
    private javax.swing.JButton sortBTN;
    // End of variables declaration//GEN-END:variables
}
