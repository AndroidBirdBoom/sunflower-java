package com.bcqs.sunflower.data;

import java.util.List;

public class PlantRepository {

    private PlantDao plantDao;

    public PlantRepository(PlantDao plantDao) {
        this.plantDao = plantDao;
    }

    public List<Plant> getPlants(){
        return plantDao.getPlants();
    }

    public Plant getPlant(String plantId){
        return plantDao.getPlant(plantId);
    }

    public List<Plant> getPlantsWithGrowZoneNumber(int growZoneNumber){
        return plantDao.getPlantsWithGrowZoneNumber(growZoneNumber);
    }
}
