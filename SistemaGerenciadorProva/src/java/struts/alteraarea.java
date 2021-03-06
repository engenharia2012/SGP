/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import dao.AreaDao;
import dominio.Area;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Sacrario vivo
 */
public class alteraarea extends org.apache.struts.action.Action {

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
                Area area = new Area();
        AreaDao areadao = new AreaDao();
        area.setId(Integer.parseInt(request.getParameter("textId")));
        area.setNome(request.getParameter("textNomeArea"));
        String nome = area.getNome();
        areadao.addOrUpd(area);
        request.setAttribute("nome", nome);
        return mapping.findForward(SUCCESS);
    }
}
