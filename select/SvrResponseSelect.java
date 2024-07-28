package com.hnq40.firebaseexam1.demo5.select;

import com.hnq40.firebaseexam1.demo5.SanPham;

public class SvrResponseSelect {//get
    private SanPham[] products;
    private String message;

    public SanPham[] getProducts() {
        return products;
    }

    public String getMessage() {
        return message;
    }
}
