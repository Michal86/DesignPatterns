import Michal86.builder.IronManSuit;

public class Main {
    public static void main(String[] args){
        //Test Builder
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
    }

}
