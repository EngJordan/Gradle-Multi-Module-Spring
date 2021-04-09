package game.multimodulos.contract;

import game.multimodulos.exception.DataNotFoundException;

public interface UserInterface {

    Object getStarships() throws DataNotFoundException;

}
