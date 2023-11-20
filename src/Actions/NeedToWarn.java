package Actions;

import Base.*;

public class NeedToWarn implements DoAction {
    public String doSmth(){
        return "должен предостеречь";
    }
    public String PersonName(){
        return String.valueOf(ForWhom.Malysh);
    }
}
