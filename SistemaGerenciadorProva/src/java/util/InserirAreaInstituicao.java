/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dominio.Area;
import dominio.Instituicao;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author jose
 */
public class InserirAreaInstituicao {
    public static void main(String[] args) {
        
        Instituicao i1 = new Instituicao();
        Instituicao i2 = new Instituicao();
        Area a1 = new Area();
        Area a2 = new Area();
        
        i1.setNome_fantasia("IFTO");
        i2.setNome_fantasia("ULBRA");
                
        a1.setNome("Exatas");
        a2.setNome("Sociais");
        
        Session s = HibernateUtil.getSession();          
        Transaction t = s.beginTransaction();
        
        s.saveOrUpdate(i1);
        s.saveOrUpdate(i2);
        s.saveOrUpdate(a1);
        s.saveOrUpdate(a2);
        
        t.commit();
    }
    
}
