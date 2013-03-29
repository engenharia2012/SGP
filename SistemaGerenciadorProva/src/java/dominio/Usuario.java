/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

/**
 *
 * @author jose
 */
//@Entity
@MappedSuperclass 
//@Table(name="usuario")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario implements Serializable {
    @Id
    @SequenceGenerator(name = "SEQ_USUARIO",
        sequenceName = "usuario_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
        generator = "SEQ_USUARIO")

    private Long id;
    @Column(length=100) 
    private String nome;
    @Column(length=100)
    private String email;
    @Column(length=40)
    private String senha;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ultimoLogin;

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the ultimoLogin
     */
    public Date getUltimoLogin() {
        return ultimoLogin;
    }

    /**
     * @param ultimoLogin the ultimoLogin to set
     */
    public void setUltimoLogin(Date ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }
    
}
