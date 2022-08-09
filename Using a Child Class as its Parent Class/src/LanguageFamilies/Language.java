package LanguageFamilies;

import java.util.HashMap;

class Language {
    //Fields
    protected String name;
    protected int numSpeakers;
    protected String regionSpoken;
    protected String wordOrder;

    //Constructor
    Language(String langName, int speakers, String regions, String wOrder) {
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionSpoken = regions;
        this.wordOrder = wOrder;
    }
    //Methods
    //Setter
    public void setName(String newName) {
        this.name = newName;
    }
    public void setNumSpeakers(int newNumSpeakers) {
        this.numSpeakers = newNumSpeakers;
    }
    public void setRegionSpoken(String newRegionSpoken) {
        this.regionSpoken = newRegionSpoken;
    }
    public void setWordOrder(String newWordOrder) {
        this.wordOrder = newWordOrder;
    }

    public void getInfo() {
        System.out.println("\n" + this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionSpoken + ". \nThe language follows the word order: " + this.wordOrder + ".");
    }

//main
    // public static void main(String[] args) {
    //   Language spanish = new Language("spanish" , 5022, "Mexico", "subject-verb-object");
    //   spanish.getInfo();

    //   Mayan chontal = new Mayan("Chontal", 36810);
    //   chontal.getInfo();

    //   SinoTibetan mandarinChinese = new SinoTibetan("Mandarin Chinese", 120000000);
    //   mandarinChinese.getInfo();

    //   SinoTibetan burmese = new SinoTibetan("Burmese", 3300000);
    //   burmese.getInfo();
    //  }
    // }
    //BONUS
    //an array or ArrayList of several language objects and loop through them to call getInfo()
    public static void main(String[] args) {
        Language chonal, mandarinChinese, burmese;

        chonal = new Mayan("Chotal", 36810);
        mandarinChinese =  new SinoTibetan("Chinese", 3300000);
        burmese = new SinoTibetan("Burmese", 3300000);
// Declare and initialize an array
        Language[] allLanguages = {chonal, mandarinChinese, burmese};
// for(Language allLanguage : allLanguages) {
//    //Print the name of each language
//   allLanguage.getInfo();
//   }
        allLanguages[0].setName("Chonal");
        System.out.println(allLanguages[0].name);

       //Map out the sign language families.
        HashMap<String, String> singLanguagesAndLocations = new HashMap<>();
        singLanguagesAndLocations.put("French", "Europe, the Americas, Francophone Africa, parts of Asia");
        singLanguagesAndLocations.put("British", "United Kingdom, Australia, New Zealand, South Africa");
        singLanguagesAndLocations.put("Arab", "Much of the Arab World");
        singLanguagesAndLocations.put("Japanase", "Japan, Korea, Taiwan");
        singLanguagesAndLocations.put("German", "Germany, Poland, Israel");
        singLanguagesAndLocations.put("Swedish", "Sweden, Finland, Portugal");

        System.out.println(singLanguagesAndLocations);


    }

}




