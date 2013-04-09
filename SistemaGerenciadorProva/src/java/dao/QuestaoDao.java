/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Questao;
import org.hibernate.Criteria;
import org.hibernate.criterion.Expression;

/**
 *
 * @author jose
 */
public class QuestaoDao extends dao{

    public Questao findByName(String nome){
        Criteria c = getSession().createCriteria(Questao.class);
        c.add(Expression.eq("nome", nome));
        return (Questao) c.uniqueResult();
    }
    @Override
    public Questao findById(Long id){
        Criteria c = getSession().createCriteria(Questao.class);
        c.add(Expression.eq("id", id));
        return (Questao) c.uniqueResult();
    }
}
