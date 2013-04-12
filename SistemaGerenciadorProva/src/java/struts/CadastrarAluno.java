/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import dao.AlunoDao;
import dominio.Aluno;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author jose
 */
public class CadastrarAluno extends org.apache.struts.action.Action {

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
        
        Session s = util.HibernateUtil.getSession();
        Transaction t = s.beginTransaction();
        
        AlunoDao alDao = new AlunoDao();
        Aluno al = new Aluno();
        
        al.setNome(request.getParameter("nome"));
        al.setEmail(request.getParameter("email"));
        al.setSenha(request.getParameter("senha"));
        
        alDao.addOrUpd(al);
                
        request.setAttribute("al", al);
        
        return mapping.findForward(SUCCESS);
    }
}
