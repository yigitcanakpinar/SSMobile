package com.yigitcanakpinar.saatvesaatmobile;

import java.io.Serializable;

public class ExampleData implements Serializable
{

    private String name;
    private String desc;
    private String stock;
    private String price;



    public ExampleData(){
        super();
    }

    public ExampleData(String name,String desc,String stock,String price){
        super();
        this.name = name;
        this.desc = desc;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
