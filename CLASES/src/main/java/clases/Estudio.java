/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Arrays;

/**
 *
 * @author sulayman
 */
public class Estudio {
    
     int identificador;
     String nombre;
     Materia[] materias;
    
    public Estudio(){
        
    }
    public Estudio(int identificador,String nombre,Materia[] materias){
        this.identificador=identificador;
        this.nombre=nombre;
        this.materias=materias;
    }
    
    //ToString

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "Materia Nº: "+identificador+" , Nombre: "+nombre+" , Materias: "+Arrays.toString(materias);
    }

    //GETTERS && SETTERS
    
    /**
     * @return the identificador
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the materias
     */
    public String getMaterias() {
        return Arrays.toString(materias);
    }

    /**
     * @param materias the materias to set
     */
    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }
    
    
}
