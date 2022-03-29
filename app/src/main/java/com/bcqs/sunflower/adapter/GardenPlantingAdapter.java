package com.bcqs.sunflower.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bcqs.sunflower.R;
import com.bcqs.sunflower.data.GardenPlanting;
import com.bcqs.sunflower.data.PlantAndGardenPlantings;
import com.bcqs.sunflower.databinding.ListItemGardenPlantingBinding;
import com.bcqs.sunflower.viewmodels.PlantAndGardenPlantingsViewModel;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

public class GardenPlantingAdapter extends RecyclerView.Adapter<GardenPlantingAdapter.GardenViewHolder> {

    private List<PlantAndGardenPlantings> datas;

    public void setNewDatas(List<PlantAndGardenPlantings> newDatas){
        if (datas == null){
            datas = new ArrayList<>();
        }
        datas.addAll(newDatas);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public GardenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GardenViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.list_item_garden_planting,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GardenViewHolder holder, int position) {
        holder.bind(datas.get(position));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class GardenViewHolder extends RecyclerView.ViewHolder{
        private ListItemGardenPlantingBinding binding;

        public GardenViewHolder(@NonNull ListItemGardenPlantingBinding itemView) {
            super(itemView.getRoot());
            itemView.setClickListener(view -> {
                navigateToPlant(binding.getViewModel().plantId,view);
            });
        }

        private void navigateToPlant(String plantId,View view){
            Navigation.findNavController(view).navigate(R.id.action_homeViewPagerFragment_to_plantDetailFragment);
        }


        public void bind(PlantAndGardenPlantings plantings){
            PlantAndGardenPlantingsViewModel viewModel = new PlantAndGardenPlantingsViewModel(plantings);
            binding.setViewModel(viewModel);
        }
    }
}
