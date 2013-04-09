/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import dao.ProfessorDao;
import dominio.Professor;
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
public class AtualizarProfessor extends org.apache.struts.action.Action {

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
        
        ProfessorDao pDao = new ProfessorDao();
        
        
        Professor pro = (Professor) pDao.findByName(request.getParameter("nome"));
        
        if(pro!=null){
            if(pro.getNome().equals(request.getParameter("nome"))){
                pro.setNome(request.getParameter("nome")); 
            } if(pro.getEmail().equals(request.getParameter("email"))){
                pro.setEmail(request.getParameter("email")); 
            } if(pro.getSenha().equals(request.getParameter("senha"))){
                pro.setSenha(request.getParameter("senha")); 
            } if(pro.getCpf().equals(request.getParameter("cpf"))){
                pro.setCpf(request.getParameter("cpf")); 
            }
        }
        pDao.addOrUpd(pro);
        request.setAttribute("pro", pro);
        return mapping.findForward(SUCCESS);
    }
}
