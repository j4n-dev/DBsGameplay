package net.dbsgameplay.core.database;

import net.dbsgameplay.core.database.entities.TestEntity;

public class DbManagement {

    public TestEntity getTestEntity() {
        return new TestEntity();
    }

    public String getDbName() {
        return "blockbreaker";
    }
}
