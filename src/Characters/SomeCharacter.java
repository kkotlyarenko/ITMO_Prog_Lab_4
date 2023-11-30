package Characters;

import Base.DoAction;
import Exceptions.EmptyAction;
import Exceptions.IncorrectPerson;

import java.util.Objects;

abstract class SomeCharacter {
    protected String Name;
    public SomeCharacter(String name) {
        Name = name;
    }

    public void setName(String dname) {
        Name = dname;
    }

    public String getName() {
        return Name;
    }

    public String doAction(DoAction a, String what) throws IncorrectPerson, EmptyAction {
        if (what != null) {
            String s = a.doSmth();
            boolean is_person_correct = (a.PersonName().toString().equals(getClass().getSimpleName().toString())) ? true : false;
            if (is_person_correct)
                return(this.Name + " " + s + " " + what);
            else
                throw new IncorrectPerson("You are trying to use " + a.PersonName().toString() + " action for " + getClass().getSimpleName().toString());
        }

        throw new EmptyAction("Incorrect structure do doAction method, use \"\" except null");
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeCharacter that = (SomeCharacter) o;
        return Objects.equals(Name, that.Name);
    }

    abstract String Gender();

    public String toString() {
        return "AnonymEntity{" +
                "Name='" + Name + '\'' +
                '}';
    }


    public int hashCode() {
        return Objects.hash(Name);
    }
}
