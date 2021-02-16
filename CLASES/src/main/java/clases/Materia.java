/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author sulayman
 */
public class Materia {
    String identificador;
    String nombre;
    
    public Materia(){
        
    }
    public Materia(String identificador,String nombre){
       
        this.identificador=identificador;
        this.nombre=nombre;
       
    }
     
    /**
     * toString method
    @Override 
    */
    public String toString(){
        return "Materia Nº: "+identificador;
    }
    
    //Equals
    public boolean equals(Materia other){
        if(this.identificador.equals(other.identificador)){
            return false;
        }
        if(this.nombre.equals(other.nombre)){
            return false;
        }
        return true;
    }

    //SETTERS  && GETTERS
    
    public String getIdentificador(){
        return identificador;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setIdentificador(String identificador){
        this.identificador= identificador;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
