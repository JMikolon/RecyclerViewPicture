package com.example.miko.recyclerviewpicture.views;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.miko.recyclerviewpicture.R;
import com.example.miko.recyclerviewpicture.entities.Arzt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miko on 11.05.2017.
 */

public class ArztAdapter extends Adapter {

    private final int HEADER_TYPE = 1;
    private final int BODY_TYPE = 2;

    private AppCompatActivity mActivity;
    private List<Arzt> mArzt;
    private LayoutInflater mInflater;
    private ArztListener mListener;


    public ArztAdapter(AppCompatActivity mActivity, ArztListener mListener) {
        this.mActivity = mActivity;
        this.mListener = mListener;
        mInflater = mActivity.getLayoutInflater();
        mArzt = new ArrayList<>();
    }


    public void setmArzt(List<Arzt> Aerzte) {
        mArzt.clear();
        mArzt.addAll(Aerzte);
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0){
            return HEADER_TYPE;

        }
        position --;

        if (position<mArzt.size()){
            return BODY_TYPE;

        }
        position -= mArzt.size();
            throw new IllegalArgumentException(position + "is out of bounds for this adapter");
        }



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View HeaderView = mInflater.inflate(R.layout.header_recycler_view, parent, false);
        View bodyView =mInflater.inflate(R.layout.list_arzt_item, parent, false);

        if (viewType == HEADER_TYPE) {

            return new HeaderViewHolder(HeaderView);
        }else{
            final BodyViewHolder viewHolder = new BodyViewHolder(bodyView);
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Arzt Aerzte = (Arzt)viewHolder.itemView.getTag();
                    mListener.OnArztClicked(Aerzte);
                }
            });
            return viewHolder;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public interface ArztListener{
        void OnArztClicked(Arzt Aerzte);

    }
}
