/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author free
 */
public class Persona {
    private String nombre;
    private Date fechaNacio;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacio) {
        this.nombre = nombre;
        this.fechaNacio = fechaNacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacio() {
        return fechaNacio;
    }

    public void setFechaNacio(Date fechaNacio) {
        this.fechaNacio = fechaNacio;
    }
    
}
