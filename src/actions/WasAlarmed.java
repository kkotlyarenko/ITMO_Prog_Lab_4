package actions;

import base.*;

public class WasAlarmed implements DoAction {
    public String doSmth(){
        return "был очень встревожен";
    }
    public String PersonName(){
        return String.valueOf(ForWhom.Malysh);
    }
}
