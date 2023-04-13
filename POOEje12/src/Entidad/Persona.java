/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author brian
 */
public class Persona {
        private String persona;
    private Date fdn;

    public Persona() {
    }

    public Persona(String persona, Date fdn) {
        this.persona = persona;
        this.fdn = fdn;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public Date getfdn() {
        return fdn;
    }

    public void setfdn(Date fdn) {
        this.fdn = fdn;
    }

    @Override
    public String toString() {
        return "Persona{" + "persona=" + persona + ", fdn=" + fdn + '}';
    }
}
