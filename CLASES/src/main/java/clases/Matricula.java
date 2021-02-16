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
public class Matricula {
    long identificador;
    Alumno alumno ;
    String turno;
    String estado;
    
    public Matricula(){ 
    }
    public Matricula (long id, Alumno alumno, String turno, String estado){
        this.identificador = id;
        this.alumno = alumno;
        if("dia".equals(turno)){
            this.turno="DIURNO";
        }if("noche".equals(turno)){
            this.turno="VESPERTINO";
        }
        if("BAJA".equals(estado)){
            this.estado="BAJA";
        }
        if("ALTA".equals(estado)){
            this.estado="ALTA";
        }
    }

    //ToSTRING
    /**
     *
     * @return
     */
    @Override
    
    public String toString(){
        return "Matricula: "+identificador+" , "+alumno.getExpediente()+" , "+turno+" , "+estado;
    }
    
    //EQUALS
    public boolean equals(Matricula other){
        if(this.identificador != other.identificador){
            return false;
        }
        if(this.alumno != alumno){
            return false;
        }
        if(this.turno.equals(turno)){
            return false;
        }
        if(this.estado.equals(estado)){
            return false;
        }
        return true;
    }
    
    //GETTERS y SETTERS
    
    public long getIdentificador(){
        return identificador;
    }
    public void setIdentificador(long identificador){
        this.identificador = identificador;
    }
    public Alumno getAlumno(){
        return alumno;
    }
    public void setAlumno(Alumno alumno){
        this.alumno = alumno;
    }
    public String getTurno(){
        return turno;
    }
    public void setTurno(String turno){
        this.turno = turno;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }

}
