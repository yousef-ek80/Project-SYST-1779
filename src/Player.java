/*  
 * SYST 17796 : DELIVERABLE 3 
 * The player class represent the player in the game.
 */
package wargame;

public class Player {

    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return this.hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}


