package com.demo.dogwalker.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class DogWalker {

    @Id @GeneratedValue
    Long id;
    
    String name;


    @ElementCollection
    List<Address> addresses;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @OneToMany
    List<Schedule> schedules;


    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    DogWalkerStatus status;

    public DogWalkerStatus getStatus() {
        return status;
    }

    public void setStatus(DogWalkerStatus status) {
        this.status = status;
    }

    
}
