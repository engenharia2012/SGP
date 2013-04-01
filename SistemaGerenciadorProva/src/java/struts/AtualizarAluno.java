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
import util.HibernateUtil;

/**
 *
 * @author jose
 */
public class AtualizarAluno extends org.apache.struts.action.Action {

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
        
        AlunoDao aDao = new AlunoDao();
        
        
        Aluno al = (Aluno) aDao.findByName(request.getParameter("nome"));
        
        if(al!=null){
            if(al.getNome().equals(request.getParameter("nome_a"))){
                al.setNome(request.getParameter("nome_a")); 
            } if(al.getEmail().equals(request.getParameter("email_a"))){
                al.setEmail(request.getParameter("email_a")); 
            } if(al.getSenha().equals(request.getParameter("senha_a"))){
                al.setSenha(request.getParameter("senha_a")); 
            }
        }
        aDao.addOrUpd(al);
        request.setAttribute("allu", al);
        
        return mapping.findForward(SUCCESS);
    }
}
