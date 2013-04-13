/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import dao.AdministradorDao;
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
public class NovoAdministrador extends org.apache.struts.action.Action {

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
        
        AdministradorDao adminDao = new AdministradorDao();
        AdminAux adminAux = new AdminAux();
        
        Administrador novo = new Administrador();
        
        novo.setId(Long.parseLong(request.getParameter("id")));
        novo.setNome(request.getParameter("nome"));
        novo.setEmail(request.getParameter("email"));
        novo.setSenha(request.getParameter("senha"));
        novo.setAdmin_atual(true);
        
        adminDao.addOrUpd(novo);
            
        
        //DESMARCAR ADMINISTRADOR ATUAL
        Session s2 = util.HibernateUtil.getSession();
        Transaction t2 = s2.beginTransaction();
         
        SQLQuery sqlQuery = s2.createSQLQuery("SELECT * FROM administrador WHERE email=?");
        sqlQuery.setString(0, request.getParameter("email_admin"));
        sqlQuery.addEntity(Administrador.class);
        Administrador velho = (Administrador) sqlQuery.uniqueResult();
            
        velho.setAdmin_atual(false); //Retira a função de administrador antigo;
            
        AdministradorDao adminDao2 = new AdministradorDao();
        adminDao2.addOrUpd(velho);
            
        request.setAttribute("admin", novo); //Envia o novo administrador cadastrado;
        
        return mapping.findForward(SUCCESS);
    }
}
