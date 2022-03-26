package com.geektech.homework351;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberViewHolder> {

    private ArrayList<Integer> data;

    public NumberAdapter(ArrayList<Integer> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NumberViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_number,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class NumberViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.tv_numbers);
        }

        public void bind(Integer number) {
            textView.setText(number.toString());
        }
    }
}
