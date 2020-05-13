/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Dao;

import Library.Model.Checkout;
import Library.Util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author jean claude
 */
public class CheckOutDao {
    public void SaveCheckOut(Checkout chout){
    Session sess = HibernateUtil.getSessionFactory().openSession();
    Transaction trans = sess.beginTransaction();
    sess.save(chout);
    trans.commit();
   }
     public List<Checkout> getCheckOut(){
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        Criteria cr =session.createCriteria(Checkout.class);
        List<Checkout> cl = cr.list();
        tr.commit();
        session.close();
        return  cl;
        }
}
