package com.none.non.openhd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.none.non.openhd.settings.DaggerSettingControllerComponent;
import com.none.non.openhd.settings.SettingController;
import com.none.non.openhd.settings.SettingControllerComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity
{

    private static final String TAG = "(Main) SettingsListActivity";

    @Inject
    SettingController settingController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* Dependency Injection stuff */
        SettingControllerComponent component = DaggerSettingControllerComponent.create();
        component.inject(this);
        settingController.onCreate(this);
    }


}










