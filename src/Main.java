import Actions.*;
import Characters.*;
import Exceptions.*;

public class Main {
    public static void main(String[] args) throws IncorrectPerson {
        try {
            Carlson carlson = new Carlson();
            FrekenBok frekenbok = new FrekenBok();
            Malysh malysh = new Malysh();
            Bosse bosse = new Bosse();

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
            WannaTold wannaTold = new WannaTold();
            //Bosse actions
            Laugh laugh = new Laugh();

            System.out.println(frekenbok.doAction(lwChilds, ""));
            System.out.println(frekenbok.doAction(lPeople, "с телевидения, и что кто-нибудь пронюхает про " + carlson.getName()));
            System.out.println(frekenbok.doAction(Tld, ""));


            System.out.println(malysh.doAction(ntWarn, carlson.getName()));
            System.out.println(malysh.doAction(Underst, ""));
            System.out.println(malysh.doAction(wAlarmed, ""));

            System.out.println(bosse.doAction(laugh, ""));



//            System.out.println(frekenbok.doAction(Underst, ""));
//            System.out.println(malysh.doAction(wAlarmed, null));

            carlson.fly();
            System.out.print(frekenbok.Gender());

        } catch (IncorrectPerson e) {
            System.out.println(e);
        }

    }
}
