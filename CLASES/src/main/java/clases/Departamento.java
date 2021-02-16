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
public class Departamento {
    
    int identificador;
    String nombre;
    
    public Departamento(){
        
    }
    public Departamento(int identificador,String nombre){
       
        this.identificador=identificador;
        this.nombre=nombre;
       
    }
    
    //ToSTring
    
    @Override
    public String toString(){
        return "Departamento Nº: "+identificador+" , Nombre: "+nombre;
    }
    
    //EQUALS
    
    public boolean equals(Departamento other){
        if(this.identificador != other.identificador){
            return false;
        }
        if(this.nombre.equals(other.nombre)){
            return false;
        }
        return true;
    }

    //SETTERS  && GETTERS
    
    public int getIdentificador(){
        return identificador;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setIdentificador(int identificador){
        this.identificador= identificador;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
}
