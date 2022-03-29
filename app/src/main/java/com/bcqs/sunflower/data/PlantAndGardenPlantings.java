package com.bcqs.sunflower.data;

import android.graphics.Paint;

import java.util.ArrayList;
import java.util.List;

import androidx.room.Embedded;
import androidx.room.Relation;

public class PlantAndGardenPlantings {

    @Embedded
    private Plant plant;

    @Relation(parentColumn = "id",entityColumn = "plant_id")
    private List<GardenPlanting> gardenPlantings = new ArrayList<>();

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public List<GardenPlanting> getGardenPlantings() {
        return gardenPlantings;
    }

    public void setGardenPlantings(List<GardenPlanting> gardenPlantings) {
        this.gardenPlantings = gardenPlantings;
    }
}
