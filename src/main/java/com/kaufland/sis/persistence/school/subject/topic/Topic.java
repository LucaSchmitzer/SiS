package com.kaufland.sis.persistence.school.subject.topic;

public class Topic {

    private String header;

    private String content;

    public Topic(String header, String content) {
        this.header = header;
        this.content = content;
    }

    public Topic() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}
