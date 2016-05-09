package net.fengni.mkeeper.server.model;

import net.fengni.jdbc.annotation.Column;
import net.fengni.jdbc.annotation.Entity;
import net.fengni.jdbc.annotation.Id;

import java.util.Date;

/**
 * Created by fengni on 2016/5/9.
 */
@Entity
public class Record {
    @Id
    @Column
    private int id;
    @Column
    private int catigeryId;
    @Column
    private Date date;
    @Column
    private float money;
    @Column
    private int operator;
    @Column
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCatigeryId() {
        return catigeryId;
    }

    public void setCatigeryId(int catigeryId) {
        this.catigeryId = catigeryId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
