package LanguageFamilies;

class SinoTibetan extends Language {
    //constructor
    //Sino-Tibetan languages share several traits in common. In this case: regionsSpoken: "Asia" and wordOrder: "subject-object-verb"
    SinoTibetan(String langName, int speakers) {
        super(langName, speakers, "Asia", "subject-object-verb");
        if(langName.contains("Chinese") || langName.contains("Bai")) {
            this.wordOrder = "subject-verb-object";
        }
    }
}