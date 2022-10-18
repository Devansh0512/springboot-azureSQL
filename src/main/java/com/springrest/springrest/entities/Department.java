package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    private long id;
    private String title;
    private String code;
    public Department(long id, String title, String code) {
        super();
        this.id = id;
        this.title = title;
        this.code = code;
    }
    public Department() {
        super();
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    @Override
    public String toString() {
        return "Department [id=" + id + ", title=" + title + ", code=" + code + "]";
    }
    
}
