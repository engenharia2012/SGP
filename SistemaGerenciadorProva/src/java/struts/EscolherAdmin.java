/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import dominio.AdminAux;
import dominio.Administrador;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Arnaldo Junior
 */
public class EscolherAdmin extends org.apache.struts.action.Action {

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
        AdminAux adminAux = new AdminAux();
  
        SQLQuery sqlQuery = s.createSQLQuery("SELECT * FROM administrador WHERE email=?");
        sqlQuery.setString(0, request.getParameter("email"));
        sqlQuery.addEntity(Administrador.class);
        Administrador admin = (Administrador) sqlQuery.uniqueResult();
        
        if (admin != null){   
            adminAux.setAdmin(admin);
            adminAux.setEmail(request.getParameter("email_admin"));

        } else{
            admin = new Administrador();
            admin.setNome(null);
            adminAux.setAdmin(admin);
            
        }
        request.setAttribute("adminAux", adminAux);
        
        return mapping.findForward(SUCCESS);
    }
}
