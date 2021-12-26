package com.example.splashscreen.ui.main;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_user")
public class Sqlit  {

    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String name;
    private int number;


    public Long getId(Long id) {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
