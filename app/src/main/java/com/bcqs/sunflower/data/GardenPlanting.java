package com.bcqs.sunflower.data;

import java.util.Calendar;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "garden_plantings",
        foreignKeys = @ForeignKey(entity = Plant.class, parentColumns = "id", childColumns = "plant_id"),
        indices = @Index("plant_id"))
public class GardenPlanting {

    @ColumnInfo(name = "plant_id")
    public String plantId;
    @ColumnInfo(name = "plant_date")
    public Calendar plantDate;
    @ColumnInfo(name = "last_watering_date")
    public Calendar lastWateringDate;
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public long gardenPlantingId = 0;

    public GardenPlanting(String plantId) {
        this.plantId = plantId;
        this.plantDate = Calendar.getInstance();
        this.lastWateringDate = Calendar.getInstance();
    }


}
