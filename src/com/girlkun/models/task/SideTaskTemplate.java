package com.girlkun.models.task;


public class SideTaskTemplate {

    public int id;
    public String name;
    public int[][] count;

    public SideTaskTemplate() {
        this.count = new int[5][2];
    }

}
