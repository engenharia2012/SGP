/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import dao.QuestaoDao;
import dominio.Notificacao;
import dominio.Questao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author jose
 */
public class NotificarQuestao extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        Session s = HibernateUtil.getSession();
        Transaction t = s.beginTransaction();
        
        QuestaoDao qd = new QuestaoDao();
        Questao q;
        Notificacao not = new Notificacao();
        
        q = (Questao) qd.findById(Long.parseLong(request.getParameter("questao")));
        if(q == null){
            System.out.println("================= QUESTÃO NÃO EXISTE ==================");
        } else{
            System.out.println("================= QUESTÃO SERÁ NOTIFICADA ==================");
            
            not.setNotificacao(request.getParameter("notificacao"));
            not.setQuestao(q);
            q.setNotificada(true);
            q.setNot(not);
            
            s.saveOrUpdate(not);
            s.saveOrUpdate(q);
            
            request.setAttribute("q_not", q);
        }
        t.commit();
        
        return mapping.findForward(SUCCESS);
    }
}
