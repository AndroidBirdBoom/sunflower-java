package com.bcqs.sunflower.data;

import java.util.Calendar;

import androidx.annotation.NonNull;

public class Plant {
    private String plantId;
    private String name;
    private String description;
    private int growZoneNumber = 7;
    private int wateringInterval;
    private String imageUrl = "";

    public Plant(String plantId, String name, String description, int growZoneNumber, int wateringInterval, String imageUrl) {
        this.plantId = plantId;
        this.name = name;
        this.description = description;
        this.growZoneNumber = growZoneNumber;
        this.wateringInterval = wateringInterval;
        this.imageUrl = imageUrl;
    }

    public boolean shouldBeWatered(Calendar since, Calendar lastWateringDate) {
        lastWateringDate.add(Calendar.DAY_OF_YEAR, wateringInterval);
        return since.compareTo(lastWateringDate) == 1;
    }

    @NonNull
    @Override
    public String toString() {
        return name;
    }
}
