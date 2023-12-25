package exceptions;

public class IncorrectPerson extends Exception{
    private final String name;
    private final String error;

    public IncorrectPerson(Object cls){
         this.name = cls.getClass().getSimpleName().toString();
         this.error = "Incorrect action for ";
    }

    @Override
    public String getMessage() {
        return error + name;
    }
}
