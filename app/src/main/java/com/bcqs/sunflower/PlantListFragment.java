package com.bcqs.sunflower;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bcqs.sunflower.databinding.FragmentPlantListBinding;
import com.bcqs.sunflower.viewmodels.PlantListViewModel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

public class PlantListFragment extends Fragment {

    private PlantListViewModel plantListViewModel;
    private FragmentPlantListBinding fragmentPlantListBinding;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentPlantListBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_plant_list,container,false);
        return fragmentPlantListBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
