package com.bcqs.sunflower;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bcqs.sunflower.databinding.FragmentViewPagerBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeViewPagerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeViewPagerFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private FragmentViewPagerBinding fragmentViewPagerBinding;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeViewPagerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeViewPagerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeViewPagerFragment newInstance(String param1, String param2) {
        HomeViewPagerFragment fragment = new HomeViewPagerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentViewPagerBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_view_pager, container, false);
        return fragmentViewPagerBinding.getRoot();
    }
}