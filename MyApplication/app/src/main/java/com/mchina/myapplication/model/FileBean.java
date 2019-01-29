package com.mchina.myapplication.model;

public class FileBean {

    private int id;
    private String path;

    public FileBean() {
    }

    public FileBean(int id, String path) {
        this.id = id;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "FileBean{" +
                "id=" + id +
                ", path='" + path + '\'' +
                '}';
    }
}
