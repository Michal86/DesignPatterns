package Michal86.classicBuilder;
/**
 * This builder creates specific model - Mark 1
 * We could create another one i.e. Mark2Builder for next generation model
 * and pass Mark II model, color etc.
 */

public class Mark1Builder implements SuitBuilder{

    private Suit suit;

    public Mark1Builder(){
        this.suit = new Suit();
    }

    @Override
    public void buildModel() {
        Model model = new Model();
        model.setModel("Mark I");
        model.setColor("Silver");

        suit.setModel(model);
    }

    @Override
    public void buildFeatures() {
        Features features = new Features();
        features.setSafeFlyingHight(21);
        features.setSpecialFeatures("Jet Boots");

        suit.setFeatures(features);
    }

    @Override
    public Suit getSuit() {
        return suit;
    }
}
