package com.none.non.openhd.settings;

import java.util.*;

class SettingInitializer {
    static ArrayList<SettingModel> initialize() {
        return new ArrayList<>(
                Arrays.asList(
                        new SettingModel("FREQ", -1, 0, 0),
                        new SettingModel("Copter", 0, 0, 0),
                        new SettingModel("Imperial", 0, 0, 0),
                        new SettingModel("DATARATE"),
                        new SettingModel("FPS"),
                        new SettingModel("VIDEO_BLOCKS"),
                        new SettingModel("VIDEO_FECS"),
                        new SettingModel("VIDEO_BLOCKLENGTH"),
                        new SettingModel("VIDEO_BITRATE"),
                        new SettingModel("BITRATE_PERCENT"),
                        new SettingModel("WIDTH"),
                        new SettingModel("HEIGHT"),
                        new SettingModel("KEYFRAMERATE"),
                        new SettingModel("EXTRAPARAMS"),
                        new SettingModel("FREQSCAN"),
                        new SettingModel("TXMODE"),
                        new SettingModel("UPDATE_NTH_TIME"),
                        /*
                        public StringMAC_RX[0]=00c0ca91ee30
                        public StringFREQ_RX[0]=2484
                        public StringMAC_RX[1]=24050f953384
                        public StringFREQ_RX[1]=2484
                        public StringMAC_RX[2]=24050f953378
                        public StringFREQ_RX[2]=2484
                        public StringMAC_RX[3]=24050f953373
                        public StringFREQ_RX[3]=2484
                        public StringMAC_TX[0]=24050f953378
                        public StringFREQ_TX[0]=5745
                        public StringMAC_TX[1]=ec086b1c7834
                        public StringFREQ_TX[1]=2472
                        */
                        new SettingModel("TELEMETRY_TRANSMISSION"),
                        new SettingModel("TELEMETRY_UPLINK"),
                        new SettingModel("RC"),
                        new SettingModel("IsAudioTransferEnabled"),
                        new SettingModel("TxPowerAir"),
                        new SettingModel("TxPowerGround"),
                        new SettingModel("txpowerR"),

                        new SettingModel("CTS_PROTECTION"),
                        new SettingModel("FC_RC_SERIALPORT"),
                        new SettingModel("FC_RC_BAUDRATE"),
                        new SettingModel("FC_TELEMETRY_SERIALPORT"),
                        new SettingModel("FC_TELEMETRY_BAUDRATE"),
                        new SettingModel("FC_MSP_SERIALPORT"),
                        new SettingModel("FC_MSP_BAUDRATE"),
                        new SettingModel("RemoteSettingsEnabled"),

                        new SettingModel("AIRODUMP"),
                        new SettingModel("AIRODUMP_SECONDS"),
                        new SettingModel("WIFI_HOTSPOT"),
                        new SettingModel("WIFI_HOTSPOT_NIC"),
                        new SettingModel("ETHERNET_HOTSPOT"),
                        new SettingModel("ETHERNET_HOTSPOT"),
                        new SettingModel("ENABLE_SCREENSHOTS"),
                        new SettingModel("VIDEO_TMP"),
                        new SettingModel("RELAY"),
                        new SettingModel("RELAY_NIC"),
                        new SettingModel("RELAY_FREQ"),
                        new SettingModel("QUIET"),
                        new SettingModel("EXTERNAL_TELEMETRY_SERIALPORT_GROUND"),
                        new SettingModel("EXTERNAL_TELEMETRY_SERIALPORT_GROUND_BAUDRATE"),
                        new SettingModel("ENABLE_SERIAL_TELEMETRY_OUTPUT"),
                        new SettingModel("TELEMETRY_OUTPUT_SERIALPORT_GROUND"),
                        new SettingModel("TELEMETRY_OUTPUT_SERIALPORT_GROUND_BAUDRATE"),
                        new SettingModel("FORWARD_STREAM"),
                        new SettingModel("VIDEO_UDP_PORT"),
                        new SettingModel("MAVLINK_FORWARDER"),
                        new SettingModel("DEBUG"),
                        new SettingModel("IsCamera1Enabled"),
                        new SettingModel("IsCamera2Enabled"),
                        new SettingModel("IsCamera3Enabled"),
                        new SettingModel("IsCamera3Enabled"),
                        new SettingModel("IsCamera4Enabled"),
                        new SettingModel("IsCamera4Enabled"),
                        new SettingModel("DefaultCameraId"),
                        new SettingModel("ChannelToListen"),
                        new SettingModel("Camera2ValueMin"),
                        new SettingModel("Camera3ValueMin"),
                        new SettingModel("Camera4ValueMin"),
                        new SettingModel("CELLS"),
                        new SettingModel("EncryptionOrRange"),
                        new SettingModel("IsBandSwicherEnabled"),
                        new SettingModel("Bandwidth"),
                        new SettingModel("UplinkSpeed"),
                        new SettingModel("ChannelToLicsten2"),
                        new SettingModel("PrimaryCardMAC"),
                        new SettingModel("SlaveCardMAC"),
                        new SettingModel("Band5Below"),
                        new SettingModel("Band10ValueMin"),
                        new SettingModel("Band20After")

                )
        );
    }
}
