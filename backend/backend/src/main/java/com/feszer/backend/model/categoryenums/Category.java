package com.feszer.backend.model.categoryenums;

public enum Category {
    CONSTRUCTION_MACHINERY("Építőipari gépek"),
    RENTAL_TOOLS("Bér-szerszámok"),
    HOUSEHOLD_APPLIANCES("Háztartási gépek"),
    GARDEN_AND_FORESTRY_EQUIPMENT("Kerti és Erdészeti gépek"),
    CONSTRUCTION_AND_HOUSEHOLD_MACHINERY("Építőipari és Háztartási gépek"),
    GARDEN_FORESTRY_AND_CONSTRUCTION_MACHINERY("Kerti, Erdészeti és Építőipari gépek"),
    MEASUREMENT_TECHNOLOGY("Méréstechnika");

    private final String hungarianValue;

    Category(String hungarianValue) {
        this.hungarianValue = hungarianValue;
    }

    public String getHungarianValue() {
        return hungarianValue;
    }
}
