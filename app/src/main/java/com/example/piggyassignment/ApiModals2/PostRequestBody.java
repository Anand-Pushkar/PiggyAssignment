package com.example.piggyassignment.ApiModals2;

import java.io.Serializable;

public class PostRequestBody implements Serializable {

    String search;
    int rows;
    int offset;

    public PostRequestBody(String search, int rows, int offset) {
        this.search = search;
        this.rows = rows;
        this.offset = offset;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}


