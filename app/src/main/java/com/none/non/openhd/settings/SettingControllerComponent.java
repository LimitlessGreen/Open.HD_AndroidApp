package com.none.non.openhd.settings;

import com.none.non.openhd.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component
public interface SettingControllerComponent {
    SettingController getSettingControler();

    void inject(MainActivity mainActivity);


}
