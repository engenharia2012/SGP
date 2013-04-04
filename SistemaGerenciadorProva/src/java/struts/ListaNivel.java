/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



package struts;

import dao.NivelDao;
import dominio.Nivel;
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
 * @author debora
 */

public class ListaNivel extends org.apache.struts.action.Action {

  
    private static final String SUCCESS = "ListaNivel";

   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
          Session s = util.HibernateUtil.getSession();
          Transaction t = s.beginTransaction();
          NivelDao nivdao = new NivelDao();
          List <Nivel> todasnivel = nivdao.getListaNivel();
          request.setAttribute("todasnivel", todasnivel);
          t.commit();
        
        return mapping.findForward(SUCCESS);
    }
}
