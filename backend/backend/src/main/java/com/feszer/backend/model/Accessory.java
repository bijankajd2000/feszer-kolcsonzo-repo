package com.feszer.backend.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@Entity
public class Accessory extends Product{

    private BigInteger deposit;
    private BigInteger dailyRentalFee;

    public Accessory(String name, String description, BigInteger deposit, BigInteger dailyRentalFee) {
        super(name, description);
        this.deposit = deposit;
        this.dailyRentalFee = dailyRentalFee;
    }
}
