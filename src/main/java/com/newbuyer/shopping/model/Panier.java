package com.newbuyer.shopping.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Panier {
private final List<Article> articleList;
private final LocalDate dateOfConstruction;
private final BigDecimal totalPrize;

    public Panier(List<Article> articleList,LocalDate dateOfConstruction,BigDecimal totalPrize) {
        this.articleList = articleList;
        this.dateOfConstruction = dateOfConstruction;
        this.totalPrize = totalPrize;
    }
}
