/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Avell
 */
public class ClasseGenerica <T> {
    private Class classe;
    private Query query;
    private Transaction transaction;
    private Session session;

    public ClasseGenerica(){
                this.session = getSession();
        }

    ClasseGenerica(Class classe){
        this.classe= classe;
        this.session = getSession();
    }
    
    public Session getSession(){
           return HibernateUtil.getSession();
    }


     public void addOrUpd(T u) {
         try {
             transaction = session.beginTransaction();
             session.saveOrUpdate(u);
             transaction.commit();
         }
         catch (Exception e ){
             transaction.rollback();
             throw new ExceptionInInitializerError(e);
         }

    }
    public void del(T u) {
         try {
             transaction = session.beginTransaction();
             session.delete(u);
             transaction.commit();
         }
         catch (Exception e ){
             transaction.rollback();
             throw new ExceptionInInitializerError(e);
         }

    }
    public T findById(Long id) {
        return (T) this.session.load(classe, id);
    }
    public List<T> listaAll() {
        return this.session.createCriteria(this.classe).list();
    }
/**
 Digite o termo para pesquiza e o nome do campo da tabela que vai ser pesquizado
 */
    public List<T> BuscaEspecifica(String busca, String campo) {
        String hql = "from " + classe.getName() + " t  where  t." + campo + " like :pbusca";
        query = this.session.createQuery(hql);
        query.setParameter("pbusca", "%" + busca + "%");
        return query.list();
    } 
}
