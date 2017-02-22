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
public class Evento {
    private String name;
    private String lugar;
    private Double horario;
    private ArrayList <Equipo> equipos;

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

    /**
     * @return the lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * @return the horario
     */
    public Double getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(Double horario) {
        this.horario = horario;
    }
    
    private boolean findEquipo(String name){
        if (!this.equipos.isEmpty()){
            for (Equipo equipos: this.equipos){
                if (equipos.getName().equals(name)){
                   return true;
                }
            }
        }
        return false;
    }

    public boolean inscribirEquipo(String name){
        if (findEquipo(name)==false){
            this.equipos.add(new Equipo());
            return true;   
            }
        return false;
    }
    
    public boolean eliminarEquipo(String name){
        if (findEquipo(name)==true){
            this.equipos.remove(new Equipo());
            return true;
        }
        return false;
    }
    
    public boolean actualizarEquipos(String name, String disciplina) {
        if(!this.equipos.isEmpty()) {
            for(Equipo temp : equipos) {
                if ((temp.getDisciplina().equals(disciplina))){
                    temp.setName(name);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean actualizarEquipos(Equipo equipos) {
        actualizarEquipos(equipos.getName(), equipos.getDisciplina());
        return (actualizarEquipos(equipos.getName(), equipos.getDisciplina()));
    }
    
    @Override
    public String toString(){
        String a;
        a= "Evento: "+this.name+"\n Lugar: "+this.lugar+"\n Horario: "+this.horario;
        for (Equipo temp: equipos){
            a += "Equipos: "+temp.teamName();
        }
        return a;        
    }
    
}
