package com.none.non.openhd.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.none.non.openhd.R;
import com.none.non.openhd.settings.SettingModel;

import java.util.ArrayList;

public class SettingsRecyclerAdapter extends RecyclerView.Adapter<SettingsRecyclerAdapter.ViewHolder> {

    private static final String TAG = "SettingsRecyclerAdapter";

    private ArrayList<SettingModel> mSettings;
    private OnSettingListener onSettingListener;

    public SettingsRecyclerAdapter(ArrayList<SettingModel> mSettings, OnSettingListener onSettingListener) {
        this.mSettings = mSettings;
        this.onSettingListener = onSettingListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_setting_list_item, parent, false);
        return new ViewHolder(view, onSettingListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        try{
            holder.setting.setText(mSettings.get(position).getData());
            holder.title.setText(mSettings.get(position).getName());
        }catch (NullPointerException e){
            Log.e(TAG, "onBindViewHolder: Null Pointer: " + e.getMessage() );
        }
    }

    @Override
    public int getItemCount() {
        return mSettings.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView setting, title;
        OnSettingListener mOnSettingListener;

        public ViewHolder(View itemView, OnSettingListener onSetingListener) {
            super(itemView);
            setting = itemView.findViewById(R.id.setting_value);
            title = itemView.findViewById(R.id.setting_title);
            mOnSettingListener = onSetingListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Log.d(TAG, "onClick: " + getAdapterPosition());
            mOnSettingListener.onSettingClick(getAdapterPosition());
        }
    }

    public interface OnSettingListener {
        void onSettingClick(int position);
    }
}
















