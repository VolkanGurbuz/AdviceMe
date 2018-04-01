package com.volkangurbuz.adviceme.ViewHolder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.volkangurbuz.adviceme.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by VolkanGurbuz on 3/6/2018.
 */

public class ConvViewHolder extends RecyclerView.ViewHolder {

    View mView;

    public TextView doctorType;
    public TextView doctorName;
    public CircleImageView circleImageView;


    public ConvViewHolder(View itemView) {
        super(itemView);
        mView = itemView;

    }


    public void setDoctorType(String doctorType) {
        TextView doctorTypeTV = mView.findViewById(R.id.doctor_type);

        doctorTypeTV.setText(doctorType);

    }

    public void setDoctorName(String doctorName) {

        TextView doctorNameTV = mView.findViewById(R.id.doctor_name);

        doctorNameTV.setText(doctorName);

    }

    public void setCircleImageView(String thumb_image, Context ctx) {
        CircleImageView userImageView = (CircleImageView) mView.findViewById(R.id.doctor_avatar);

        Glide.with(ctx).load(thumb_image).into(userImageView);


    }
}
