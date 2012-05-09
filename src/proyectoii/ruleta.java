/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoii;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author JoXhe
 */
public class ruleta {
    private ArrayList<String> turno;
    private Random turn;
    
    public ruleta(){
        turn = new Random();
    }
    
    public boolean addTurn(String turn){
        if(turno.size()<6){
            this.turno.add(turn);
            return true;
        }
        return false;
    }
    
    public int getRuleta(){
        int i = (turno.isEmpty()==true)? 0 : 1;//turno.size();
        return i;//(int)(turn.nextDouble() * this.turno.size()+1);
    }
}
