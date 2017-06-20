package com.swiftbeard.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by edmac on 6/20/17.
 */

@Entity
public class Note {

    @Id
    private long id;

    private String body;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
