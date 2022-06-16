package com.demo.dogwalker.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Schedule {

    @Id @GeneratedValue
    Long id;

    Date start;
    Date end;

    @ManyToOne
    DogWalker dogWalker;
    


    public DogWalker getDogWalker() {
        return dogWalker;
    }
    public void setDogWalker(DogWalker dogWalker) {
        this.dogWalker = dogWalker;
    }
    public Date getStart() {
        return start;
    }
    public void setStart(Date start) {
        this.start = start;
    }
    public Date getEnd() {
        return end;
    }
    public void setEnd(Date end) {
        this.end = end;
    }

    
    
}
