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


public class Nivel implements Serializable {
    
  private String Facil;
  private String Média;
  private String Dificil;

    /**
     * @return the Facil
     */
    public String getFacil() {
        return Facil;
    }

    /**
     * @param Facil the Facil to set
     */
    public void setFacil(String Facil) {
        this.Facil = Facil;
    }

    /**
     * @return the Média
     */
    public String getMédia() {
        return Média;
    }

    /**
     * @param Média the Média to set
     */
    public void setMédia(String Média) {
        this.Média = Média;
    }

    /**
     * @return the Dificil
     */
    public String getDificil() {
        return Dificil;
    }

    /**
     * @param Dificil the Dificil to set
     */
    public void setDificil(String Dificil) {
        this.Dificil = Dificil;
    }

    public void setMédio(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDificl(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setId(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
      }
  




