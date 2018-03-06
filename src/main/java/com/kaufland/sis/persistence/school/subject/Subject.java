package com.kaufland.sis.persistence.school.subject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private static final String URL = "/subject/computer_science";

    private String info;

    private String name;

    private String header;

    private String content;


    public Subject() {
    }

    public Subject(String info, String name, String header, String content) {
        this.info = info;
        this.name = name;
        this.header = header;
        this.content = content;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
