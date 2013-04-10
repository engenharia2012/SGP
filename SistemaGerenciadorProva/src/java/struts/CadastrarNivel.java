/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import dao.NivelDao;
import dominio.Nivel;
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
 * @author debora
 */
public class CadastrarNivel extends org.apache.struts.action.Action {

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
        
        NivelDao nivDao = new NivelDao();
        Nivel niv;
        
        SQLQuery sqlQuery = s.createSQLQuery("SELECT * FROM nivel WHERE nome=?");
        sqlQuery.setString(0, request.getParameter("TipoNivel"));
        sqlQuery.addEntity(Nivel.class);
        niv = (Nivel) sqlQuery.uniqueResult();
        
        if(niv != null){
            request.setAttribute("niv", niv);
        } else{
            niv = new Nivel();
            niv.setTipoNivel(request.getParameter("TipoNivel"));
           
        
            nivDao.addOrUpd(niv);
            request.setAttribute("niv", niv);
        }
        
        return mapping.findForward(SUCCESS);
    }
}