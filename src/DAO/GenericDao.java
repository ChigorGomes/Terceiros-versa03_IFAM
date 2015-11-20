/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes_Terceiros.ClientePrestador;
import hibernate.HibernateUtil;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author Dmitry
 */
public class GenericDao {

    Session sessao;
    private Statement stmt= null;
    private ResultSet rs= null;
    public GenericDao() {
        this.sessao = HibernateUtil.getSessionFactory().openSession();
    }

   

    public boolean salvar(Object obj) {
        try {
            sessao.beginTransaction();
            sessao.save(obj);
            sessao.getTransaction().commit();

            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            sessao.getTransaction().rollback();
            sessao.close();
            return false;
        }
    }

    public boolean alterar(Object obj) {
        try {
            sessao.beginTransaction();
            sessao.update(obj);
            sessao.getTransaction().commit();

            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            sessao.getTransaction().rollback();
            sessao.close();
            return false;
        }
    }

    public boolean excluir(Object obj) {
        try {
            sessao.beginTransaction();
            sessao.delete(obj);
            sessao.getTransaction().commit();

            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            sessao.getTransaction().rollback();
            sessao.close();
            return false;
        }
    }

    public List<Object> pesquisa(String sql) {
       List<Object> list = null;
        list = sessao.createQuery(sql).list();
        sessao.close();
        return list;
    }
    
    
    
    
   
    
     public List<Object> busca(List<KeyStroker> ks, Class type) {
     List<Object> list = null;
     Criteria criteria = sessao.createCriteria(type);
     if (ks.size() > 0){
     for (KeyStroker k : ks) {
     switch (k.getTypo()) {
     case EQUALS:
     criteria.add(Restrictions.eq(k.getKey(), k.getValue()));
     break;
     case R_LIKE:
     criteria.add(Restrictions.like(k.getKey(), k.getValue() + "%"));
     break;
     case LIKE:
     criteria.add(Restrictions.like(k.getKey(), "%" + k.getValue() + "%"));
     break;
     case L_LIKE:
     criteria.add(Restrictions.like(k.getKey(), "%" + k.getValue()));
     break;
     case ORDER_ASC:
     criteria.addOrder(Order.asc(k.getKey()));
     break;
     case ORDER_DESC:
     criteria.addOrder(Order.desc(k.getKey()));
     break;
     case LESS:
     criteria.add(Restrictions.lt(k.getKey(), k.getValue()));
     break;
     case GREATER:
     criteria.add(Restrictions.gt(k.getKey(), k.getValue()));
     break;
     case NULL:
     criteria.add(Restrictions.isNull(k.getKey()));
     break;
     case N_NULL:
     criteria.add(Restrictions.isNotNull(k.getKey()));
     break;
     case EMPTY:
     criteria.add(Restrictions.isEmpty(k.getKey()));
     break;
     case N_EMPTY:
     criteria.add(Restrictions.isNotEmpty(k.getKey()));
     break;
     }
     }
     }
     list = criteria.list();
     sessao.close();
     return list;

     }
     
      public List<Object> listarTodos(Class type) {
     List<Object> list = null;
     Criteria criteria = sessao.createCriteria(type);
     list = criteria.list();
     sessao.close();
     return list;
     }

     public List<Object> busca(KeyStroker[] ks, Class type) {
     List<Object> list = null;
     Criteria criteria = sessao.createCriteria(type);
     if(ks.length>0){
     for (KeyStroker k : ks) {
     switch (k.getTypo()) {
     case EQUALS:
     criteria.add(Restrictions.eq(k.getKey(), k.getValue()));
     break;
     case R_LIKE:
     criteria.add(Restrictions.like(k.getKey(), k.getValue() + "%"));
     break;
     case LIKE:
     criteria.add(Restrictions.like(k.getKey(), "%" + k.getValue() + "%"));
     break;
     case L_LIKE:
     criteria.add(Restrictions.like(k.getKey(), "%" + k.getValue()));
     break;
     case ORDER_ASC:
     criteria.addOrder(Order.asc(k.getKey()));
     break;
     case ORDER_DESC:
     criteria.addOrder(Order.desc(k.getKey()));
     break;
     case LESS:
     criteria.add(Restrictions.lt(k.getKey(), k.getValue()));
     break;
     case GREATER:
     criteria.add(Restrictions.gt(k.getKey(), k.getValue()));
     break;
     case NULL:
     criteria.add(Restrictions.isNull(k.getKey()));
     break;
     case N_NULL:
     criteria.add(Restrictions.isNotNull(k.getKey()));
     break;
     case EMPTY:
     criteria.add(Restrictions.isEmpty(k.getKey()));
     break;
     case N_EMPTY:
     criteria.add(Restrictions.isNotEmpty(k.getKey()));
     break;
     }
     }
     }
     list = criteria.list();
     sessao.close();
     return list;
     }
     
}
