package com.example.lenguyenthanhvinh_listview;

public class Goods {
    private String name;
    private String gia;
    private int imageGoods;

    public Goods(String name, String gia, int imageGoods) {
        this.name = name;
        this.gia = gia;
        this.imageGoods = imageGoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getImageGoods() {
        return imageGoods;
    }

    public void setImageGoods(int imageGoods) {
        this.imageGoods = imageGoods;
    }
}
