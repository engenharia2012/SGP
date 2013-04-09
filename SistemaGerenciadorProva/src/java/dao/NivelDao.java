
package dao;

import dominio.Nivel;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Expression;


public class NivelDao extends dao {
    Query query;
    
    public List<Nivel> getListaNivel(){
      query = getSession().createQuery("from Nivel");
        return query.list();
    }
    
    public Nivel findById(int id){
        Criteria c = getSession().createCriteria(Nivel.class);
        c.add(Expression.eq("id", id));
        return (Nivel) c.uniqueResult();
    }
}