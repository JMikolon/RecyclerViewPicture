package com.example.miko.recyclerviewpicture.views;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.miko.recyclerviewpicture.R;
import com.example.miko.recyclerviewpicture.entities.Arzt;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by miko on 11.05.2017.
 */

public class BodyViewHolder extends RecyclerView.ViewHolder{

    @BindView(R.id.list_arzt_item_progressBar)
    ProgressBar mProgressBar;

    @BindView(R.id.list_arzt_item_imageView)
    ImageView mArztImage;

    @BindView(R.id.list_arzt_item_textView)
    TextView mArztName;


    public BodyViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
    public void populate(Context context, Arzt Aerzte){
        itemView.setTag(Aerzte);
        mArztName.setTag(Aerzte.getArztName());
        Picasso.with(context)
                .load(Aerzte.getArztPicture())
                .into(mArztImage, new Callback() {
                    @Override
                    public void onSuccess() {
                        mProgressBar.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError() {

                    }
                });
    }
}

