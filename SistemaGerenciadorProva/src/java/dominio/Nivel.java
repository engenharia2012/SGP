/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author debora
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="nivel",schema="public")
public class Nivel implements Serializable {
   
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id_nivel") 
  private String TipoNivel;

    /**
     * @return the TipoNivel
     */
    public String getTipoNivel() {
        return TipoNivel;
    }

    /**
     * @param TipoNivel the TipoNivel to set
     */
    public void setTipoNivel(String TipoNivel) {
        this.TipoNivel = TipoNivel;
    }

    public void setId(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}