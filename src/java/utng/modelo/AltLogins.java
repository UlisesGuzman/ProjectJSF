/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author janto
 */
@Entity
@Table(name = "alt_logins")

public class AltLogins implements Serializable
 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alt_logins")
    private Long idAltLogins;
    @Column(name = "user_name", length = 100)
    private String userName;
    @Column(length = 50)
    private String type;

    public AltLogins(Long idAltLogins, String userName, String type) {
        this.idAltLogins = idAltLogins;
        this.userName = userName;
        this.type = type;
    }

    public AltLogins() {
        this(0L, "", "");
    }

    public Long getIdAltLogins() {
        return idAltLogins;
    }

    public void setIdAltLogins(Long idAltLogins) {
        this.idAltLogins = idAltLogins;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
}

