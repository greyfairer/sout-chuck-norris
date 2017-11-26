package com.github.geowarin;

import com.google.common.collect.Lists;

import java.util.List;

public class CNJokeResult {
    private String type;
    private Joke value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Joke getValue() {
        return value;
    }

    public void setValue(Joke value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.getJoke();
    }
}
