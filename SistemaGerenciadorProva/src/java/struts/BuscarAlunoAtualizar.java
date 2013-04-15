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
public class BuscarAlunoAtualizar extends org.apache.struts.action.Action {

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
        
        AlunoDao ad = new AlunoDao();
        
        Aluno a = (Aluno) ad.findByName(request.getParameter("nomea"));
        if(a!=null){
            request.setAttribute("ala", a);
        }
        else{
            a = new Aluno();
            a.setNome("Aluno não existe");
            request.setAttribute("ala", a);
        }
        
        return mapping.findForward(SUCCESS);
        
    }
}
