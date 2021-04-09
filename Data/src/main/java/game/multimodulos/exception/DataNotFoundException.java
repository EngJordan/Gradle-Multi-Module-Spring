package game.multimodulos.exception;

import org.springframework.stereotype.Component;

@Component
public class DataNotFoundException extends RuntimeException{
    private static final long serialVersionUID = -3891534644498426670L;
    public DataNotFoundException(String accountId)
    {
        super("No such account with id: " + accountId);
    }
}
