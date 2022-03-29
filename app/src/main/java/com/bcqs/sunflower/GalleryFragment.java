package com.bcqs.sunflower;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bcqs.sunflower.databinding.FragmentGalleryBinding;


public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding fragmentGalleryBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gallery, container, false);
    }
}