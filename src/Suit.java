
/**
 * SYST 17796 : DELIVERABLE 3 
 * Representation of the four suits in a standard deck of cards.hearts , clubs
 * diamonds and spades. 
 */



package wargame;


public enum Suit {
    DIAMONDS("Diamonds", "D"),
    SPADES("Spades", "S"),
    CLUBS("Clubs", "C"),
    HEARTS("Hearts", "H");

    private final String suitName;
    private final String symbol;

    Suit(String suitName, String symbol){
        this.suitName = suitName;
        this.symbol = symbol;
    }

    /**
     *example HEARTS = H
     * @return shortHand of suit
     */
    public String getSymbol(){
        return this.symbol;
    }

    /**
     *example Hearts = Hearts
     * @return longHand of suit
     */
    public String getSuitName() {
        return this.suitName;
    }

    /**
     *example HEARTS = H
     * @return shortHand of suit
     */
    @Override
    public String toString() {
        return this.getSymbol();
    }

}



