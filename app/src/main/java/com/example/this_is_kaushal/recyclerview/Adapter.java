package com.example.this_is_kaushal.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by this_is_kaushal on 7/19/2017.
 */

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;

    String[] items;

    public Adapter(Context context, String[] items) {

        this.context = context;

        this.items = items;

    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);

        View row = inflater.inflate(R.layout.costume_row, parent, false);

        Items items = new Items(row);

        return items;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ((Items)holder).textView.setText(items[position]);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    private class Items extends RecyclerView.ViewHolder{

        TextView textView;

        public Items(View itemView) {

            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.item);

        }
    }
}
