package com.bcqs.sunflower.data;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

@Dao
public interface GardenPlantingDao {

    @Query("SELECT * FROM garden_plantings")
    List<GardenPlanting> getGardenPlantings();

    @Query("SELECT EXISTS(SELECT 1 FROM garden_plantings WHERE plant_id = :plantId LIMIT 1)")
    Boolean isPlanted(String plantId);

    @Transaction
    @Query("SELECT * FROM plants WHERE id IN (SELECT DISTINCT(plant_id) FROM garden_plantings)")
    List<PlantAndGardenPlantings> getPlantedGardens();

    @Insert
    Long insertGardenPlanting(GardenPlanting gardenPlanting);

    @Delete
    void deleteGardenPlanting(GardenPlanting gardenPlanting);
}
