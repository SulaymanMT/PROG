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
public class Direccion {
    String nombre;
    int numero;
    int planta;
    String puerta;
    int codPostal;
    
    //Constroctur Vacio
    
    public Direccion(){
        
    }
    //Constroctur por Parametros
    public Direccion(String nombre,int numero,int planta,String puerta,int codPostal){
        this.nombre = nombre;
        this.numero = numero;
        this.planta = planta;
        this.puerta = puerta;
        this.codPostal = codPostal;
    }
    
    @Override
    
    public String toString(){
        return "Direccion: "+nombre +" , "+ numero +" , "+ planta +" , "+ puerta +" , "+codPostal; 
    }
    
    //EQUALS
    
    public boolean equals(Direccion other){
        if(this.nombre.equals(nombre)) {
            return false;
        }
        if(this.numero != other.numero){
            return false;
        }
        if(this.planta != other.planta){
            return false;
        }
        if(this.puerta.equals(puerta)){
            return false;
        }
        if(this.codPostal != other.codPostal){
            return false;
        }
        return true;
    }
    
    //GETTERS && SETTERS
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getPlanta(){
        return numero;
    }
    public void setPlanta (int planta){
        this.planta = planta;
    }
    public String getPuerta (){
        return puerta;
    }
    public void setPuerta(String puerta){
        this.puerta = puerta;
    }
    public int getCodPostal(){
        return codPostal;
    }
    public void setCodPostal(int codPostal){
        this.codPostal = codPostal;
    }
}

