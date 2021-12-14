/*
 * SYST 17796 : DELIVERABLE 3  
 * Representation of a single playing card (from a standard 52 card deck).
 * A card consists of a suit value, a rank value, and card value  
 * Once instantiated, the
 * Card object(s) cannot be changed.
 */
package wargame;

/**
 *
 * @author yousef
 */
public class card implements Comparable<card> {
    private final Rank rank;
    private final Suit suit;
    private final String card;


    card(Rank rank, Suit suit) {
        if (rank == null || suit == null) {
            throw new NullPointerException();
        }
        this.rank = rank;
        this.suit = suit;
        this.card = String.format("%s%s", rank.toString(), suit.getSymbol());
    }

    /**
     * example: CLUBS
     *
     * @return Enumeration name of a card objects suit
     */
    public Suit getSuit() {
        return this.suit;
    }

    /**
     * example: CLUBS = C
     *
     * @return Shorthand of an objects suit
     */
    public String getSuitLetter() {
        return this.suit.getSymbol();
    }

    /**
     * example: ACE
     *
     * @return Enumartion name of a card objects rank
     */
    public Rank getRank() {
        return this.rank;
    }

    /**
     * example: ACE = A, TWO = 2
     *
     * @return Shorthand of an objects rank
     */
    public String getRankLetter() {
        return this.rank.toString();
    }

    /**
     * example: TW0 = 2, not suit has no bearing on points
     *
     * @return Number indicating how many points the card is worth
     */
    public Integer getCardPoints() {
        return this.rank.getPointValue();
    }

    /**
     * example: ACE of SPADES = AS
     *
     * @return Shorthand of an objects rank and suit
     */
    public String getCard() {
        return this.card;
    }

    /**
     * @return 1 if point value thisCard > other,  -1 if this < other and 0 if equal
     * @param: a card object
     */
    public int compareTo(card other) {

        return this.getCardPoints().compareTo(other.getCardPoints());
    }

    /**
     * @param other
     * @return true if string value of suit of2 different cards are the same
     * @param: a card object
     */
    public boolean isSameSuit(card other) {
        return this.suit.equals(other.suit);
    }

    /**
     * @param other
     * @return true if string value of rank of 2 different cards are the same
     * @param: a card object
     */
    public boolean isSameRank(card other) {
        return this.rank.equals(other.rank);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!card.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        final card other = (card) obj;
        return this.suit == other.suit && this.rank == other.rank;
    }

    /**
     * example: Ace of Spades
     *
     * @return Full written name of a card object
     */
    @Override
    public String toString() {
        return this.rank.getRankName() + " of " + this.suit.getSuitName();
    }
}
