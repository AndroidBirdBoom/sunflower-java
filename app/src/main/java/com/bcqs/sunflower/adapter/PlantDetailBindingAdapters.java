package com.bcqs.sunflower.adapter;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.bcqs.sunflower.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.core.text.HtmlCompat;
import androidx.databinding.BindingAdapter;

public class PlantDetailBindingAdapters {

    @BindingAdapter("imageFromUrl")
    public void bindImageFromUrl(ImageView view, String imageUrl) {
        if (!TextUtils.isEmpty(imageUrl)) {
            Glide.with(view.getContext())
                    .load(imageUrl)
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .into(view);
        }
    }


    @BindingAdapter("isFabGone")
    public void bindIsFabGone(FloatingActionButton view, Boolean isGone) {
        if (isGone == null || isGone) {
            view.hide();
        } else {
            view.show();
        }
    }

    @SuppressLint("WrongConstant")
    @BindingAdapter("renderHtml")
    public void bindRenderHtml(TextView view, String description) {
        if (description != null) {
            view.setText(HtmlCompat.fromHtml(description, Html.FROM_HTML_MODE_COMPACT));
            view.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            view.setText("");
        }
    }

    @BindingAdapter("wateringText")
    public void bindWateringText(TextView textView, int wateringInterval) {
        Resources resources = textView.getContext().getResources();
        String quantityString = resources.getQuantityString(
                R.plurals.watering_needs_suffix,
                wateringInterval,
                wateringInterval
        );

        textView.setText(quantityString);
    }

}
