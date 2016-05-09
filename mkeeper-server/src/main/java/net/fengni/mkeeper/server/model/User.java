package net.fengni.mkeeper.server.model;

import net.fengni.jdbc.annotation.Column;
import net.fengni.jdbc.annotation.Entity;
import net.fengni.jdbc.annotation.Id;

/**
 * Created by fengni on 2016/5/9.
 */
@Entity
public class User {
    @Id
    @Column
    private int id;
    @Column
    private String username;
    @Column
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
