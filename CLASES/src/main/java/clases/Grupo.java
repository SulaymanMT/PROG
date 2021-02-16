/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Arrays;

/**
 *
 * @author Sulayman
 */
public class Grupo {
     int identificador;
     String codigo;
     String turno;
     String curso;
     String tutor;
     Estudio estudios;
     Matricula[] matriculas;
     Profesor[] profesores;

    
    //Constructor Vacio
    public Grupo(){
        
    }
    //Constructor por Parametros
    public Grupo(int identificador,String codigo,String turno,String curso,String tutor, Estudio estudios ,Matricula[] matriculas,Profesor[] profesores){
        this.identificador= identificador;
        this.codigo = codigo;
        this.turno=turno;
        this.curso=curso;
        this.tutor=tutor;
        this.estudios=estudios;
        this.matriculas=matriculas;
        this.profesores=profesores;
    }
    
    @Override
    public String toString(){
        return  "Grupo: "+identificador+" , codigo: "+codigo+" , Turno: "+turno+" , Curso: "+curso+" , Tutor: "+tutor+" , Estudio: "+
                estudios + " , Profesores: "+Arrays.toString(profesores)+" , Matriculas: "+Arrays.toString(matriculas);
    }
    
    
    public boolean equals(Grupo other){
        
        if(this.identificador != other.identificador){
            return false;
        }
        if(this.codigo.equals(other.codigo)){
            return false;
        }
        if(this.turno.equals(other.turno)){
            return false;
        }
        if(this.curso.equals(other.curso)){
            return false;
        }
        if(this.tutor.equals(other.tutor)){
            return false;
        }
        if(this.estudios != other.estudios){
            return false;
        }
        if(this.profesores != other.profesores){
            return false;
        }
        if(this.matriculas != other.matriculas){
            return false;
        }
        return true;
    }
    
    //GETTERS 

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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the tutor
     */
    public String getTutor() {
        return tutor;
    }

    /**
     * @param tutor the tutor to set
     */
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    /**
     * @return the estudios
     */
    public Estudio getEstudios() {
        return estudios;
    }

    /**
     * @param estudios the estudios to set
     */
    public void setEstudios(Estudio estudios) {
        this.estudios = estudios;
    }

    /**
     * @return the matriculas
     */
    public String getMatriculas() {
        return Arrays.toString(matriculas);
    }

    /**
     * @param matriculas the matriculas to set
     */
    public void setMatriculas(Matricula[] matriculas) {
        this.matriculas = matriculas;
    }

    /**
     * @return the profesores
     */
    public String getProfesores() {
        return Arrays.toString(profesores);
    }

    /**
     * @param profesores the profesores to set
     */
    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }
    
    
    
    
    
    
}
