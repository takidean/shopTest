package com.newbuyer.shopping.model;

import java.math.BigDecimal;

public class Article {
    private final Long id;
    private final BigDecimal prize;
    private final String description;
    private final String vendor;

    public Article(Long id, BigDecimal prize, String description, String vendor) {
        this.id = id;
        this.prize = prize;
        this.description = description;
        this.vendor = vendor;
    }
}
