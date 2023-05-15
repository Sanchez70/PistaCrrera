/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pistacarrera;

/**
 *
 * @author Joseline
 */
public class Auto {
    private String nombre;
    private String Tiempo;

    public Auto(String nombre, String Tiempo) {
        this.nombre = nombre;
        this.Tiempo = Tiempo;
    }

    public Auto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTiempo() {
        return Tiempo;
    }

    public void setTiempo(String Tiempo) {
        this.Tiempo = Tiempo;
    }

    @Override
    public String toString() {
        return "Auto{" + "nombre=" + nombre + ", Tiempo=" + Tiempo + '}';
    }
    
    
}
