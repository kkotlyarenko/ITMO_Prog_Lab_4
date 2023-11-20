package Actions;

import Base.DoAction;
import Base.ForWhom;

public class LiveWithChilds implements DoAction {
    public String doSmth(){
        return "пожить с детьми";
    }

    public String PersonName(){
        return String.valueOf(ForWhom.FrekenBok);
    }
}
