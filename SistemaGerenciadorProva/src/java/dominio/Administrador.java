/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import javax.persistence.Entity;

/**
 *
 * @author Arnaldo Junior
 */
@Entity
public class Administrador extends Usuario{
    
    private boolean admin_atual;

    public boolean getAdmin_atual() {
        return admin_atual;
    }

    public void setAdmin_atual(boolean admin_atual) {
        this.admin_atual = admin_atual;
    }
}