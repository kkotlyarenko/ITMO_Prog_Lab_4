package Actions;

import Base.*;

public class LeadPeople implements DoAction {
    public String doSmth(){
        return "приведёт массу людей";
    }
    public String PersonName(){
        return String.valueOf(ForWhom.FrekenBok);
    }
}
