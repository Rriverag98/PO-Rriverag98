/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Rodrigo
 */
public class League<T extends Team> {
    public String name;
    ArrayList<T> league = new ArrayList();
    
    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team){
        if (league.contains(team)){
            System.out.println("Team already in league");
            return false;
        }
        league.add(team);
        System.out.println(team.getName() + " introduced to " + this.name );
        return true;    
    }
    
    public void showLeagueTable(){
        Collections.sort(league);
        System.out.println("----------La Liga-Standings----------");
        for(T t: league) {
            System.out.println(t.getName()+":"+t.ranking());
            
        }
    }
    
}
