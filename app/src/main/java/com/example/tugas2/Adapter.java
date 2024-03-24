package com.example.tugas2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Model> model;

    public Adapter(ArrayList<Model> model) {
        this.model = model;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.namaM.setText(model.get(position).getNamaM());
        holder.ppM.setImageResource(model.get(position).getPpM());
        holder.nimM.setText(model.get(position).getNimM());
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView namaM;
        ImageView ppM;
        TextView nimM;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaM = itemView.findViewById(R.id.nama);
            ppM = itemView.findViewById(R.id.pp);
            nimM = itemView.findViewById(R.id.nim);

        }
    }
}
