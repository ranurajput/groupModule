package com.knoldus.group.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
@Entity
public class GroupModel {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column (name = "name")
    @NotNull
    @NotEmpty (message = "Name cannot be empty")
    @Size (min = 3, max = 20, message = "Name should have at least 3 characters and a maximum of 20 characters")
    private String name;

    @Column(name = "createdDate")
    @NotNull
    private Date createdDate;

    @Column(name = "Active")
    @NotNull
    private boolean active;

    @Column(name = "UpdatedDate")
    private Date UpdatedDate;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getUpdatedDate() {
        return UpdatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        UpdatedDate = updatedDate;
    }
}
