package com.market;

public class Item {    //数据表公共类
    private String id;   //编号属性
    private String name; //名称信息

    public Item(){
        //默认构造函数
    }
    public Item(String id,String name){ //完整构造函数
        this.id = id;
        this.name = name;
    }

    // 使用Getters and Setters方法将数据表公共类的私有属性封装起来
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){    //重写toString()方法，只输出名称信息
        return getName();
    }
}
