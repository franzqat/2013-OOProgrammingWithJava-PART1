
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class Team {

    private final String name;
    private ArrayList<Player> team;
    private int maxSize;

    public Team(String n) {
        name = n;
        team = new ArrayList<Player>();
        maxSize = 16;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player p) {
        if (team.size() < maxSize)
        team.add(p);
        else System.out.println("Error!");
        
    }

    public void printPlayers() {
        for (Player p : team) {
            System.out.println(p);
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
        
    }
    public int size(){
        return team.size();
    }
    
    public int goals(){
        int g=0;
        for (Player p : team)
            g+=p.goals();
        return g;
                    
    }
}
