/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dao.ProfessorDao;
import dominio.Professor;
import dominio.Questao;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author jose
 */
public class CadastrarQuestoes {
    public static void main(String[] args) {
        
        Session s = HibernateUtil.getSession();          
        Transaction t = s.beginTransaction();
        
        Questao q1 = new Questao();
        Questao q2 = new Questao();
        Questao q3 = new Questao();
        
        ProfessorDao profDao = new ProfessorDao();
        Professor professor = profDao.findByName("jose");
        
        System.out.println("= = = = = CHEGOU AQUI");
        if(professor!=null){
            
            q1.setTexto("Questão 01");
            q1.setNotificada(false);
            q2.setTexto("Questão 02");
            q2.setNotificada(false);
            q3.setTexto("Questão 03");
            q3.setNotificada(false);
            
            q1.setProfessor(professor);
            q2.setProfessor(professor);
            q3.setProfessor(professor);
            
            professor.getQuestoes().add(q1);
            professor.getQuestoes().add(q2);
            professor.getQuestoes().add(q3);
            
            s.save(q1);
            s.save(q2);
            s.save(q3);
            s.saveOrUpdate(professor);
        }
        else{
            System.out.println("O professor não está cadastrado!!!");
        }
        t.commit();
    }
}
