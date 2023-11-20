package Actions;

import Base.*;

public class Understood implements DoAction {
    public String doSmth(){
        return "понимал, что должен предостеречь";
    }
    public String PersonName(){
        return String.valueOf(ForWhom.Malysh);
    }
}
