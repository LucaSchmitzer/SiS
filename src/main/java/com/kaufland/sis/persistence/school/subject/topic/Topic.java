package com.kaufland.sis.persistence.school.subject.topic;

public class Topic {

    private String header;

    private String content;

    public Topic(String content, String header) {
        this.content = content;
        this.header = header;
    }

    public Topic() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
