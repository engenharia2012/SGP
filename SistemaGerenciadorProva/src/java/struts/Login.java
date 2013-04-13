/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import dominio.Administrador;
import dominio.Aluno;
import dominio.Professor;
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
 * @author Arnaldo Junior
 */
public class Login extends org.apache.struts.action.Action {

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
        
        Session s = util.HibernateUtil.getSession();
        Transaction t = s.beginTransaction();
        Administrador admin = new Administrador();
        
        SQLQuery sqlQuery = s.createSQLQuery("SELECT * FROM administrador WHERE email=?");
        sqlQuery.setString(0, request.getParameter("email"));
        sqlQuery.addEntity(Administrador.class);
        admin = (Administrador) sqlQuery.uniqueResult();
        
        //Se a conta de administrador estiver desabilitada
        if ((admin != null) && (admin.getAdmin_atual() == false)) {
            request.setAttribute("usuario", "desabilitado");
            return mapping.findForward("success");
        }
        
        if(admin != null){
            if ((admin.getEmail().equals(request.getParameter("email"))) && (admin.getSenha().equals(request.getParameter("senha")))) {
                request.setAttribute("usuario", admin);
                return mapping.findForward("administrador");
            }  else {
                request.setAttribute("usuario", "incorreto"); //Senha incorreta;
            }
        } else { //Não é administrador
            
            SQLQuery sqlQuery2 = s.createSQLQuery("SELECT * FROM aluno WHERE email=?");
            sqlQuery2.setString(0, request.getParameter("email"));
            sqlQuery2.addEntity(Aluno.class);
            Aluno aluno = (Aluno) sqlQuery2.uniqueResult();
            
            if (aluno != null) {
                if ((aluno.getEmail().equals(request.getParameter("email"))) && (aluno.getSenha().equals(request.getParameter("senha")))) {
                    request.setAttribute("usuario", aluno);
                    return mapping.findForward("aluno");
                } else {
                    request.setAttribute("usuario", "incorreto"); //Senha incorreta;
                }
            } else { //Não é aluno nem administrador
                
                SQLQuery sqlQuery3 = s.createSQLQuery("SELECT * FROM professor WHERE email=?");
                sqlQuery3.setString(0, request.getParameter("email"));
                sqlQuery3.addEntity(Professor.class);
                Professor prof = (Professor) sqlQuery3.uniqueResult();
                
                if (prof != null) {
                    if ((prof.getEmail().equals(request.getParameter("email"))) && (prof.getSenha().equals(request.getParameter("senha")))) {
                        request.setAttribute("usuario", prof);
                        return mapping.findForward("professor");
                    } else {
                        request.setAttribute("usuario", "incorreto"); //Senha incorreta;
                    }
                } else { //Não foi encontrado o usuário especificado.
                    request.setAttribute("usuario", "nao_encontrado");
                }
            }
        }
        
        return mapping.findForward(SUCCESS);
    }
}