package com.bcqs.sunflower.data;

import android.graphics.Paint;

import java.util.ArrayList;
import java.util.List;

import androidx.room.Embedded;
import androidx.room.Relation;

public class PlantAndGardenPlantings {

    @Embedded
    private Paint paint;

    @Relation(parentColumn = "id",entityColumn = "plant_id")
    private List<GardenPlanting> gardenPlantings = new ArrayList<>();

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public List<GardenPlanting> getGardenPlantings() {
        return gardenPlantings;
    }

    public void setGardenPlantings(List<GardenPlanting> gardenPlantings) {
        this.gardenPlantings = gardenPlantings;
    }
}
