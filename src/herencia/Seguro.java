/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;


/**
 *
 * @author prog
 */
public class Seguro {
    String nombre;
    String dni;
    String compañia;
    int coutaAnual;
    String fechaContratacion;
    String fechaVencimiento;
    Boolean Autorenovacion;

    public Seguro(String nombre, String dni, String compañia, int CoutaAnual, String fechaContratacion, String fechaVencimiento, Boolean Autorenovacion) {
        this.nombre = nombre;
        this.dni = dni;
        this.compañia = compañia;
        this.coutaAnual = CoutaAnual;
        this.fechaContratacion = fechaContratacion;
        this.fechaVencimiento = fechaVencimiento;
        this.Autorenovacion = Autorenovacion;
    }

    @Override
    public String toString() {
        return "Seguro{" + "nombre=" + nombre + ", dni=" + dni + ", compa\u00f1ia=" + compañia + ", CoutaAnual=" + coutaAnual + ", fechaContratacion=" + fechaContratacion + ", fechaVencimiento=" + fechaVencimiento + ", Autorenovacion=" + Autorenovacion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    
    public boolean Equals(Seguro other) {
        if(!this.nombre.equals(other.nombre)) {
            return false;
        }
        if(!this.dni.equals(other.dni)) {
            return false;
        }
        if(!this.compañia.equals(other.compañia)) {
            return false;
        }
        if(this.coutaAnual!= other.coutaAnual) {
            return false;
        }
        if(!this.fechaContratacion.equals(other.fechaContratacion)) {
            return false;
        }
        if(!this.fechaVencimiento.equals(other.fechaVencimiento)) {
            return false;
        }
        if(this.Autorenovacion!=other.Autorenovacion) {
            return false;
        }
        return true;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public int getCoutaAnual() {
        return coutaAnual;
    }

    public void setCoutaAnual(int CoutaAnual) {
        this.coutaAnual = CoutaAnual;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Boolean getAutorenovacion() {
        return Autorenovacion;
    }

    public void setAutorenovacion(Boolean Autorenovacion) {
        this.Autorenovacion = Autorenovacion;
    }
    
}
