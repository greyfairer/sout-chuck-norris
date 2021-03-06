package com.github.geowarin;

import com.google.common.collect.Lists;

import java.util.List;

public class JokeResponse {
    private String type;
    private List<Joke> value = Lists.newArrayList();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Joke> getValue() {
        return value;
    }

    public void setValue(List<Joke> value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.isEmpty() ? "" : value.get(0).getJoke();
    }
}
