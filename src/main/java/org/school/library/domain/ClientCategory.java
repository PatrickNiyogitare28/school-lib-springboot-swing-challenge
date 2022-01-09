package org.school.library.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ClientCategory {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    public ClientCategory() {
    }

    public ClientCategory(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ClientCategory(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
