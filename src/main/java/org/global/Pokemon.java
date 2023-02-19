package org.global;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Pokemon extends PanacheEntity {

    @Column(name = "name")
    public String name;

    @Column(name = "type")
    public String type;

    @Column(name = "typeColour")
    public String typeColour;

    @Column(name = "height")
    public String height;

    @Column(name = "weight")
    public String weight;

    @Column(name = "attack")
    public String attack;
}