package com.example.merks;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.merks.Model.DataItem;

import java.util.ArrayList;

public class GridBallsAdapter extends RecyclerView.Adapter<GridBallsAdapter.GridViewHolder> {
    private ArrayList<DataItem> listStudent2;
    private OnItemClickCallBack onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallBack onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallBack {
        void onItemClicked(DataItem data2);
    }

    public GridBallsAdapter(ArrayList<DataItem> list) {
        this.listStudent2 = list;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_balls, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
        DataItem data2 = listStudent2.get(position);

        // Load image using Glide
        Glide.with(holder.itemView.getContext())
                .load(data2.getLogo())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto2);

        // Set text values (e.g., team name and league)
        holder.tvName2.setText(data2.getNama());  // Set Country name



        // Handle item click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listStudent2.get(holder.getAdapterPosition()));
                Toast.makeText(holder.itemView.getContext(), "You selected " + data2.getAsal(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listStudent2.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto2;
        TextView tvName2;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto2 = itemView.findViewById(R.id.img_item_photo2);
            tvName2 = itemView.findViewById(R.id.tv_item_name2);  // TextView for team name
        }
    }
}