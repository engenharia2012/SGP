/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import dao.AdministradorDao;
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
public class CadastrarAdministrador extends org.apache.struts.action.Action {

    /*
     * forward name="success" path=""
     */
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
        
        AdministradorDao adminDao = new AdministradorDao();
        Administrador admin;
        
        SQLQuery sqlQuery = s.createSQLQuery("SELECT * FROM administrador WHERE nome=?");
        sqlQuery.setString(0, request.getParameter("nome"));
        sqlQuery.addEntity(Administrador.class);
        admin = (Administrador) sqlQuery.uniqueResult();
        
        if(admin != null){
            request.setAttribute("admin", admin);
        } else{
            admin = new Administrador();
            admin.setNome(request.getParameter("nome"));
            admin.setEmail(request.getParameter("email"));
            admin.setSenha(request.getParameter("senha"));
        
            adminDao.addOrUpd(admin);
            request.setAttribute("admin", admin);
        }
        
        return mapping.findForward(SUCCESS);
    }
}