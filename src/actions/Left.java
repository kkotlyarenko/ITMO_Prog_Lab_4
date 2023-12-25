package actions;

import base.*;

public class Left implements DoAction {
    public String doSmth(){
        return "ушёл";
    }
    public String PersonName(){
        return String.valueOf(ForWhom.Malysh);
    }
}
