package com.micro.moviecatelogservice.model;

public class CatalogItem {

    private String name;
    private String desc;
    private int ratinf;

    public CatalogItem(String name, String desc, int ratinf) {
        this.name = name;
        this.desc = desc;
        this.ratinf = ratinf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getRatinf() {
        return ratinf;
    }

    public void setRatinf(int ratinf) {
        this.ratinf = ratinf;
    }
}
