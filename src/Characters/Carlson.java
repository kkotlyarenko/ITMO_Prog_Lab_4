package Characters;

import Base.Helicopter;

public class Carlson extends SomeCharacter implements Helicopter{
    public void fly(){
        System.out.println(this.Name + " Я полетел");
    }
    public Carlson(){
        super("Карлсон");
    }

    @Override
    public String Gender() {
        return "Male";
    }
}
