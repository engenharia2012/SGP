/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Instituicao;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Expression;

/**
 *
 * @author Fernando
 */
public class InstituicaoDao extends dao {
    Query query;
    
    public List<Instituicao> getListaInstituicoes(){
      query = getSession().createQuery("from Instituicao");
        return query.list();
    }
    
    public Instituicao findById(int id){
        Criteria c = getSession().createCriteria(Instituicao.class);
        c.add(Expression.eq("id", id));
        return (Instituicao) c.uniqueResult();
    }
    public Instituicao findByCnpj (String cnpj){
        Criteria c = getSession().createCriteria(Instituicao.class);
        c.add(Expression.eq("cnpj", cnpj));
        return (Instituicao) c.uniqueResult();
    }
}
