package com.example.echomachine.example.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.echomachine.example.R;

import java.util.List;

public class MiniPhotoAdapter extends RecyclerView.Adapter<MiniPhotoAdapter.MiniViewHolder> {

    private List<Integer> mPerson;
    private Context mContext;

    public MiniPhotoAdapter(List<Integer> person, Context context) {
        mPerson = person;
        mContext = context;
    }

    @Override
    public MiniViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.nav_image_view, parent, false);
        return new MiniViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MiniViewHolder holder, int position) {
        holder.mImageView.setImageResource(R.drawable.ic_mini_image);
    }

    @Override
    public int getItemCount() {
        return mPerson.size();
    }

    public class MiniViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImageView;

        public MiniViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.nav_mini_image_view);
        }
    }
}
