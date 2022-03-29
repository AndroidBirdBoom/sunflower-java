package com.bcqs.sunflower.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {GardenPlanting.class, Plant.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private final static String DATABASE_NAME = "sunflower-db";
    private final static String PLANT_DATA_FILENAME = "plants.json";

    public abstract GardenPlantingDao gardenPlantingDao();

    public abstract PlantDao plantDao();

    private static AppDatabase INSTANCE;

    public AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context, AppDatabase.class, DATABASE_NAME).build();
                }
            }
        }
        return INSTANCE;
    }
}
