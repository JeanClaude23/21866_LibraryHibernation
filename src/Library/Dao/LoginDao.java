/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Dao;

import Library.Model.Login;
import Library.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author jean claude
 */
public class LoginDao {
    public void SaveLogin(Login log){
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        sess.save(log);
        trans.commit();
        sess.close();
    }
}
