package com.dhumal.studyquizadmin;

import java.util.List;

public class CategoryModel {
    private String name;
    private List<String > Sets;
    private String url;
    String key;

    private CategoryModel(){
        //firebase
    }

    public CategoryModel(String name, List<String> sets, String url, String key) {
        this.name = name;
        Sets = sets;
        this.url = url;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSets() {
        return Sets;
    }

    public void setSets(List<String> sets) {
        Sets = sets;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
