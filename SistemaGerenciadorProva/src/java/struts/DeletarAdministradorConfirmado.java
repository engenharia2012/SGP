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

/**
 *
 * @author Arnaldo Junior
 */
public class DeletarAdministradorConfirmado extends org.apache.struts.action.Action {

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
        
        AdministradorDao adminDao = new AdministradorDao(); 
        Administrador admin = new Administrador();
        
        admin.setId(Long.parseLong(request.getParameter("id")));
        admin.setNome(request.getParameter("nome"));
        admin.setEmail(request.getParameter("email"));
        admin.setSenha(request.getParameter("senha"));
        
        adminDao.del(admin);
        
        return mapping.findForward(SUCCESS);
    }
}