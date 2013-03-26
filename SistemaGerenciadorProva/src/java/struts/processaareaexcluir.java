/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import dao.AreaDao;
import dao.InstituicaoDao;
import dominio.Area;
import dominio.Instituicao;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Sacrario vivo
 */
public class processaareaexcluir extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "listaareaexcluir";

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
        AreaDao areadao = new AreaDao();
        List <Area> todasarea = areadao.getListaArea();
        request.setAttribute("listaareaexcluir", todasarea);
        t.commit();
        
        return mapping.findForward(SUCCESS);
    }
}