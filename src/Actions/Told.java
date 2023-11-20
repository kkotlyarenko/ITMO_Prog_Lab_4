package Actions;

import Base.*;

public class Told implements DoAction {
    public String doSmth(){
        return "объяснила";
    }
    public String PersonName(){
        return String.valueOf(ForWhom.FrekenBok);
    }
}
