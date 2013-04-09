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
public class BuscarProfessorDeletar extends org.apache.struts.action.Action {

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
        
        ProfessorDao profDao = new ProfessorDao();
        Professor prof;

        prof = profDao.findByName(request.getParameter("nome"));
       
        System.out.println("================cheguo aqui================");
        if(prof==null){
            prof = new Professor();
            request.setAttribute("profremove", prof);
        }else{
            request.setAttribute("profremove", prof);
        }
        
        return mapping.findForward(SUCCESS);
    }
}
