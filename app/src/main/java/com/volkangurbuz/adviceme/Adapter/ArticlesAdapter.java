package com.volkangurbuz.adviceme.Adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.volkangurbuz.adviceme.Interface.ItemClickListener;
import com.volkangurbuz.adviceme.Model.Article;
import com.volkangurbuz.adviceme.R;
import com.volkangurbuz.adviceme.ViewHolder.ArticleViewHolder;

import java.util.List;

/**
 * Created by VolkanGurbuz on 3/4/2018.
 */

public class ArticlesAdapter extends RecyclerView.Adapter<ArticleViewHolder> {
    private Context mContext;
    private List<Article> articleList;
    ItemClickListener itemClickListener;


    public ArticlesAdapter(Context mContext, List<Article> articleList, ItemClickListener itemClickListener) {
        this.mContext = mContext;
        this.articleList = articleList;
        this.itemClickListener = itemClickListener;
    }

    @Override
    public ArticleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.article_row, parent, false);
        final ArticleViewHolder articleViewHolder =  new ArticleViewHolder(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onClick(v, articleViewHolder.getAdapterPosition());
            }
        });

        return articleViewHolder;
    }

    @Override
    public void onBindViewHolder(ArticleViewHolder holder, int position) {
        Article article = articleList.get(position);

        holder.title.setText(article.getTitle());

        Glide.with(mContext).load(article.getThumbnail()).into(holder.thumbnail);

    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }


}
