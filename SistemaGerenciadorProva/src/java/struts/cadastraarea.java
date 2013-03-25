/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import dao.AreaDao;
import dao.InstituicaoDao;
import dominio.Area;
import dominio.Instituicao;
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
public class cadastraarea extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESSO = "sucesso_cadastrar";

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
        
        
        Area area = new Area();
        AreaDao areadao = new AreaDao();
        area.setNome(request.getParameter("textNomeArea"));
        
        Session s = util.HibernateUtil.getSession();
        Transaction t = s.beginTransaction();
        areadao.addOrUpd(area);
        request.setAttribute("nome", area.getNome());
        
        return mapping.findForward(SUCCESSO);
    }
}
