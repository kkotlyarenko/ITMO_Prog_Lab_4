package characters;

import base.DoAction;
import exceptions.EmptyAction;
import exceptions.IncorrectPerson;

import java.util.Objects;

public abstract class SomeCharacter {
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
                throw new IncorrectPerson(this);
        }

        throw new EmptyAction();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeCharacter that = (SomeCharacter) o;
        return Objects.equals(Name, that.Name);
    }

    public abstract String Gender();

    public String toString() {
        return "AnonymEntity{" +
                "Name='" + Name + '\'' +
                '}';
    }


    public int hashCode() {
        return Objects.hash(Name);
    }
}
