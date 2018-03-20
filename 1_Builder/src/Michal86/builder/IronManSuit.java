package Michal86.builder;
//FLUENT INTERFACE

public class IronManSuit {

    private final String model;
    private String color;
    private String specialFeatures;
    private int safeFlyingHight;
    private String status;

    private IronManSuit(final Builder builder){
        this.model = builder.model;
        this.color = builder.color;
        this.specialFeatures = builder.specialFeatures;
        this.safeFlyingHight = builder.safeFlyingHight;
        this.status = builder.status;
    }

    //-- getters --
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public int getSafeFlyingHight() {
        return safeFlyingHight;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "[Model: "+model+", color: "+color+", features: "+specialFeatures+
                ", safe altitude: "+safeFlyingHight+", status: "+ status +"]\n";
    }

    //=== My Builder ===
    public static class Builder{
        private final String model;
        private String color;
        private String specialFeatures;
        private int safeFlyingHight;
        private String status;

        public Builder(String model){
            this.model = model;
        }

        public Builder color(String color){
            this.color = color;
            return this;
        }

        public Builder specialFeatures(String specialFeatures){
            this.specialFeatures = specialFeatures;
            return this;
        }

        public Builder safeFlyingHight(int safeFlyingHight){
            this.safeFlyingHight = safeFlyingHight;
            return this;
        }

        public Builder status(String status){
            this.status = status;
            return this;
        }

        public IronManSuit create(){
            return new IronManSuit(this);
        }
    }
    //===
}
