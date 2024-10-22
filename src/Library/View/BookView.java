/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.View;


import Library.Dao.BookDao;
import Library.Model.Book;
import Library.Model.Bookcategory;
import Library.Util.HibernateUtil;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.lang.String;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jean claude
 */
public class BookView extends javax.swing.JFrame {

    /**
     * Creates new form BookForm
     */
    public BookView() {
        initComponents();
        clear_fields();
        clear_fields2();
        populateBook();
        populateBookCat();
        setTitle("Book Records");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtbookid = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtPages = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        btndeleterecord = new javax.swing.JButton();
        txtpub = new javax.swing.JTextField();
        btnupdatebook = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cbBookcategory = new javax.swing.JComboBox<>();
        dob = new com.toedter.calendar.JDateChooser();
        btnsave = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCategoryId3 = new javax.swing.JTextField();
        txtCategoryName3 = new javax.swing.JTextField();
        btnBookCategory3 = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("BookId:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Title:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("PublishingHouse:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("DateOfPublication:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Author:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Pages:");

        bookTable.setBackground(new java.awt.Color(0, 204, 102));
        bookTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookID", "Title", "PublishingHouse", "DateOfPublication", "Author", "Pages", "BookCategory"
            }
        ));
        bookTable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bookTableMouseMoved(evt);
            }
        });
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookTableMouseEntered(evt);
            }
        });
        bookTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bookTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(bookTable);

        btndeleterecord.setBackground(new java.awt.Color(0, 204, 102));
        btndeleterecord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndeleterecord.setText("DELETE");
        btndeleterecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleterecordActionPerformed(evt);
            }
        });

        btnupdatebook.setBackground(new java.awt.Color(0, 204, 102));
        btnupdatebook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdatebook.setText("UPDATE");
        btnupdatebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatebookActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Book Category:");

        cbBookcategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbBookcategoryMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbBookcategoryMousePressed(evt);
            }
        });

        btnsave.setBackground(new java.awt.Color(0, 204, 102));
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(txtPages)
                            .addComponent(txtpub, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbookid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbBookcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnupdatebook)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndeleterecord, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(217, 217, 217)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtbookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtpub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(cbBookcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndeleterecord, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnupdatebook, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane4.addTab("Book", jPanel1);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("CategoryId:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("CategoryName:");

        btnBookCategory3.setBackground(new java.awt.Color(0, 204, 102));
        btnBookCategory3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBookCategory3.setText("SAVE");
        btnBookCategory3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookCategory3ActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(0, 204, 102));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(0, 204, 102));
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnupdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btndelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBookCategory3))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCategoryId3)
                        .addComponent(txtCategoryName3, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCategoryId3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtCategoryName3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBookCategory3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        categoryTable.setBackground(new java.awt.Color(0, 204, 102));
        categoryTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CategoryID", "CategoryName"
            }
        ));
        categoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(categoryTable);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("BookCategory ", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleterecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleterecordActionPerformed
        Book b = new Book(txtbookid.getText());
        BookDao bdao = new BookDao();
        bdao.deleteBook(b);
        JOptionPane.showMessageDialog(this, "Data deleted Successfully!!");
        clear_fields();
        populateBook();
    }//GEN-LAST:event_btndeleterecordActionPerformed

    private void btnupdatebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatebookActionPerformed
        Book b = new Book();
        b.setBookId(txtbookid.getText());
        b.setTitle(txtTitle.getText());
        b.setPublishinghouse(txtpub.getText());
        b.setDateofpublication(new Date(dob.getDate().getTime()));
        b.setAuthor(txtAuthor.getText());
        b.setPages(Integer.parseInt(txtPages.getText()));
        b.setBookcategory(cbBookcategory.getSelectedItem().toString());
        BookDao bdao = new BookDao();
        bdao.updateBook(b);
        JOptionPane.showMessageDialog(this, "Data updated Successfully!!");
        clear_fields();
        populateBook();
    }//GEN-LAST:event_btnupdatebookActionPerformed

    private void cbBookcategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbBookcategoryMouseClicked
        
    }//GEN-LAST:event_cbBookcategoryMouseClicked

    private void cbBookcategoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbBookcategoryMousePressed
        cbBookcategory.removeAllItems();
        Transaction trans = null;
        Session sess = HibernateUtil.getSessionFactory().openSession();
        trans = sess.beginTransaction();
        SQLQuery query = sess.createSQLQuery("select categoryName from BookCategory");
        List ls = query.list();
        for(Object cat : ls){
            cbBookcategory.addItem((String) cat);
        }
    }//GEN-LAST:event_cbBookcategoryMousePressed

    private void btnBookCategory3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookCategory3ActionPerformed
        Bookcategory bc = new Bookcategory();
        bc.setCategoryid(txtCategoryId3.getText());
        bc.setCategoryname(txtCategoryName3.getText());
        BookDao bdao = new BookDao();
        bdao.saveBookcategory(bc);
        JOptionPane.showMessageDialog(this, "Data saved Successfully!!");
        clear_fields2();
        populateBookCat();
    }//GEN-LAST:event_btnBookCategory3ActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        Bookcategory bc = new Bookcategory(txtCategoryId3.getText());
        BookDao bdao = new BookDao();
        bdao.deleteBookcategory(bc);
        JOptionPane.showMessageDialog(this, "Data deleted Successfully!!");
        clear_fields2();
        populateBookCat();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        Bookcategory bc = new Bookcategory();
        bc.setCategoryid(txtCategoryId3.getText());
        bc.setCategoryname(txtCategoryName3.getText());
        BookDao bdao = new BookDao();
        bdao.updateBookcategory(bc);
        JOptionPane.showMessageDialog(this, "Data updated Successfully!!");
        clear_fields2();
        populateBookCat();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        Book b = new Book();
        b.setBookId(txtbookid.getText());
        b.setTitle(txtTitle.getText());
        b.setPublishinghouse(txtpub.getText());
        b.setDateofpublication(new Date(dob.getDate().getTime()));
        b.setAuthor(txtAuthor.getText());
        b.setPages(Integer.parseInt(txtPages.getText()));
        b.setBookcategory(cbBookcategory.getSelectedItem().toString());
        BookDao bdao = new BookDao();
        bdao.saveBook(b);
        JOptionPane.showMessageDialog(this, "Data saved Successfully!!");  
        clear_fields();
        populateBook();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void bookTableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTableMouseMoved

    private void bookTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTableMouseEntered

    private void bookTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookTableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTableKeyPressed

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        // TODO add your handling code here:
        int i = bookTable.getSelectedRow();
        txtbookid.setText(bookTable.getValueAt(i, 0).toString());
        txtTitle.setText(bookTable.getValueAt(i, 1).toString());
        txtpub.setText(bookTable.getValueAt(i, 2).toString());
        txtAuthor.setText(bookTable.getValueAt(i, 3).toString());
        txtPages.setText(bookTable.getValueAt(i, 4).toString());
        cbBookcategory.setSelectedItem(bookTable.getValueAt(i, 5).toString());
    }//GEN-LAST:event_bookTableMouseClicked

    private void categoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTableMouseClicked
        // TODO add your handling code here:
        int cat = categoryTable.getSelectedRow();
        txtCategoryId3.setText(categoryTable.getValueAt(cat, 0).toString());
        txtCategoryName3.setText(categoryTable.getValueAt(cat, 1).toString());
    }//GEN-LAST:event_categoryTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookTable;
    private javax.swing.JButton btnBookCategory3;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btndeleterecord;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnupdatebook;
    private javax.swing.JTable categoryTable;
    private javax.swing.JComboBox<String> cbBookcategory;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtCategoryId3;
    private javax.swing.JTextField txtCategoryName3;
    private javax.swing.JTextField txtPages;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtbookid;
    private javax.swing.JTextField txtpub;
    // End of variables declaration//GEN-END:variables

    private void clear_fields() {
        txtbookid.setText("");
        txtTitle.setText("");
        txtpub.setText("");
        dob.setDate(null);
        txtAuthor.setText("");
        txtPages.setText("");
        cbBookcategory.setSelectedItem("");
    }
    private void clear_fields2() {
        txtCategoryId3.setText("");
        txtCategoryName3.setText("");
    }

    private void populateBookCat() {
         BookDao dao = new BookDao();
            List<Bookcategory> bc = dao.gettAll();
            DefaultTableModel tModel = (DefaultTableModel)categoryTable.getModel();
            tModel.setRowCount(0);
            //b.stream().map((b1) -> new Object[]{
            for (Bookcategory cat : bc){
                Object[] obj = new Object[] {
                cat.getCategoryid(),cat.getCategoryname()
                };
            //}).forEach((o) -> {
                tModel.addRow(obj);
            //});
            }
    }

    private void populateBook() {
       BookDao dao = new BookDao();
            List<Book> b = dao.listAll();
            DefaultTableModel tModel = (DefaultTableModel)bookTable.getModel();
            tModel.setRowCount(0);
            //b.stream().map((b1) -> new Object[]{
            for (Book bk : b){
                Object[] obj = new Object[] {
                bk.getBookId(), bk.getTitle(), bk.getPublishinghouse(), bk.getDateofpublication(), bk.getAuthor(),
                bk.getPages(), bk.getBookcategory()
                };
            //}).forEach((o) -> {
                tModel.addRow(obj);
            //});
            }
    }

}
