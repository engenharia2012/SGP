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
        
        System.out.println("-------" + request.getParameter("nome"));
        System.out.println("-------" + request.getParameter("email"));
        System.out.println("-------" + request.getParameter("senha"));
        System.out.println("-------" + request.getParameter("email_admin"));
        
        AdministradorDao adminDao = new AdministradorDao();
        Administrador admin;
        Administrador admin_novo;
        
        SQLQuery sqlQuery = s.createSQLQuery("SELECT * FROM administrador WHERE nome=?");
        sqlQuery.setString(0, request.getParameter("nome"));
        sqlQuery.addEntity(Administrador.class);
        admin_novo = (Administrador) sqlQuery.uniqueResult();
        
        if(admin_novo != null){
            request.setAttribute("admin", admin_novo);
        } else{
            admin_novo = new Administrador();
            admin_novo.setNome(request.getParameter("nome"));
            admin_novo.setEmail(request.getParameter("email"));
            admin_novo.setSenha(request.getParameter("senha"));
            admin_novo.setAdmin_atual(true);
        
            adminDao.addOrUpd(admin_novo); //Cadastra o novo administrador;
            
            //DESMARCAR ADMINISTRADOR ATUAL
            
            Session s2 = util.HibernateUtil.getSession();
            Transaction t2 = s2.beginTransaction();
            
            SQLQuery sqlQuery2 = s2.createSQLQuery("SELECT * FROM administrador WHERE email=?");
            sqlQuery2.setString(0, request.getParameter("email_admin"));
            sqlQuery2.addEntity(Administrador.class);
            admin = (Administrador) sqlQuery2.uniqueResult();
            
            System.out.println("--------" + admin.getEmail());
            
            admin.setAdmin_atual(false); //Retira a função de administrador;
            
            AdministradorDao adminDao2 = new AdministradorDao();
            adminDao2.addOrUpd(admin);
            
            request.setAttribute("admin", admin_novo); //Envia o novo administrador cadastrado;
        }
        
        return mapping.findForward(SUCCESS);
    }
}