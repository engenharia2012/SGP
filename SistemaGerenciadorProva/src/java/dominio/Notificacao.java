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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author jose
 */
@Entity
public class Notificacao implements Serializable{
    @Id
    @SequenceGenerator(name = "SEQ_NOTIF",
        sequenceName = "notif_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
        generator = "SEQ_NOTIF")
    private Long id;
    private String notificacao;
    
    @OneToOne
    private Questao questao;

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
     * @return the notificacao
     */
    public String getNotificacao() {
        return notificacao;
    }

    /**
     * @param notificacao the notificacao to set
     */
    public void setNotificacao(String notificacao) {
        this.notificacao = notificacao;
    }

    /**
     * @return the questao
     */
    public Questao getQuestao() {
        return questao;
    }

    /**
     * @param questao the questao to set
     */
    public void setQuestao(Questao questao) {
        this.questao = questao;
    }
    
}
