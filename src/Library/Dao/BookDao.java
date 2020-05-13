/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Dao;

import Library.Model.Book;
import Library.Model.Bookcategory;
import Library.Util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author jean claude
 */
public class BookDao {
    public void saveBook(Book book){
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        sess.save(book);
        trans.commit();
        sess.close();
    }
    public void updateBook(Book book){
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        sess.update(book);
        trans.commit();
        sess.close();
    }
    public void deleteBook(Book book){
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        sess.delete(book);
        trans.commit();
        sess.close();
    }
    
    public void saveBookcategory(Bookcategory bookc){
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        sess.save(bookc);
        trans.commit();
        sess.close();
    }
    public void updateBookcategory(Bookcategory bookc){
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        sess.update(bookc);
        trans.commit();
        sess.close();
    }
    public void deleteBookcategory(Bookcategory bookc){
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        sess.delete(bookc);
        trans.commit();
        sess.close();
    }
    public  List<Book>listAll(){
        List<Book>bk = null;
        Configuration conf = new Configuration().configure();
        SessionFactory sf = conf.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tx = ss.beginTransaction();
        Query q = ss.createQuery("from Book");
        return q.list();
    } 
    public  List<Bookcategory>gettAll(){
        List<Bookcategory>bc = null;
        Configuration conf = new Configuration().configure();
        SessionFactory sf = conf.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tx = ss.beginTransaction();
        Query q = ss.createQuery("from Bookcategory");
        return q.list();
    } 
}
