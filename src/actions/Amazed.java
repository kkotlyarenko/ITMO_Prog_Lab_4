package actions;

import base.*;

public class Amazed implements DoAction {
    public String doSmth(){
        return "изумился";
    }
    public String PersonName(){
        return String.valueOf(ForWhom.Malysh);
    }
}
