package com.example.layeredarchitecture.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PlacedOrdersDTO {
    private LocalDate date;
    private String id;
    private String name;
    private String oid;
    private String itemCode;
    private int qty;
    private BigDecimal uniPrice;

    public PlacedOrdersDTO() {
    }

    public PlacedOrdersDTO(LocalDate date, String id, String name, String oid, String itemCode, int qty, BigDecimal uniPrice) {
        this.date = date;
        this.id = id;
        this.name = name;
        this.oid = oid;
        this.itemCode = itemCode;
        this.qty = qty;
        this.uniPrice = uniPrice;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getUniPrice() {
        return uniPrice;
    }

    public void setUniPrice(BigDecimal uniPrice) {
        this.uniPrice = uniPrice;
    }

    @Override
    public String toString() {
        return "PlacedOrdersDTO{" +
                "date=" + date +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", oid='" + oid + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", qty=" + qty +
                ", uniPrice=" + uniPrice +
                '}';
    }
}
