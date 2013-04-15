/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Aluno;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Expression;

/**
 *
 * @author jose
 */
public class AlunoDao extends dao{
    Query query;
    
    public Aluno findByName(String nome){
        Criteria c = getSession().createCriteria(Aluno.class);
        c.add(Expression.eq("nome", nome));
        return (Aluno) c.uniqueResult();
    }
    @Override
    public Aluno findById(Long id){
        Criteria c = getSession().createCriteria(Aluno.class);
        c.add(Expression.eq("id", id));
        return (Aluno) c.uniqueResult();
    }
    
}
