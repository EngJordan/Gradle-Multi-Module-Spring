package game.multimodulos;

import game.multimodulos.contract.UserInterface;
//import game.multimodulos.exception.DataNotFoundException;
import game.multimodulos.model.Starship;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserInterface {

    @Override
    public Object getStarships(){
        return Starship.builder()
                .length("4000")
                .manufacturer("produtor de teste")
                .model("sla")
                .name("estrela da morte")
                .id((long) 12314)
                .pilots("testando")
                .starship_class("classe bem loca")
                .build();
    }
}
