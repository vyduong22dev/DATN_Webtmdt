package com.spring.ecomerce.entities.inner;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.ecomerce.entities.clone.ColorEntity;
import com.spring.ecomerce.entities.clone.ImageEntity;
import com.spring.ecomerce.entities.clone.ProductEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Persistent;

@Getter
@Setter
public class OrderList {
    @JsonIgnore
    private String product;
    @JsonIgnore
    private String color;

    private String name;
    private String nameColor;
    private String price;
    private ImageEntity image;
    private Integer quantity;

    @Persistent
    private ProductEntity productEntity;
    @Persistent
    private ColorEntity colorEntity;
}