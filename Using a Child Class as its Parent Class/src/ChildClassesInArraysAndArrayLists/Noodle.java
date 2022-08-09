package ChildClassesInArraysAndArrayLists;

class Noodle {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";
    protected String name = "noodles";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public String getCookPrep() {

        return "Boil noodle for 7 minutes and add sauce.";

    }


    public static void main(String[] args) {

        Noodle spaghetti, ramen, pho;

        spaghetti = new Spaghetti();
        ramen = new Ramen();
        pho = new Pho();

        // Declare and initialize an array of type Noodle called allTheNoodles (Array)
        Noodle[] allTheNoodles = {spaghetti, ramen, pho};
        //Loop through each noodle in allTheNoodles
        for(Noodle allTheNoodle : allTheNoodles) {
            //Print the name of each noodle and its method
            System.out.println("This is " + allTheNoodle.name + ": " + allTheNoodle.getCookPrep() + "\n");
        }
    }

}