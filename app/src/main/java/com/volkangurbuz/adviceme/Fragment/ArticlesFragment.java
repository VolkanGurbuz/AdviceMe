package com.volkangurbuz.adviceme.Fragment;


import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.volkangurbuz.adviceme.Adapter.ArticlesAdapter;
import com.volkangurbuz.adviceme.ArticleDetails;
import com.volkangurbuz.adviceme.Interface.ItemClickListener;
import com.volkangurbuz.adviceme.Model.Article;
import com.volkangurbuz.adviceme.R;
import com.volkangurbuz.adviceme.ViewHolder.ArticleViewHolder;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ArticlesFragment extends Fragment implements View.OnClickListener{


    private RecyclerView recyclerView;
    private static ArticlesFragment INSTANCE = null;
    private ArticlesAdapter adapter;
    private List<Article> articleList;
    private ArticleViewHolder articleViewHolder;
    View v;
    private ImageView imageView;

    public ArticlesFragment() {
        // Required empty public constructor


    }

    public static ArticlesFragment getINSTANCE() {
        if (INSTANCE == null)
            INSTANCE = new ArticlesFragment();

        return INSTANCE;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        articleList = new ArrayList<>();
        prepareList();



        v = inflater.inflate(R.layout.fragment_articles, container, false);



        recyclerView = v.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapter = new ArticlesAdapter(getActivity(), articleList, new ItemClickListener() {
            @Override
            public void onClick(View v, int position) {

              //  Toast.makeText(getContext(), articleList.get(position).getTitle(), Toast.LENGTH_SHORT).show();

                startActivity(new Intent(getContext(), ArticleDetails.class));

            }
        });

        recyclerView.setAdapter(adapter);

        return v;
    }

    public void prepareList() {

        Article a = new Article(1, "deneme", "deneme yazilari", R.drawable.deneme);
        Article a2 = new Article(2, "asesdf", "deneme yazilari", R.drawable.deneme);
        Article a3 = new Article(4, "dsff", "deneme yazilari", R.drawable.deneme);
        Article a4 = new Article(5, "fdsgdfg", "deneme yazilari", R.drawable.deneme);
        Article a5 = new Article(6, "fdgdfg", "deneme yazilari", R.drawable.deneme);
        Article a6 = new Article(7, "df;fd", "deneme yazilari", R.drawable.deneme);
        Article a7 = new Article(3, "ds;lfksd", "deneme yazilari", R.drawable.deneme);

        articleList.add(a);
        articleList.add(a2);
        articleList.add(a3);
        articleList.add(a4);
        articleList.add(a5);
        articleList.add(a6);
        articleList.add(a7);

    }


    @Override
    public void onClick(View v) {

    }
}
