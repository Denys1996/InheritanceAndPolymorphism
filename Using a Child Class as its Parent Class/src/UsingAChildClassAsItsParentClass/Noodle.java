package UsingAChildClassAsItsParentClass;

class Noodle {
//Instance Variables
    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";
//Constructor
    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

//Method
    public void cook() {

        this.texture = "cooked";

    }

}