package com.none.non.openhd.settings;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * The settings repository, containing all the data
 */

@Singleton
class SettingRepository {
    private ArrayList<SettingModel> settings = new ArrayList<>();

    /**
     * empty constructor, with annotation for dependency injection
     */
    @Inject
    SettingRepository(){ }

    /**
     * Add a new setting
     * @param setting for adding a new setting
     */
    void addSetting(SettingModel setting) {
        this.settings.add(setting);
    }

    /**
     * @return a reference of the settings
     */
    ArrayList<SettingModel> get() {
        return this.settings;
    }

    /**
     * return a setting by searching for the name TODO: only one setting with the same name
     */
    SettingModel get(String settingName) {
        for(SettingModel settingModel : this.settings) {
            if(settingModel.getName().equals(settingName)) {
                return settingModel;
            }
        }
        return null;
    }

    /**
     * replace an old setting by an new one
     */
    void modify(SettingModel oldSetting, SettingModel newSetting) {
        this.settings.set(settings.indexOf(oldSetting), newSetting);
    }

    /**
     * delete setting, TODO: checking
     */
    void remove(SettingModel setting) {
        this.settings.remove(setting);
    }
}
