/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class Equipo {
    private ArrayList <Alumno> alumnos;
    private String name;
    private String disciplina;
    

    /**
     * @return the disciplina
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

      public boolean registrarAlumnos(String name,String career,int id,int age,char gender){
        if (findAlumno(name)==false){
            this.alumnos.add(new Alumno(name,career,id,age,gender));
            return true;
        }
        return false;
        
    }
    
    private boolean findAlumno(String name){
        if (!this.alumnos.isEmpty()){
            for (Alumno alumnos: this.alumnos){
                if (alumnos.getName().equals(name)){
                   return true;
                }
            }
        }
        return false;
    }
    
    public boolean removeIntegrante(String name,String career,int id,int age,char gender){
        if (findAlumno(name)==true){
            this.alumnos.remove(new Alumno(name,career,id,age,gender));
            return true;
        }else{
            return false;
        }
    }
    
    public boolean actualizarRoster(String name, int id) {
        if(!this.alumnos.isEmpty()) {
            for(Alumno temp : alumnos) {
                if ((temp.getId() == id)){
                    temp.setName(name);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean actualizarRoster(Alumno alumnos) {
        actualizarRoster(alumnos.getName(), alumnos.getId());
        return (actualizarRoster(alumnos.getName(), alumnos.getId()));
    }
    
     @Override 
    public String toString(){
        String a;
        a= "Equipo: "+this.name+"\n Disciplina: "+this.disciplina;
        for (Alumno alumnos: alumnos){
            a += "Alumno: "+alumnos.toString();
        }
        return a;        
    }
    public String teamName(){
        return "Equipo: "+this.name;
                
    }
    
    
}
