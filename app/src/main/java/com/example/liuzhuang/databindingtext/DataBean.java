package com.example.liuzhuang.databindingtext;

/**
 * Created by liuzhuang on 2016/10/24.
 */

public class DataBean {

    public  DataBean(String first_name,String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;

    }
    private String first_name;
    private String last_name;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
