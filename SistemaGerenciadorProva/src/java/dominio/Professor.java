/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author jose
 */
@Entity
@Inheritance
public class Professor extends Usuario{
    @Column(length=11)
    private String cpf;
	
    @ManyToOne
    private Instituicao inst;
    
    @ManyToOne
    private Area area;
    
    @OneToMany
    private List<Questao> questoes;
    
    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the inst
     */
    public Instituicao getInst() {
        return inst;
    }

    /**
     * @param inst the inst to set
     */
    public void setInst(Instituicao inst) {
        this.inst = inst;
    }

    /**
     * @return the area
     */
    public Area getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(Area area) {
        this.area = area;
    }

    /**
     * @return the questoes
     */
    public List<Questao> getQuestoes() {
        return questoes;
    }
}