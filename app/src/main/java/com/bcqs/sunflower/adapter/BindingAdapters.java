package com.bcqs.sunflower.adapter;

import android.view.View;

import androidx.databinding.BindingAdapter;

public class BindingAdapters {

    @BindingAdapter("isGone")
    public void bindIsGone(View view,Boolean isGone){
        view.setVisibility(isGone?View.GONE:View.VISIBLE);
    }
}
