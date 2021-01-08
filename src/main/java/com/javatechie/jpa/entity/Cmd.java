package com.javatechie.jpa.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.intellij.lang.annotations.Pattern;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="cmd")
@Data
public class Cmd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_CMD")
    private Long id;

    @Column(name="DATE_CMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name="DATE_LIVRAISON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date_livraison;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;


/*
    @Column(name="DATE_LIVRAISON")
    @OneToMany
    @JoinColumn(name="Lcmd_id",nullable = false)
    private Set<Lcmd> lcmds;*/


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate_livraison() {
        return date_livraison;
    }

    public void setDate_livraison(Date date_livraison) {
        this.date_livraison = date_livraison;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Column(name="ETAT")
    private String etat;


}
