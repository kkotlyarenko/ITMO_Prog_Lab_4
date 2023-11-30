package Exceptions;
// this is checked error
public class EmptyAction extends RuntimeException{
    public EmptyAction(String msg){
        super(msg);
    }
}
