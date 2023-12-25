import actions.*;
import characters.*;
import exceptions.*;


public class Main {
    public static void main(String[] args) throws IncorrectPerson {
        try {
            Carlson carlson = new Carlson();
            FrekenBok frekenbok = new FrekenBok();
            Malysh malysh = new Malysh();
            Bosse bosse = new Bosse();
            Betan betan = new Betan();

//  local class
            class Papa extends SomeCharacter{
                private Papa(){
                    super("Папа");
                }
                @Override
                public String Gender(){
                    return "Male";
                }
            }
            final SomeCharacter papa = new Papa();

// anonymous
            final SomeCharacter ImposterCarlson = new Carlson(){
                @Override
                public String Gender(){
                    return ("Female");
                }
            };

            //FrekenBok actions
            LeadPeople lPeople = new LeadPeople();
            LiveWithChilds lwChilds = new LiveWithChilds();
            Told Tld = new Told();
            //Malysh actions
            NeedToWarn ntWarn = new NeedToWarn();
            Understood Underst = new Understood();
            WasAlarmed wAlarmed = new WasAlarmed();
            Amazed amazed = new Amazed();
            HeardForTime heardForTime= new HeardForTime();
            Left left = new Left();
            KnowsWell knowsWell = new KnowsWell();
            //Bosse actions
            Laugh laugh = new Laugh();
            //Betan actions
            DsntBrag dsntBrag = new DsntBrag();
            //Papa actions
            LeftToLondon ltLondon = new LeftToLondon();

            System.out.println(frekenbok.doAction(lwChilds, ""));
            System.out.println(frekenbok.doAction(lPeople, "с телевидения, и что кто-нибудь пронюхает про " + carlson.getName()));
            System.out.println(frekenbok.doAction(Tld, ""));


            System.out.println(malysh.doAction(ntWarn, carlson.getName()));
            System.out.println(malysh.doAction(Underst, ""));
            System.out.println(malysh.doAction(wAlarmed, ""));
            System.out.println(malysh.doAction(amazed, ""));
            System.out.println(malysh.doAction(heardForTime, ""));
            System.out.println(malysh.doAction(knowsWell, ""));

            malysh.wannaExplain.setPhrase(", какого он мнения о фрекен Бок");
            System.out.println(malysh.Speak(false));


            System.out.println(bosse.doAction(laugh, ""));

            System.out.println(betan.doAction(dsntBrag, ""));

            System.out.println(papa.doAction(ltLondon, ""));


            System.out.println(frekenbok.doAction(Underst, "")); //checked
//            System.out.println(malysh.doAction(wAlarmed, null)); //unchecked

            carlson.fly();
            System.out.println(frekenbok.Gender());
            System.out.println(ImposterCarlson.Gender());

        } catch (IncorrectPerson e) {
            System.out.println(e);
        }
    }
}
