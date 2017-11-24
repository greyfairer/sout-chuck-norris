package com.github.geowarin;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
class MainRunner implements CommandLineRunner {
    private ChuckNorrisFeignClient chuckNorrisFeignClient;

    private static Random random = new Random();
    private static final Logger log = Logger.getLogger(MainRunner.class);

    public MainRunner(ChuckNorrisFeignClient chuckNorrisFeignClient) {
        this.chuckNorrisFeignClient = chuckNorrisFeignClient;
    }

    @Override
    public void run(String... args) throws Exception {
        while (true) {
            log.info(chuckNorrisFeignClient.getJokes(1).toString());
            Thread.sleep(5000);
        }
    }
}
