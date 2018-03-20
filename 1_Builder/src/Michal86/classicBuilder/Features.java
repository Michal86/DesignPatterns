package Michal86.classicBuilder;

public class Features {

    private String specialFeatures;
    private int safeFlyingHight;

    public String getSpecialFeatures(){
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures){
        this.specialFeatures = specialFeatures;
    }

    //---
    public int getSafeFlyingHight() {
        return safeFlyingHight;
    }

    public void setSafeFlyingHight(int safeFlyingHight){
        this.safeFlyingHight = safeFlyingHight;
    }

    //---
    @Override
    public String toString() {
        return "( "+specialFeatures+", safe altitude "+safeFlyingHight+"m )";
    }
}
