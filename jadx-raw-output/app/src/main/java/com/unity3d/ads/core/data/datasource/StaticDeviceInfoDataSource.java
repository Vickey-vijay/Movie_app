package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import rj.c;

/* JADX INFO: compiled from: StaticDeviceInfoDataSource.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface StaticDeviceInfoDataSource {
    Object fetch(List<String> list, c<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> cVar);

    StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuid(c<? super String> cVar);

    Object getIdfi(c<? super String> cVar);

    String getManufacturer();

    String getModel();

    String getOsVersion();

    long getSystemBootTime();

    Object getUnityBuildGuid(c<? super String> cVar);
}
