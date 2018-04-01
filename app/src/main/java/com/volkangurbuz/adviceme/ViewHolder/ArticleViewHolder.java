package com.volkangurbuz.adviceme.ViewHolder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.volkangurbuz.adviceme.Interface.ItemClickListener;
import com.volkangurbuz.adviceme.R;

/**
 * Created by VolkanGurbuz on 3/4/2018.
 */

public class ArticleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView title;
    public ImageView thumbnail;
    ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public ArticleViewHolder(View view) {
        super(view);
        title = view.findViewById(R.id.articleName);
        thumbnail = view.findViewById(R.id.articleImage);
        itemView.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition());

    }
}
