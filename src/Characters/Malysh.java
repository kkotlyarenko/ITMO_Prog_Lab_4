package Characters;

import Base.*;

public class Malysh extends SomeCharacter implements CanSpeak {

    public WannaExplain wannaExplain = new WannaExplain();

    @Override
    public String Speak(boolean inverse) {
        if (!inverse) return "Малыш хотел объяснить" + wannaExplain.getPhrase();
        return "Малыш не хотел объяснить" + wannaExplain.getPhrase();
    }

    public class WannaExplain {
        String phrase = "";

        public void setPhrase(String phrase) {
            this.phrase = phrase;
        }

        public String getPhrase() {
            return phrase;
        }
    }
    @Override
    public String Gender() {
        return "Male";
    }

    public Malysh(){
        super("Малыш");
    }
}
