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

/**
 *
 * @author debora
 */
public class AlterarNivel extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "sucesso_alterar";

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
                Nivel nivel = new Nivel();
        NivelDao niveldao = new NivelDao();
        nivel.setId(Integer.parseInt(request.getParameter("textId")));
        nivel.setFacil(request.getParameter("textTipoNivel"));
        String Facil = nivel.getFacil();
        niveldao.addOrUpd(nivel);
        request.setAttribute("facil", Facil);
        return mapping.findForward(SUCCESS);
    }
}
