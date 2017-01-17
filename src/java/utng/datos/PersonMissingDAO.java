/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.PersonMissing;

/**
 *
 * @author janto
 */
public class PersonMissingDAO extends DAO<PersonMissing> {

    public PersonMissingDAO() {
        super(new PersonMissing());
    }

    public PersonMissing getOneById(PersonMissing person) throws HibernateException {
        return super.getOneById(person.getIdPerson());
    }
}
