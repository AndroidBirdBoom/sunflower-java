package com.bcqs.sunflower.viewmodels;

import com.bcqs.sunflower.data.GardenPlanting;
import com.bcqs.sunflower.data.Plant;
import com.bcqs.sunflower.data.PlantAndGardenPlantings;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

public class PlantAndGardenPlantingsViewModel {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy", Locale.US);
    private Plant plant;
    private GardenPlanting gardenPlanting;
    public String waterDateString;
    public int wateringInterval;
    public String imageUrl;
    public String plantName;
    public String plantDateString;
    public String plantId;

    public PlantAndGardenPlantingsViewModel(PlantAndGardenPlantings plantAndGardenPlantings) {
        this.plant = plantAndGardenPlantings.getPlant();
        gardenPlanting = plantAndGardenPlantings.getGardenPlantings().get(0);
        waterDateString = dateFormat.format(gardenPlanting.lastWateringDate.getTime());
        wateringInterval = plant.wateringInterval;
        imageUrl = plant.imageUrl;
        plantName = plant.name;
        plantDateString = dateFormat.format(gardenPlanting.plantDate.getTime());
        plantId = plant.plantId;
    }


}
