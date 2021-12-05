package exceptions;

import human_kind.Human;

public class NoExistingPersonException extends Exception{
    public NoExistingPersonException(Human human){
        super(human.getName() + " does not exist");
    }
}
