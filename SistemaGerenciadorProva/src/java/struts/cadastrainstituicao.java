/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import dao.InstituicaoDao;
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
 * @author Fernando
 */
public class cadastrainstituicao extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private String SUCCESS = "sucesso_cadastrar";

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
        String caminhologo = request.getParameter("file");
        Instituicao inst = new Instituicao();
        InstituicaoDao instdao = new InstituicaoDao();
        InstituicaoDao instdao2 = new InstituicaoDao();
        inst.setCnpj(request.getParameter("textCNPJ"));
        inst.setNome_fantasia(request.getParameter("textNomeFantasia"));
        inst.setEndereco(request.getParameter("textEndereco"));
        inst.setRazao_social(request.getParameter("textRazaoSocial"));
        inst.setLogo(caminhologo);
        inst.setTelefone(request.getParameter("textTelefone"));
        Session s = util.HibernateUtil.getSession();
        Transaction t = s.beginTransaction();
        Instituicao inst2=instdao2.findByCnpj(inst.getCnpj());
        
        if(inst2!= null) {
            if(inst.getCnpj().equals(inst2.getCnpj())){
                String replace = "erro_jaexiste";
                SUCCESS = replace;
                request.setAttribute("nome", "Instituição com esse cnpj");
            }
        }
        else{
            t = s.beginTransaction();
            instdao.addOrUpd(inst);
            request.setAttribute("nome", inst.getNome_fantasia());
        }
        return mapping.findForward(SUCCESS);
    }
}
