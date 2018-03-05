package com.kaufland.sis.persistence.school;

import com.kaufland.sis.persistence.school.subjects.topic.Topic;

public class Subjects {

    private String info;

    private String name;

    private Topic topic;

    public enum schoolSystem {
        HIGHSCHOOL("high school"), SECONDARYSCHOOL("secondary school"),
        ELEMENTARYSCHOOL("elementary school"), SECONDARYMODERNSCHOOL("secondary modern school");

        String name;

        schoolSystem(String name) {
            this.name = name;
        }
    }

    public Subjects() {
    }

    public Subjects(String info, String name, Topic topic) {
        this.info = info;
        this.name = name;
        this.topic = topic;
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
}
