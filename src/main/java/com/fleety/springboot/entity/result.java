package com.fleety.springboot.entity;

public class result {

    private final long id;
    private final String content;

    public result(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
