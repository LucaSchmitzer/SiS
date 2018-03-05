package com.kaufland.sis.persistence.school.subject;

import com.kaufland.sis.persistence.school.subject.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subjects {


   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

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
