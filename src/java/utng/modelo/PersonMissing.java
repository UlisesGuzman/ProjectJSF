/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author janto
 */
@Entity
@Table(name = "person_missing")
public class PersonMissing implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private Long idPerson;
    @Column(name = "last_seen", length = 30)
    private String lastSeen;
    @Column(length = 40)
    private String lastClothing;
    @Column(length = 40)
    private String comments;
    @ManyToOne
    @JoinColumn(name = "id_alt_logins")
    private AltLogins altLogins;

    
    public PersonMissing(Long idPerson, String lastSeen, String lastClothing, String comments, AltLogins altLogins) {
        this.idPerson = idPerson;
        this.lastSeen = lastSeen;
        this.lastClothing = lastClothing;
        this.comments = comments;
        this.altLogins = altLogins;
    }

    public PersonMissing() {
        idPerson = 0L;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getLastClothing() {
        return lastClothing;
    }

    public void setLastClothing(String lastClothing) {
        this.lastClothing = lastClothing;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public AltLogins getAltLogins() {
        return altLogins;
    }

    public void setAltLogins(AltLogins altLogins) {
        this.altLogins = altLogins;
    }

    
}
