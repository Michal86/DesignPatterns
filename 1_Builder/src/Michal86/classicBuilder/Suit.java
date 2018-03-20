package Michal86.classicBuilder;

public class Suit {

    private Model model;
    private Features features;

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    //---
    public Features getFeatures(){
        return features;
    }

    public void setFeatures(Features features){
        this.features = features;
    }

    //---
    @Override
    public String toString() {
        return "Suit [model= "+model+" , features= "+ features+" ]";
    }
}
