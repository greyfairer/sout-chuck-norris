package com.github.geowarin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "ChuckNorris", url = "${service.jokes.url}")
public interface ChuckNorrisFeignClient {
    @RequestMapping("random")
    JokeResponse getJoke();
}
