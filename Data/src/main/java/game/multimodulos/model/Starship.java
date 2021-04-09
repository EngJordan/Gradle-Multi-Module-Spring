package game.multimodulos.model;

import lombok.*;
import org.springframework.stereotype.Component;
//import org.springframework.data.annotation.Id;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Starship {


    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String model;
    private String manufacturer;
    private String length;
    private String starship_class;
    private String pilots;

//    {
//        "name": "Death Star",
//            "model": "DS-1 Orbital Battle Station",
//            "manufacturer": "Imperial Department of Military Research, Sienar Fleet Systems",
//            "cost_in_credits": "1000000000000",
//            "length": "120000",
//            "max_atmosphering_speed": "n/a",
//            "crew": "342,953",
//            "passengers": "843,342",
//            "cargo_capacity": "1000000000000",
//            "consumables": "3 years",
//            "hyperdrive_rating": "4.0",
//            "MGLT": "10",
//            "starship_class": "Deep Space Mobile Battlestation",
//            "pilots": [],
//        "films": [
//        "http://swapi.dev/api/films/1/"
//	],
//        "created": "2014-12-10T16:36:50.509000Z",
//            "edited": "2014-12-20T21:26:24.783000Z",
//            "url": "http://swapi.dev/api/starships/9/"
//    }
}
