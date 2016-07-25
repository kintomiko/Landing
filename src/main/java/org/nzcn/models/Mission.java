package org.nzcn.models;

import java.math.BigDecimal;
import java.util.List;
import org.kin.common.model.Entity;

/**
 * Created by kindai on 9/07/16.
 */
public class Mission extends Entity{

    User user;
    String name;
    BigDecimal price;
    BigDecimal effort;
    boolean needCar;
    String desc;
    POI poi;
    List<String> picUrls;

    public List<String> getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(List<String> picUrls) {
        this.picUrls = picUrls;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getEffort() {
        return effort;
    }

    public void setEffort(BigDecimal effort) {
        this.effort = effort;
    }

    public boolean isNeedCar() {
        return needCar;
    }

    public void setNeedCar(boolean needCar) {
        this.needCar = needCar;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public POI getPoi() {
        return poi;
    }

    public void setPoi(POI poi) {
        this.poi = poi;
    }
}
