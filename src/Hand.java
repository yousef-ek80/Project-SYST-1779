/*  
 * SYST 17796 : DELIVERABLE 3 
 * The hand class represent the hands dealt to the player(s)
 */
package wargame;

import java.util.ArrayList;
import java.util.List;

/**
 * Representative of an individual cards of cards. 
 * As per deliverable 1 , War specifically starts with 26 cards.
 *
 * 
 *
 *
 * @author yousef El-khadary
 */
public class Hand {

    private final List<card> cards; //the players individual cards


    public Hand() {
        this.cards = new ArrayList<>();
    }

    /**
     * Merge another hand into this one
     *
     * @param other
     */
    public void mergeHand(Hand other) {
        other.cards.forEach((c) -> {
            this.addCardToBottom(c);
        });
    }


    /**
     * Take a variable number of cards
     *
     * @param numCards
     * @return
     */
    public List<card> take(int numCards) {
        if (numCards > this.handSize()) {
            return null;
        }

        List<card> out = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            out.add(this.cards.remove(this.handSize() - 1));
        }

        return out;
    }

    /**
     * @param c
     * @param: c single Card object added to end of Array
     * This adds a card to the end of the deck. 
     */
    public void addCardToTop(card c) {
        if (c == null) {
            throw new NullPointerException("Can't add a null card to a cards.");
        }
        cards.add(c);
    }

    /**
     * adds more than one card at a time to hand
     *
     * @param cds cards added to hand as array
     */
    public void addCardsToTop(List<card> cds) {
        this.cards.addAll(cds);
    }

    /**
     * @param c single Card object added to beginning of Array
     */
    public void addCardToBottom(card c) {
        cards.add(0, c);
    }

    /**
     * removes the card from the last index of the array
     * @return 
     */
    public card removeCardFromTop() {
        if (handSize() < 1) {
            return null;
        }
        return cards.remove(handSize() - 1);
    }

    /**
     * removes card from the first index of the array
     * @return 
     */
    public card removeCardFromBottom() {
        if (handSize() < 1) {
            return null;
        }
        return cards.remove(0);
    }

    /**
     * Returns the number of cards in the cards.
     * @return 
     */
    public int handSize() {
        return cards.size();
    }

}






