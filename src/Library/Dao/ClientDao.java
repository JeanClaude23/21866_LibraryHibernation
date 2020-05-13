/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Dao;

import Library.Model.Client;
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
public class ClientDao {
    public void saveClient(Client c){
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        sess.save(c);
        trans.commit();
        sess.close();
    }
    public void updateClient(Client c){
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        sess.update(c);
        trans.commit();
        sess.close();
    }
    public void deleteClient(Client c){
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        sess.delete(c);
        trans.commit();
        sess.close();
    }
    public  List<Client>listAll(){
        List<Client>cl = null;
        Configuration conf = new Configuration().configure();
        SessionFactory sf = conf.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tx = ss.beginTransaction();
        Query q = ss.createQuery("from Client");
        return q.list();
    } 
}
