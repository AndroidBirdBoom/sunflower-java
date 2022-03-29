package com.bcqs.sunflower.adapter;

import com.bcqs.sunflower.GalleryFragment;
import com.bcqs.sunflower.PlantListFragment;

import java.util.HashMap;
import java.util.Map;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SunflowerPagerAdapter extends FragmentStateAdapter {

    private Map<Integer,Fragment> tabFragmentsCreators;

    public SunflowerPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        tabFragmentsCreators = new HashMap<>();
        tabFragmentsCreators.put(0,new GalleryFragment());
        tabFragmentsCreators.put(1,new PlantListFragment());
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return tabFragmentsCreators.get(position);
    }

    @Override
    public int getItemCount() {
        return tabFragmentsCreators.size();
    }
}
