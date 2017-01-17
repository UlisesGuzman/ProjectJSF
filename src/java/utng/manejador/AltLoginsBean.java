/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.AltLoginsDAO;
import utng.modelo.AltLogins;

/**
 *
 * @author Ulises
 */
@ManagedBean
@SessionScoped
public class AltLoginsBean implements Serializable {

    private List<AltLogins> logins;
    private AltLogins login;

    public String listar() {
        AltLoginsDAO dao = new AltLoginsDAO();
        try {
            logins = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Logins";
    }

    public String eliminar() {
        AltLoginsDAO dao = new AltLoginsDAO();
        try {
            dao.delete(login);
            logins = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String agregar() {
        login = new AltLogins();
        return "Agregar";
    }

    public String guardar() {
        AltLoginsDAO dao = new AltLoginsDAO();
        try {
            if (login.getIdAltLogins()!= 0) {
                dao.update(login);
            } else {
                dao.insert(login);
            }
            logins = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(AltLogins login) {
        this.login = login;
        return "Editar";
    }

    public List<AltLogins> getLogins() {
        return logins;
    }

    public void setLogins(List<AltLogins> logins) {
        this.logins = logins;
    }

    public AltLogins getLogin() {
        return login;
    }

    public void setLogin(AltLogins login) {
        this.login = login;
    }

    

}
