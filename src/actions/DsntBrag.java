package actions;
import base.*;
public class DsntBrag implements DoAction{
    public String doSmth(){
        return "не хвастается";
    }
    public String PersonName(){
        return String.valueOf(ForWhom.Betan);
    }
}
