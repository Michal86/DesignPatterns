package Michal86.classicBuilder;

public class Model {

    private String model;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //---
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    //---
    @Override
    public String toString() {
        return "( "+model+", "+color+" )";
    }
}
