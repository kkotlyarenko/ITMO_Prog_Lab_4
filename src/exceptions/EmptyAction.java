package exceptions;
// this is checked error
public class EmptyAction extends RuntimeException{
    private final String error;
    public EmptyAction(){
        this.error = "Incorrect structure do doAction method, use \"\" except null";
    }
    @Override
    public String getMessage() {
        return error;
    }
}
