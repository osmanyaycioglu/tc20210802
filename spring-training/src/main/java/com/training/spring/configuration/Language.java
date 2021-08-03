package com.training.spring.configuration;


public class Language {

    private String name;
    private String desc;
    private int    index;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(final String descParam) {
        this.desc = descParam;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(final int indexParam) {
        this.index = indexParam;
    }

    @Override
    public String toString() {
        return "Language [name=" + this.name + ", desc=" + this.desc + ", index=" + this.index + "]";
    }


}
