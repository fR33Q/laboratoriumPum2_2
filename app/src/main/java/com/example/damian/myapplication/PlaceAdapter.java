package com.example.damian.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Damian on 18.12.2017.
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder>{

    private ArrayList<Place> miejsca = new ArrayList<>();
    PlaceAdapter(ArrayList<Place> miejsca, OnClickPlace listener) {
        this.miejsca = miejsca;
        this.listener = listener; }
    private OnClickPlace listener;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null);
        return new ViewHolder(itemLayoutView, listener);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.MiastoItem(miejsca.get(position).getPlaceName());
        holder.InfoItem(miejsca.get(position).getInformation() + "");

    }

    @Override
    public int getItemCount() { return miejsca.size(); }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        @BindView(R.id.wybrane_miasto)
        TextView miasto_Item;

        @BindView(R.id.informacje)
        TextView info_Item;

        private OnClickPlace listener;

        public ViewHolder(View itemView, OnClickPlace listener) {
        super(itemView);
        ButterKnife.bind(this,itemView);
        this.listener = listener;
        itemView.setOnClickListener(this);
    }
        private void MiastoItem(String miasto) {
            miasto_Item.setText(miasto);
        }

        private void InfoItem(String info) {
            info_Item.setText(info);
        }

        @Override
        public void onClick(View view) {
            listener.onClickPlace(view, getAdapterPosition());


        }
    }







}



