package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import java.util.List;
import qk.c;

/* JADX INFO: compiled from: DynamicDeviceInfoDataSource.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface DynamicDeviceInfoDataSource {
    DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch();

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    List<String> getLocaleList();

    String getOrientation();

    int getRingerMode();

    c<VolumeSettingsChange> getVolumeSettingsChange();

    boolean hasInternet();
}
