/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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

    
    private static final String SUCCESSO = "sucesso_cadastrar";
    private Object niveldao;

    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		Nivel nivel = new Nivel();
        NivelDao niveldao = new NivelDao();
        nivel.setTipoNivel(request.getParameter("id_nivel"));
       
        Session s = util.HibernateUtil.getSession();
        Transaction t = s.beginTransaction();
        niveldao.addOrUpd(nivel);
		
        request.setAttribute("TipoNivel", nivel.getTipoNivel());
        
        return mapping.findForward(SUCCESSO);
    }
}

