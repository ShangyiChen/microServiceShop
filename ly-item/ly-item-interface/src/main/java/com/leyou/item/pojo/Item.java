package com.leyou.item.pojo;

/**
 * @author ShangyiChen
 * @date 2020/3/23 11:28
 **/

public class Item {
    private Integer id;
    private String name;
    private Long price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
