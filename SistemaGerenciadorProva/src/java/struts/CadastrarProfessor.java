/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import dao.AreaDao;
import dao.InstituicaoDao;
import dao.ProfessorDao;
import dominio.Area;
import dominio.Instituicao;
import dominio.Professor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author jose
 */
public class CadastrarProfessor extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
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
        
        Session s = HibernateUtil.getSession();
        Transaction t = s.beginTransaction();
        
        ProfessorDao profDao = new ProfessorDao();
        Professor prof;

        prof = profDao.findByName(request.getParameter("nome"));
        if(prof != null){
            System.out.println("=================PROFESSOR JÁ EXISTE==================");
        } else{
            System.out.println("=================CADASTRAR PROFESSOR ==================");
            Professor p = new Professor();
            InstituicaoDao instDao = new InstituicaoDao();
            AreaDao areaDao = new AreaDao();
            Instituicao inst;
            Area a;
            
            p.setNome(request.getParameter("nome"));
            p.setEmail(request.getParameter("email"));
            p.setSenha(request.getParameter("senha"));
            p.setCpf(request.getParameter("cpf"));
            
            //BUSCAR OS OBJETOS AREA E INSTITUICAO
            inst = (Instituicao) instDao.findById(Integer.parseInt(request.getParameter("inst")));
            a = (Area) areaDao.findById(Integer.parseInt(request.getParameter("area")));
           
            //settar area e instituicao para professor
            p.setArea(a);
            p.setInst(inst);
            
            //settar professor para instituicao e area
            a.getProfessores().add(p);
            inst.getProfessores().add(p);
            
            s.saveOrUpdate(a);
            s.saveOrUpdate(inst);
            s.saveOrUpdate(p);
            t.commit();
            request.setAttribute("p_cad", p);
        }
        
        return mapping.findForward(SUCCESS);
    }
}
