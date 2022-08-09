package LanguageFamilies;

class Mayan extends Language {

    //Constructor
    Mayan(String languageName, int speakers) {
        super(languageName, speakers, "Central America", "verb-object-subject");
    }
    //Method
    @Override
    public void getInfo() {

        System.out.println("\n" + this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder);
        System.out.println("Fun fact: " + this.name + " is an ergative language.");

    }

}
