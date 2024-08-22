package com.feszer.backend.model;

import com.feszer.backend.model.categoryenums.Category;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Entity
@Getter
@Setter
public class Machine extends Product{

    private BigInteger size;
    private BigInteger powerConsumption;
    private BigInteger idleSpeed;
    private BigInteger weight;
    private BigInteger eccentricStroke;
    private BigInteger strokeRate;
    private int diameter;
    private BigInteger deposit;
    private BigInteger dailyRentalFee;
    private String imageLink;
    private String usageLink;
    private Category category;
    private boolean forSale;
    private boolean forRent;

    public Machine(String name, String description, BigInteger size, BigInteger powerConsumption, BigInteger idleSpeed, BigInteger weight, BigInteger eccentricStroke, BigInteger strokeRate, int diameter, BigInteger deposit, BigInteger dailyRentalFee, String imageLink, String usageLink, Category category, boolean forSale, boolean forRent) {
        super(name, description);
        this.size = size;
        this.powerConsumption = powerConsumption;
        this.idleSpeed = idleSpeed;
        this.weight = weight;
        this.eccentricStroke = eccentricStroke;
        this.strokeRate = strokeRate;
        this.diameter = diameter;
        this.deposit = deposit;
        this.dailyRentalFee = dailyRentalFee;
        this.imageLink = imageLink;
        this.usageLink = usageLink;
        this.category = category;
        this.forSale = forSale;
        this.forRent = forRent;
    }
}
