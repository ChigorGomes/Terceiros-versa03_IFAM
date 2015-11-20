package hibernate;

import hibernate.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Mara
 */
public class testeHibernate {
    public static void main(String[] args) {
        /* instancie um obejto do tipo session para receber a conexao aberta
         * chamamos o metodo getSessionFactory da classe hibernateUtil
         * e abrimos a sessão para manipular os dados
         */
        Session session = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Iniciado com Sucesso");
    }
}