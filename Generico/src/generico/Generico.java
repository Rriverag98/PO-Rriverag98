/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;
//import java.util.ArrayList;
/**
 *
 * @author Rodrigo
 */
public class Generico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Team<SoccerPlayer> Barcelona = new Team<>("FC Barcelona");
        
        SoccerPlayer Messi = new SoccerPlayer("Lionel Messi");
        SoccerPlayer Suarez = new SoccerPlayer("Luis Suarez");
        SoccerPlayer Alcacer = new SoccerPlayer("Paco Alcácer");
        SoccerPlayer Pique = new SoccerPlayer("Gerard Pique");
        SoccerPlayer Busquets = new SoccerPlayer("Sergio Busquets");
        SoccerPlayer Rakitic = new SoccerPlayer("Ivan Rakitic");
        SoccerPlayer Alba = new SoccerPlayer("Jordi Alba");
        SoccerPlayer Umtiti = new SoccerPlayer("Samuel Umtiti");
        SoccerPlayer Iniesta = new SoccerPlayer("Andres Iniesta");
        SoccerPlayer Roberto = new SoccerPlayer("Sergi Roberto");
        SoccerPlayer Stegen = new SoccerPlayer("Marc-André ter Stegen");
        
        Barcelona.addPlayer(Messi);
        Barcelona.addPlayer(Suarez);
        Barcelona.addPlayer(Alcacer);
        Barcelona.addPlayer(Iniesta);
        Barcelona.addPlayer(Pique);
        Barcelona.addPlayer(Busquets);
        Barcelona.addPlayer(Rakitic);
        Barcelona.addPlayer(Alba);
        Barcelona.addPlayer(Pique);
        Barcelona.addPlayer(Umtiti);
        Barcelona.addPlayer(Roberto);
        Barcelona.addPlayer(Stegen);
                
        Team<SoccerPlayer> RealMadrid = new Team<>("Real Madrid C.F.");
        
        SoccerPlayer CRonaldo = new SoccerPlayer("Cristiano Ronaldo");
        SoccerPlayer Benzema = new SoccerPlayer("Karim Benzema");
        SoccerPlayer Bale = new SoccerPlayer("Gareth Bale");
        SoccerPlayer Kroos = new SoccerPlayer("Toni Kroos");
        SoccerPlayer Modric = new SoccerPlayer("Luka Modric");
        SoccerPlayer Casemiro = new SoccerPlayer("Carlos Casemiro");
        SoccerPlayer Marcelo = new SoccerPlayer("Marcelo da Silva");
        SoccerPlayer Nacho = new SoccerPlayer("Jose Fernandez");
        SoccerPlayer Ramos = new SoccerPlayer("Sergio Ramos");
        SoccerPlayer Carvajal = new SoccerPlayer("Daniel Carvajal");
        SoccerPlayer Navas = new SoccerPlayer("Keylor Navas");
        
        RealMadrid.addPlayer(CRonaldo);
        RealMadrid.addPlayer(Benzema);
        RealMadrid.addPlayer(Bale);
        RealMadrid.addPlayer(Kroos);
        RealMadrid.addPlayer(Modric);
        RealMadrid.addPlayer(Casemiro);
        RealMadrid.addPlayer(Marcelo);
        RealMadrid.addPlayer(Nacho);
        RealMadrid.addPlayer(Ramos);
        RealMadrid.addPlayer(Carvajal);
        RealMadrid.addPlayer(Navas);
        
        Team<FootballPlayer> Giants = new Team<>("New York Giants");
        
        FootballPlayer OBJ = new FootballPlayer("Odell Beckham jr");
        FootballPlayer Eli = new FootballPlayer("Elisha Manning");
        
        Giants.addPlayer(OBJ);
        Giants.addPlayer(Eli);
        
        League Laliga;
        Laliga = new League("La liga");
        
        Laliga.addTeam(Barcelona);
        Laliga.addTeam(RealMadrid);
        Laliga.addTeam(Giants);
        
        Barcelona.numPlayers();
        RealMadrid.numPlayers();
        
        Barcelona.matchResult(RealMadrid, 3, 2);
        
        Laliga.showLeagueTable();
    }
    
}
