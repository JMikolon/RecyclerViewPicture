package com.example.miko.recyclerviewpicture.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.R.*;

import com.example.miko.recyclerviewpicture.R;







public class HeaderViewHolder extends RecyclerView.ViewHolder{
   @BindView(R.id.header_recycler_view_editText)
   EditText mSearchBarText;



    public HeaderViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }



}
