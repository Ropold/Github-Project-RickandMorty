package ropold.githubprojectrickandmorty;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CharacterController {

    //private final RickAndMortyCharacterService rickAndMortyCharacterService;

    @GetMapping("/characters")
    public String getAllCharacters(){
        return "hello world";
        //return rickAndMortyCharacterService.getCharacters();
    }
}
