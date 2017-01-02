package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by localadmin on 02/01/17.
 */
public class Portfolio {
    private String name;

    public Portfolio(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    List<Stock> stocks = new ArrayList<Stock>();

    public void addStock(Stock s1) {
        stocks.add(s1);
    }
    public List<Stock> getStockList(){
        return stocks;
    }

}
