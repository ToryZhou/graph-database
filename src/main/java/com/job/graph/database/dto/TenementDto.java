package com.job.graph.database.dto;


/**
 * @author : toryzhou
 * @date: 9/17/18 19:18
 */
public class TenementDto {


    private String address;
    private String owner;
    private Integer price;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
