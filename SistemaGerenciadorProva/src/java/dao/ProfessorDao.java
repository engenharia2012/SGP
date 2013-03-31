/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Professor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Expression;

/**
 *
 * @author jose
 */
public class ProfessorDao extends dao{
    Query query;
    
    public List<Professor> getListaProfessor(){
      query = getSession().createQuery("from professor");
        return query.list();
    }
    public Professor findByName(String nome){
        Criteria c = getSession().createCriteria(Professor.class);
        c.add(Expression.eq("nome", nome));
        return (Professor) c.uniqueResult();
    }
}
