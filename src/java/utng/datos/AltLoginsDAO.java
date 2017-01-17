/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.AltLogins;

/**
 *
 * @author janto
 */
public class AltLoginsDAO extends DAO<AltLogins> {
        public AltLoginsDAO() {
        super(new AltLogins());
    }

    public AltLogins getOneById(AltLogins login) throws HibernateException {
        return super.getOneById(login.getIdAltLogins());
    }
   
}
