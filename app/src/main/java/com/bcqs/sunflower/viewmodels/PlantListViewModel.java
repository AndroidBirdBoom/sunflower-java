package com.bcqs.sunflower.viewmodels;

import com.bcqs.sunflower.data.Plant;
import com.bcqs.sunflower.data.PlantRepository;

import java.util.List;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;

public class PlantListViewModel extends ViewModel {

    private final static int NO_GROW_ZONE = -1;
    private final static String GROW_ZONE_SAVED_STATE_KEY = "GROW_ZONE_SAVED_STATE_KEY";

    private PlantRepository plantRepository;
    private SavedStateHandle savedStateHandle;

    public MutableLiveData<List<Plant>> plants = new MutableLiveData<>();


    public PlantListViewModel(PlantRepository plantRepository, SavedStateHandle savedStateHandle) {
        this.plantRepository = plantRepository;
        this.savedStateHandle = savedStateHandle;
        plants.setValue(plantRepository.getPlants());
    }
}
