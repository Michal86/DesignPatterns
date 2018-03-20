package Michal86.classicBuilder;
/**
 * Class takes SuitBuilder type,
 * then we're making new suit,
 * and return the Suit
 */
public class SuitDirector {

    private SuitBuilder suitBuilder;

    public SuitDirector(SuitBuilder suitBuilder){
        this.suitBuilder = suitBuilder;
    }

    public void makeSuit(){
        suitBuilder.buildModel();
        suitBuilder.buildFeatures();
    }

    //return newly made suit
    public Suit getSuit(){
        return this.suitBuilder.getSuit();
    }
}
