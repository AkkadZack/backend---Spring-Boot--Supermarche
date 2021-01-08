package com.javatechie.jpa.entity;



import lombok.Data;
import javax.persistence.*;


@Entity
@Table(name ="ligne_cmd")
@Data
public class Lcmd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_LIGNE")
    private Long id;

    @Column(name="QT_PRODUIT")
    private int qt;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cmd_id")
    private Cmd cmd;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="produit_id")
    private Produit produit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }

}
