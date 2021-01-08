package com.javatechie.jpa.repository;

import com.javatechie.jpa.entity.Lcmd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
public interface LcmdRepository extends JpaRepository<Lcmd,Long> {
}
