package com.github.geowarin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ChuckNorris", url = "${service.jokes.url}")
public interface ChuckNorrisFeignClient {
    @RequestMapping("random/${num}")
    JokeResponse getJokes(@PathVariable("num") int num);
}
