package com.github.geowarin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {

    @RequestMapping("joke/random")
    public JokeResponse randomJoke(){
        JokeResponse jokeResponse = new JokeResponse();
        jokeResponse.setType("success");
        Joke value = new Joke();
        value.setId(1);
        value.setJoke("Muahahaha!");
        jokeResponse.setValue(value);
        return jokeResponse;
    }
}
