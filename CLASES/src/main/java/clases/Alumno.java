/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


/**
 *
 * @author prog
 */
public class Alumno {
    String nombre;
    String apellido1;
    String apellido2;
    int edad;
    int telefono;
    String dni;
    int expediente;
    String correo;
    String nombrePadre;
    String nombreMadre;
    int telMadre;
    int telPadre;
    Direccion direcciones ;
    Grupo grupo;
    
    public Alumno(){
        
    }
    
    public Alumno(String dni,String nombre,String apellido,String apellido2, int edad, int telefono, int expediente,
            String correo, String nomPadre, String nomMadre,int telMadre,int telPadre,Direccion direcciones){
        this.dni= dni;
        this.nombre=nombre;
        this.apellido1=apellido;
        this.apellido2=apellido2;
        this.edad=edad;
        this.telefono=telefono;
        this.expediente=expediente;
        this.correo=correo;
        this.nombrePadre=nomPadre;
        this.nombreMadre=nomMadre;
        this.telPadre=telPadre;
        this.telMadre=telMadre;
        this.direcciones = direcciones;
        
    }
    
    @Override
    public String toString(){
        return "Alumno: "+dni +" , "+ nombre +" , "+ apellido1 +" , "+ apellido1+" , "+ edad+" , "+ telefono+" , "+ expediente+" , "+correo+" , "+nombrePadre+" , "+nombreMadre+" , "+telPadre+" , "+telMadre+" , "+direcciones ; 
    }
    //EQUALS
    public boolean equals(Alumno other){
        if(this.dni.equals(other.dni) ){
            return false;
        }
        if(this.nombre.equals(other.nombre)){
            return false;
        }
        if(this.apellido1.equals(other.apellido1)){
            return false;
        }
        if(this.apellido2.equals(other.apellido2)){
            return false;
        }
        if(this.edad != other.edad){
            return false;
        }
        if(this.telefono != other.telefono){
            return false;
        }
        if(this.expediente != other.expediente){
            return false;
        }
        if(this.correo.equals(other.correo)){
            return false;
        }
        if(this.nombreMadre.equals(other.nombreMadre)){
            return false;
        }
        if(this.nombrePadre.equals(other.nombrePadre)){
            return false;
        }
        if(this.telPadre != other.telPadre){
            return false;
        }
        if(this.telMadre != other.telMadre){
            return false;
        }
        if(this.direcciones != other.direcciones){
            return false;
        }
        return true;
    }
    //GETTER y SETTERS
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido1(){
        return apellido1;
    }
    public void setApellido1(String apellido1){
        this.apellido1 = apellido1;
    }
    public String getApellido2(){
        return apellido2;
    }
    public void setApellido2(String apellido2){
        this.apellido2 = apellido2;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getExpediente (){
        return expediente;
    }
    public void setExpediente(int expediente){
        this.expediente = expediente;
    }
    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public String getNombrePadre(){
        return nombrePadre;
    }
    public void setNombrePadre(String nombrePadre){
        this.nombrePadre = nombrePadre;
    }
    public String getNombreMadre(){
        return nombreMadre;
    }
    public void setNombreMadre(String nombreMadre){
        this.nombreMadre = nombreMadre;
    }
    public Direccion getDirecciones(){
        return direcciones;
    }
    public void setDirecciones(Direccion direcciones){
        this.direcciones =direcciones;
    }
    public int getTelPadre(){
        return telPadre;
    }
    public int getTelMadre(){
        return telMadre;
    }
    public void setTelMadre(int telMadre){
        this.telMadre = telMadre;
    }
    public void setTelPadre(int telPadre){
        this.telPadre = telPadre;
    }
   
    
}

