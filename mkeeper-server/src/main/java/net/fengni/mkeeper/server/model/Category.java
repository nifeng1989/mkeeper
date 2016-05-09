package net.fengni.mkeeper.server.model;

import net.fengni.jdbc.annotation.*;

/**
 * Created by fengni on 2016/5/9.
 */
@Entity
public class Category {
    @Id
    @Column
    @AutoIncrement
    private int id;
    @Column
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
