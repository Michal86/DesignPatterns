import Michal86.builder.IronManSuit;
import Michal86.classicBuilder.Mark1Builder;
import Michal86.classicBuilder.Suit;
import Michal86.classicBuilder.SuitDirector;

public class Main {
    public static void main(String[] args){
        //FLUENT INTERFACE
        IronManSuit model1_0 = new IronManSuit.Builder("Mark I")
                .color("Steel Silver")
                .specialFeatures("Jet Boots")
                .safeFlyingHight(20)
                .status("Destroyed")
                .create();

        IronManSuit model1_1 = new IronManSuit.Builder("Mark I")
                .color("Steel Silver")
                .specialFeatures("Jet Boots 2")
                .safeFlyingHight(21)
                .status("Destroyed")
                .create();

        System.out.println(model1_0);
        System.out.println(model1_1);

        //CLASSIC BUILDER
        Mark1Builder mark1 = new Mark1Builder();
        SuitDirector suitDirector = new SuitDirector(mark1);
        suitDirector.makeSuit();

        Suit model1_2 = suitDirector.getSuit();
        System.out.println(model1_2);

    }

}
