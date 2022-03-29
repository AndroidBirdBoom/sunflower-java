package com.bcqs.sunflower.viewmodels;

import com.bcqs.sunflower.BuildConfig;
import com.bcqs.sunflower.data.GardenPlantingRepository;
import com.bcqs.sunflower.data.Plant;
import com.bcqs.sunflower.data.PlantRepository;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;

public class PlantDetailViewModel extends ViewModel {

    private final static String PLANT_ID_SAVED_STATE_KEY = "plantId";


    private SavedStateHandle savedStateHandle;
    private PlantRepository plantRepository;
    private GardenPlantingRepository gardenPlantingRepository;
    private String plantId;
    public boolean isPlanted;
    public Plant plant;

    public PlantDetailViewModel(SavedStateHandle savedStateHandle, PlantRepository plantRepository, GardenPlantingRepository gardenPlantingRepository) {
        this.savedStateHandle = savedStateHandle;
        this.plantRepository = plantRepository;
        this.gardenPlantingRepository = gardenPlantingRepository;
        plantId = savedStateHandle.get(PLANT_ID_SAVED_STATE_KEY);
        isPlanted = gardenPlantingRepository.isPlanted(plantId);
        plant = plantRepository.getPlant(plantId);
    }

    public void addPlantToGarden() {
        gardenPlantingRepository.createGardenPlanting(plantId);
    }

    public boolean hasValidUnsplashKey(){
        return false;
    }

}
