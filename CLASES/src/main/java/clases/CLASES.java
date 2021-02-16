/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Arrays;

/**
 *
 * @author prog
 */

public class CLASES {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //TODO code application logic here
        
        //objetos de la clase Materia
        Materia mat1 = new Materia("SSII","Sistemas informáticos.");
        Materia mat2 = new Materia("BBDD","Bases de datos.");
        Materia mat3 = new Materia("PROG","Programación.");
        Materia mat4 = new Materia("LMSGI","Lenguajes de marcas y sistemas de gestión de información.");
        Materia mat5 = new Materia("EEDD","Entornos de Desarrollo.");
        Materia mat6 = new Materia("FOL", "Formación y orientación laboral.");
        
        Materia[] daw = {mat1,mat2,mat3,mat4,mat5,mat6};  
        //objeto de la clase Estudio
        Estudio est = new Estudio(51000331,"Técnico superior en desarrollo de aplicaciones web",daw);
        
        //objeto de la clase Departamento 
        Departamento dep = new Departamento(12215,"Informatica");
        
        //objetos de clase de Profesor
         Profesor prof1 = new Profesor(32,"12345678A","Jose OSCAR","Gonzales","Gutierrez",dep.nombre);
         Profesor prof2 = new Profesor(34,"98765432B","Javi","Castillo","J",dep.nombre);
         Profesor prof3 = new Profesor(31,"87135642E","Javier","De","Reyes",dep.nombre);
         Profesor prof4 = new Profesor(30,"55125215G","Rosendo","Pulido","Saez",dep.nombre);
         Profesor prof5 = new Profesor(33,"15454545Y","Teresa","Laggares","Fuentes",dep.nombre);
         Profesor prof6 = new Profesor(35,"01242185I","Javier","Criado","Navarro",dep.nombre);
         
         Profesor[] profs= {prof1,prof2,prof3,prof4,prof5,prof6};
        
        //objetos de clase Direccion
        Direccion dir1 = new Direccion("Av Malaga",13,2,"B1",51002);
        
        //objeto de clase Alumno
        Alumno a1 =new Alumno("12345679Q","mohamed","AHMED","Mohamed",20,9820,615121521,"sulayman@sulay.man","Fatima","Mohamed",644218542,95451542,dir1); 
        
        //objeto de clase Matricula
        Matricula m1 = new Matricula(020120,a1,"Dia","Alta");
        
        Matricula[] m={m1};
        
        //objeto de clase Grupo
        Grupo g1= new Grupo();
        
        g1.setIdentificador(40);
        g1.setCodigo("1DAW");
        g1.setTurno("dia");
        g1.setCurso("Grado Superior");
        g1.setTutor(prof1.getNombre());
        g1.setEstudios(est);
        g1.setMatriculas(m);
        g1.setProfesores(profs);
        
        
       
        
        System.out.println(Arrays.toString(daw));
        System.out.println(est.toString());
        System.out.println(dep.toString());
        System.out.println(Arrays.toString(profs));
        System.out.println(dir1.toString());
        System.out.println(a1.toString());
        System.out.println(Arrays.toString(m));
        System.out.println(g1.toString());
    }
}
