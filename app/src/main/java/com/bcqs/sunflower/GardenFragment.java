package com.bcqs.sunflower;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bcqs.sunflower.databinding.FragmentGardenBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

public class GardenFragment extends Fragment {

    private FragmentGardenBinding fragmentGardenBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentGardenBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_garden,container,false);
        return fragmentGardenBinding.getRoot();
    }

}
