package com.example.lenovo.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lenovo on 10/24/2016.
 */

public class RA extends RecyclerView.Adapter<RA.VH> {
    Context context;
    List<ItemObject> itemList;

    public RA(Context context, List<ItemObject> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        holder.songTitle.setText("Song Title: " + itemList.get(position).getSongTitle());
        holder.songYear.setText("Song Year: " + itemList.get(position).getSongYear());
        holder.songAuthor.setText("Song Author: " + itemList.get(position).getSongAuthor());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

    public static class VH extends RecyclerView.ViewHolder {
        public TextView songTitle;
        public TextView songYear;
        public TextView songAuthor;

        public VH(View itemView) {
            super(itemView);

            songTitle = (TextView) itemView.findViewById(R.id.song_title);
            songYear = (TextView) itemView.findViewById(R.id.song_year);
            songAuthor = (TextView) itemView.findViewById(R.id.song_author);
        }
    }
}
