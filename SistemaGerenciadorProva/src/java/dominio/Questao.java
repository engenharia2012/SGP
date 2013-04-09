/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author jose
 */
@Entity
public class Questao implements Serializable{
    @Id
    @SequenceGenerator(name = "SEQ_QUESTAO",
        sequenceName = "questao_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
        generator = "SEQ_QUESTAO")
    private Long id;
    private String texto;
    private boolean notificada;
    
    @ManyToOne
    private Professor Professor;
    
    @OneToOne
    private Notificacao not;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * @return the Professor
     */
    public Professor getProfessor() {
        return Professor;
    }

    /**
     * @param Professor the Professor to set
     */
    public void setProfessor(Professor Professor) {
        this.Professor = Professor;
    }

    /**
     * @return the not
     */
    public Notificacao getNot() {
        return not;
    }

    /**
     * @param not the not to set
     */
    public void setNot(Notificacao not) {
        this.not = not;
    }

    /**
     * @return the notificada
     */
    public boolean isNotificada() {
        return notificada;
    }

    /**
     * @param notificada the notificada to set
     */
    public void setNotificada(boolean notificada) {
        this.notificada = notificada;
    }
}
