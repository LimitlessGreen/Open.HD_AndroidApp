package com.none.non.openhd.settings;

import android.app.AlertDialog;

import android.view.View;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.none.non.openhd.MainActivity;
import com.none.non.openhd.R;
import com.none.non.openhd.adapters.SettingsRecyclerAdapter;
import com.none.non.openhd.util.VerticalSpacingItemDecorator;


import javax.inject.Inject;


/**
 * SettingController, should be instantiated only once
 *
 * @author LimitlessGreen
 */

public class SettingController implements
        SettingsRecyclerAdapter.OnSettingListener,
        FloatingActionButton.OnClickListener {

    private SettingManager settingManager;

    @Inject
    SettingController(SettingManager settingManager) {
        this.settingManager = settingManager;
    }

    // ui components
    private RecyclerView mRecyclerView;

    // vars
    private SettingsRecyclerAdapter mSettingRecyclerAdapter;


    public void onCreate(MainActivity mainActivity) {

        mainActivity.setContentView(R.layout.activity_settings_list);
        mRecyclerView = mainActivity.findViewById(R.id.recyclerView);

        mainActivity.findViewById(R.id.fab).setOnClickListener(this);

        initRecyclerView(mainActivity);

        //insertFakeSettings();
        settingManager.initialize();

        //mainActivity.setSupportActionBar((Toolbar)mainActivity.findViewById(R.id.notes_toolbar));
        //mainActivity.setTitle(R.string.app_name);
    }

    private void insertFakeSettings(){
        for(int i = 0; i < 10; i++){
            SettingModel setting = new SettingModel(String.format("Test %d",i));
            setting.setData(String.format("Value %d", i));
            this.settingManager.add(setting);
        }
        mSettingRecyclerAdapter.notifyDataSetChanged();
    }

    private void initRecyclerView(MainActivity mainActivity){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mainActivity);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        VerticalSpacingItemDecorator itemDecorator = new VerticalSpacingItemDecorator(10);
        mRecyclerView.addItemDecoration(itemDecorator);

        mSettingRecyclerAdapter = new SettingsRecyclerAdapter(
                settingManager.getAllSettings(), this);

        mRecyclerView.setAdapter(mSettingRecyclerAdapter);
    }


    @Override
    public void onSettingClick(int position) {
        // Setting clicked
    }

    @Override
    public void onClick(View view) {
        // Sync button clicked
    }

    private void deleteSetting(SettingModel setting) {
        settingManager.remove(setting);
        mSettingRecyclerAdapter.notifyDataSetChanged();
    }


}
