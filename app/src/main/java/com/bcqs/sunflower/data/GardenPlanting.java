package com.bcqs.sunflower.data;

import java.util.Calendar;

public class GardenPlanting {

    private String plantId;
    private Calendar plantDate = Calendar.getInstance();
    private Calendar lastWateringDate = Calendar.getInstance();

    private long gardenPlantingId = 0;

    public GardenPlanting(String plantId, Calendar plantDate, Calendar lastWateringDate) {
        this.plantId = plantId;
        this.plantDate = plantDate;
        this.lastWateringDate = lastWateringDate;
    }


}
