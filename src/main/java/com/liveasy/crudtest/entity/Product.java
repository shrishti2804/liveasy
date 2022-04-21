package com.liveasy.crudtest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product_name")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private String weight;
    private int shipperId;
    private Date date;
}
