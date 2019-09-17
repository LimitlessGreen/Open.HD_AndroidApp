package com.none.non.openhd.settings;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class SettingManager {

    private SettingRepository settingRepository;

    @Inject
    SettingManager(SettingRepository settingRepository) {
        this.settingRepository = settingRepository;
    }

    /**
     * initializer with pre defined data set
     */
    public void initialize() {
        this.add(SettingInitializer.initialize());
    }

    public void add(SettingModel settingModel) {
        settingRepository.addSetting(settingModel);
    }

    /**
     * just an other overloaded add function for lists
     */
    public void add(List<SettingModel> list) {
        for (SettingModel entry : list) {
            this.add(entry);
        }
    }

    public SettingModel getSetting(String settingName) {
        return settingRepository.get(settingName);
    }

    public ArrayList<SettingModel> getAllSettings() {
        return settingRepository.get();
    }

    public void modifySetting(SettingModel oldSetting, SettingModel newSetting) {
        settingRepository.modify(oldSetting, newSetting);
    }

    public void remove(SettingModel setting) {
        settingRepository.remove(setting);
    }

}
