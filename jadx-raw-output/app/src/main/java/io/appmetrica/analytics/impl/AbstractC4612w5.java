package io.appmetrica.analytics.impl;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4612w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f57861a;

    static {
        HashMap map = new HashMap();
        map.put(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, AdTrackingInfo.Provider.GOOGLE);
        map.put("huawei", AdTrackingInfo.Provider.HMS);
        map.put("yandex", AdTrackingInfo.Provider.YANDEX);
        f57861a = Collections.unmodifiableMap(map);
    }
}
