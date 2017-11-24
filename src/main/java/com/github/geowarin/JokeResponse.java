package com.github.geowarin;

public class JokeResponse {
    private String type;
    private Joke[] value = new Joke[0];

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Joke[] getValue() {
        return value;
    }

    public void setValue(Joke[] value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.length == 0 ? "" : value[0].getJoke();
    }
}
