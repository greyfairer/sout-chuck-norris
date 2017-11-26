package com.github.geowarin;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class JokeController {

    @RequestMapping("random/{num}")
    JokeResponse getJokes(@PathVariable("num") int num){
        JokeResponse jokeResponse = new JokeResponse();
        jokeResponse.setType("success");
        Joke value = new Joke();
        value.setId(num);
        value.setJoke("Muahahaha!");
        jokeResponse.setValue(Arrays.asList(value));
        return jokeResponse;
    }
}
