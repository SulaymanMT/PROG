/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


/**
 *
 * @author Sulayman
 */
public class Profesor {
    
    int identificador;
    String dni;
    String nombre;
    String apellido1;
    String apellido2;
    String departamento;
    
    //Constructor Vacio 
    public Profesor(){
        
    }
    //Constructor por paramateros
    public Profesor(int identificador,String dni,String nombre,String apellidio1, String apellido2,String departamento){
        
    }
    
    
    //ToString
    /** 
     @return
     */
    @Override
    public String toString(){
        return   "profesor: "+identificador+", DNI: "+dni+", Nombre: "+nombre+", Apellidos: "+apellido1+" "+apellido2+", Departamento: ";
    }
    //Equls 
    public boolean equals(Profesor other){
        if(this.identificador != other.identificador){
            return false;
        }
        if(this.dni.equals(other.dni)){
            return false;
        }
        if(this.nombre.equals(other.nombre)){
            return false;
        }
        if(this.apellido1.equals(other.nombre)){
            return false;
        }
        if(this.apellido2.equals(other.apellido2)){
            return false;
        }
        if(this.departamento.equals(other.departamento)){
            return false;
        }
        return true;
    }
    
    //Getters

    public int getIdentificador(){
        return identificador;
    }
    public String getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido1(){
        return apellido1;
    }
    public String getApellido2(){
        return apellido2;
    }
    public String getDepartamento(){
        return departamento;
    }
    //Setters
    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido1(String Apellido1){
        this.apellido1=apellido1;
    }
    public void setApellido2(String apellido2){
        this.apellido2=apellido2;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
}
