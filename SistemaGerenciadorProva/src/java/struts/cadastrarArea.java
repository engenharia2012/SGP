package struts;

import dao.AreaDao;
import dominio.Area;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class cadastrarArea extends org.apache.struts.action.Action {

    
    private static final String SUCCESSO = "sucesso_cadastrar";

    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		Area area = new Area();
        AreaDao areadao = new AreaDao();
        area.setNome(request.getParameter("nome"));
        
        Session s = util.HibernateUtil.getSession();
        Transaction t = s.beginTransaction();
        areadao.addOrUpd(area);
		
        request.setAttribute("nome", area.getNome());
        
        return mapping.findForward(SUCCESSO);
    }
}