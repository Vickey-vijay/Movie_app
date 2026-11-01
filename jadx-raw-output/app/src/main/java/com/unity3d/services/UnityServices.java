package com.unity3d.services;

import android.content.Context;
import ck.p;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;

/* JADX INFO: compiled from: UnityServices.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class UnityServices {
    public static final UnityServices INSTANCE = new UnityServices();
    private static final boolean isSupported = true;

    /* JADX INFO: compiled from: UnityServices.kt */
    public enum UnityServicesError {
        INVALID_ARGUMENT,
        INIT_SANITY_CHECK_FAIL
    }

    private UnityServices() {
    }

    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static /* synthetic */ void isSupported$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final synchronized void initialize(Context context, String str, boolean z10, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        DeviceLog.entered();
        SdkProperties.addInitializationListener(iUnityAdsInitializationListener);
        SdkProperties.setTestMode(z10);
        SdkProperties.setDebugMode(SdkProperties.getDebugMode());
        CachedLifecycle.register();
        UnityAdsSDK.initialize$default(new UnityAdsSDK(null, 1, 0 == true ? 1 : 0), str, null, 2, null);
    }

    public static final boolean isSupported() {
        return isSupported;
    }

    public static final boolean getDebugMode() {
        return SdkProperties.getDebugMode();
    }

    public static final String getVersion() {
        String versionName = SdkProperties.getVersionName();
        p.i(versionName, "getVersionName()");
        return versionName;
    }

    public static final boolean isInitialized() {
        return SdkProperties.isInitialized();
    }

    public static final void setDebugMode(boolean z10) {
        SdkProperties.setDebugMode(z10);
    }
}
