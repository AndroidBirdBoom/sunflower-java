package com.bcqs.sunflower.data;

import java.util.List;

public class GardenPlantingRepository {
    private GardenPlantingDao gardenPlantingDao;

    public GardenPlantingRepository(GardenPlantingDao gardenPlantingDao) {
        this.gardenPlantingDao = gardenPlantingDao;
    }

    public void createGardenPlanting(String plantId){
        GardenPlanting gardenPlanting = new GardenPlanting(plantId);
        gardenPlantingDao.insertGardenPlanting(gardenPlanting);
    }

    public void removeGardenPlanting(GardenPlanting gardenPlanting){
        gardenPlantingDao.deleteGardenPlanting(gardenPlanting);
    }

    public boolean isPlanted(String plantId){
        return gardenPlantingDao.isPlanted(plantId);
    }

    public List<GardenPlanting> getPlantedGardens(){
        return gardenPlantingDao.getGardenPlantings();
    }
}
