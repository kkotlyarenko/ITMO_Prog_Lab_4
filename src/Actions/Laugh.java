package Actions;

import Base.*;

public class Laugh implements DoAction {
    public String doSmth(){
        return "расхохоталась";
    }
    public String PersonName(){
        return String.valueOf(ForWhom.Bosse);
    }
}
