/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Administrador;
import dominio.Aluno;
import dominio.Area;
import dominio.Instituicao;
import dominio.Notificacao;
import dominio.Professor;
import dominio.Questao;
import dominio.Usuario;
import util.HibernateUtil;

/**
 *
 * @author Giovane
 */
public class ClasseDeBuscaGenerica {

    private static ClasseDeBuscaGenerica instance;
    private ClasseGenerica<Administrador> administradorDao;
    private ClasseGenerica<Aluno> alunoDao;
    private ClasseGenerica<Area> areaDao;
    private ClasseGenerica<Instituicao> instituicaoDao;
    private ClasseGenerica<Notificacao> notificacaoDao;
    private ClasseGenerica<Professor> professorDao;
    private ClasseGenerica<Questao> questaoDao;
    private ClasseGenerica<Usuario> usuarioDao;

    public void beginTransaction() {
        HibernateUtil.getSession().beginTransaction();
    }

    public void commit() {
        HibernateUtil.getSession().getTransaction().commit();
    }

    public void rollBack() {
        HibernateUtil.getSession().getTransaction().rollback();

    }

    public boolean hasTransaction() {
        return HibernateUtil.getSession().getTransaction().isActive();
    }

    public static ClasseDeBuscaGenerica getInstance() {
        if (instance == null) {
            instance = new ClasseDeBuscaGenerica();
        }
        return instance;
    }

    public ClasseGenerica<Administrador> getAdministradorDao() {
        if (administradorDao == null) {
            administradorDao = new ClasseGenerica<Administrador>(Administrador.class);
        }
        return administradorDao;
    }

    public ClasseGenerica<Aluno> getAlunoDao() {
        if (alunoDao == null) {
            alunoDao = new ClasseGenerica<Aluno>(Aluno.class);
        }
        return alunoDao;
    }

    public ClasseGenerica<Area> getAreaDao() {
        if (areaDao == null) {
            areaDao = new ClasseGenerica<Area>(Area.class);
        }
        return areaDao;
    }

    public ClasseGenerica<Instituicao> getInstituicaoDao() {
        if (instituicaoDao == null) {
            instituicaoDao = new ClasseGenerica<Instituicao>(Instituicao.class);
        }
        return instituicaoDao;
    }

    public ClasseGenerica<Notificacao> getNotificacaoDao() {
        if (notificacaoDao == null) {
            notificacaoDao = new ClasseGenerica<Notificacao>(Notificacao.class);
        }
        return notificacaoDao;
    }

    public ClasseGenerica<Professor> getProfessorDao() {
        if (professorDao == null) {
            professorDao = new ClasseGenerica<Professor>(Professor.class);
        }
        return professorDao;
    }

    public ClasseGenerica<Questao> getQuestaoDao() {
        if (questaoDao == null) {
            questaoDao = new ClasseGenerica<Questao>(Questao.class);
        }
        return questaoDao;
    }

    public ClasseGenerica<Usuario> getUsuarioDao() {
        if (usuarioDao == null) {
            usuarioDao = new ClasseGenerica<Usuario>(Usuario.class);
        }
        return usuarioDao;
    }
}
