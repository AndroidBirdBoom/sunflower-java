package com.bcqs.sunflower;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bcqs.sunflower.adapter.SunflowerPagerAdapter;
import com.bcqs.sunflower.databinding.FragmentViewPagerBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class HomeViewPagerFragment extends Fragment {


    private FragmentViewPagerBinding fragmentViewPagerBinding;
    private ViewPager2 vp;
    private TabLayout tab;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentViewPagerBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_view_pager, container, false);
        ((AppCompatActivity)getActivity()).setSupportActionBar(fragmentViewPagerBinding.toolbar);
        return fragmentViewPagerBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragmentViewPagerBinding.viewPager.setAdapter(new SunflowerPagerAdapter(getActivity()));
        new TabLayoutMediator(fragmentViewPagerBinding.tabs, fragmentViewPagerBinding.viewPager, (tab1, position) -> {
            tab1.setIcon(getTabIcon(position));
            tab1.setText(getTabTitle(position));
        }).attach();
    }

    private int getTabIcon(int position){
        if (position == 0){
            return R.drawable.garden_tab_selector;
        }else if (position == 1){
            return R.drawable.plant_list_tab_selector;
        }
        return -1;
    }

    private String getTabTitle(int position){
        if (position == 0){
            return getString(R.string.my_garden_title);
        }else if (position == 1){
            return getString(R.string.plant_list_title);
        }
        return null;
    }
}