package Actions;

import Base.*;

public class Left implements DoAction {
    public String doSmth(){
        return "ушёл";
    }
    public String PersonName(){
        return String.valueOf(ForWhom.Malysh);
    }
}
