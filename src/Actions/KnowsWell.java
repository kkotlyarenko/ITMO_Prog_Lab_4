package Actions;

import Base.*;

public class KnowsWell implements DoAction {
    public String doSmth(){
        return "хорошо знает";
    }
    public String PersonName(){
        return String.valueOf(ForWhom.Malysh);
    }
}
