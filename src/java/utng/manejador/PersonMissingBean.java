/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

/**
 *
 * @author Ulises
 */
import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import utng.datos.PersonMissingDAO;
import utng.datos.AltLoginsDAO;
import utng.modelo.PersonMissing;
import utng.modelo.AltLogins;

@ManagedBean
@SessionScoped
public class PersonMissingBean implements Serializable {

    private List<PersonMissing> persons;
    private PersonMissing person;
    private List<AltLogins> logins;

    public PersonMissingBean() {
        person = new PersonMissing();
        person.setAltLogins(new AltLogins());
    }

    public String listar() {
        PersonMissingDAO dao = new PersonMissingDAO();
        try {
            persons = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Persons";
    }

    public String eliminar() {
        PersonMissingDAO dao = new PersonMissingDAO();
        try {
            dao.delete(person);
            persons = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String agregar() {
        person = new PersonMissing();
        person.setAltLogins(new AltLogins());
        try {
            logins = new AltLoginsDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Agregar";
    }

    public String guardar() {
        PersonMissingDAO dao = new PersonMissingDAO();
        try {
            if (person.getIdPerson()!= 0) {
                dao.update(person);
            } else {
                dao.insert(person);
            }
            persons = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(PersonMissing person) {
        this.person = person;
        try {
            logins = new AltLoginsDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }

    public List<PersonMissing> getPersons() {
        return persons;
    }

    public void setPersons(List<PersonMissing> persons) {
        this.persons = persons;
    }

    public PersonMissing getPerson() {
        return person;
    }

    public void setPerson(PersonMissing person) {
        this.person = person;
    }

    public List<AltLogins> getLogins() {
        return logins;
    }

    public void setLogins(List<AltLogins> logins) {
        this.logins = logins;
    }

    
}
