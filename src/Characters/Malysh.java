package Characters;

import Base.DoAction;

public class Malysh extends SomeCharacter{

    @Override
    public String Gender() {
        return "Male";
    }

    public Malysh(){
        super("Малыш");
    }
}
