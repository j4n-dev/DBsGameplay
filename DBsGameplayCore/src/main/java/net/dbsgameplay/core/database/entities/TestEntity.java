package net.dbsgameplay.core.database.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class TestEntity {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private String description;
}
