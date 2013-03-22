/* Arquivo Area */
package dao;

import dominio.Area;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Expression;


public class AreaDao extends dao {
    Query query;
    
    public List<Area> getListaInstituicoes(){
      query = getSession().createQuery("from Area");
        return query.list();
    }
    
    public Area findById(int id){
        Criteria c = getSession().createCriteria(Area.class);
        c.add(Expression.eq("id", id));
        return (Area) c.uniqueResult();
    }
}