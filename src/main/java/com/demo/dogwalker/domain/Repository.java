package com.demo.dogwalker.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<DogWalker, Long>{
    
}
