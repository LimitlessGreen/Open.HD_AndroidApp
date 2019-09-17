package com.none.non.openhd.settings;

import lombok.Getter;
import lombok.Setter;

public class SettingModel {

    @Getter private String name;
    @Getter private String group = "No group";

    @Getter @Setter private String data = "Not set";
    @Getter @Setter private SettingType settingType = SettingType.NUMBER; // number default

    private String datab;
    private int isChanged;
    private int airAck;
    private int groundAck;

    public SettingModel(String name, int isChanged, int airAck, int groundAck) {
        this.name = name;
        this.isChanged = isChanged;
        this.airAck = airAck;
        this.groundAck = groundAck;
    }

    /* A default, because most of the settings using this pattern */
    public SettingModel(String name) {
        this.name = name;
        this.isChanged = -1;
        this.airAck = 0;
        this.groundAck = 0;
    }

    //? some copied original code
    public void addData(String data, int isChanged) {
        if(!data.equals(datab)) {
            this.isChanged += isChanged;
        }
    }
}
