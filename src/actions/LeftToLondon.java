package actions;
import base.*;
public class LeftToLondon implements DoAction{
    public String doSmth(){
        return "улетел в Лондон";
    }
    public String PersonName(){
        return String.valueOf(ForWhom.Papa);
    }
}
