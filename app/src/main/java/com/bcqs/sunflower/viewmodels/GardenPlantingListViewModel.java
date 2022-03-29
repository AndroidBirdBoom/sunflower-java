package com.bcqs.sunflower.viewmodels;

import com.bcqs.sunflower.data.GardenPlantingRepository;
import com.bcqs.sunflower.data.PlantAndGardenPlantings;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GardenPlantingListViewModel extends ViewModel {
    private GardenPlantingRepository gardenPlantingRepository;
    public MutableLiveData<List<PlantAndGardenPlantings>> plantAndGardenPlantings = new MutableLiveData<>();

    public GardenPlantingListViewModel(GardenPlantingRepository gardenPlantingRepository) {
        this.gardenPlantingRepository = gardenPlantingRepository;
        plantAndGardenPlantings.setValue(gardenPlantingRepository.getPlantedGardens());
    }


}
