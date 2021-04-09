package game.multimodulos;

//import game.multimodulos.exception.DataNotFoundException;

import game.multimodulos.model.Starship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// @EnableAutoConfiguration
@RestController
@RequestMapping("/teste")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping(path = "/")
    public String home(){
        // Starship response = (Starship) userService.getStarships();
        // return ResponseEntity.ok().body(response);
        return "Hello world";
    }
}
