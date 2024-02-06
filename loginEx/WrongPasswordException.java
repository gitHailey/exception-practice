package ch9.loginEx;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){
    }
    public WrongPasswordException(String message){
        super(message);
    }
}
