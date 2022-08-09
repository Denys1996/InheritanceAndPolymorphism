package ChildClassesInArraysAndArrayLists;

class Spaghetti extends Noodle {

    Spaghetti() {

        super(30.0, 0.2, "round", "semolina flour");
        this.name = "Spaghetti";
    }

    @Override
    public String getCookPrep() {

        return "Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.";

    }

}
