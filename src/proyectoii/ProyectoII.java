/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoii;

/**
 *
 * @author JoXhe
 */
public class ProyectoII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ruleta rnd = new ruleta();
        
        for(int i=0;i<10;i++){
            System.out.println(rnd.getRuleta());
        }
    }
}
