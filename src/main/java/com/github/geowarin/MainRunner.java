package com.github.geowarin;

import org.apache.log4j.Level;
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
            log.log(randomLevel(), randomMessage());
            Thread.sleep(3000);
        }
    }

    private Level randomLevel() {
        switch (random.nextInt(3)) {
            case 0:
                return Level.DEBUG;
            case 1:
                return Level.INFO;
            case 2:
                return Level.ERROR;
            default:
                return Level.INFO;
        }
    }

    private String randomMessage() {
        return chuckNorrisFeignClient.getJoke().toString();
    }
}
