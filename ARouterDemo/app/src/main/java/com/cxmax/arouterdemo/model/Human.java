package com.cxmax.arouterdemo.model;

import java.io.Serializable;

/**
 * @desribe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 18-3-30.
 */

public class Human implements Serializable{

    public String name;
    public int id;

    public Human(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "human's name = " + name + " id = " + id;
    }
}
