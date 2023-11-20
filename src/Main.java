import Actions.*;
import Characters.*;

public class Main {
    public static void main(String[] args){
        Carlson carlson = new Carlson();
        FrekenBok frekenbok = new FrekenBok();
        Malysh malysh = new Malysh();

        LeadPeople lPeople = new LeadPeople();
        LiveWithChilds lwChilds = new LiveWithChilds();
        Told Tld = new Told();


        NeedToWarn ntWarn = new NeedToWarn();
        Understood Underst = new Understood();
        WasAlarmed wAlarmed = new WasAlarmed();


        frekenbok.doAction(lwChilds, "");
        frekenbok.doAction(lPeople, "с телевидения, и что кто-нибудь пронюхает про " + carlson.getName());
        frekenbok.doAction(Tld, "");

        malysh.doAction(ntWarn, carlson.getName());
        malysh.doAction(Underst, "");
        malysh.doAction(wAlarmed, "");

        frekenbok.doAction(Underst, "");


        carlson.fly();
        System.out.print(frekenbok.Gender());

    }
}
