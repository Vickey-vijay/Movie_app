package com.bytedance.sdk.openadsdk.api.factory;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class SDKTypeConfig {
    private static ISDKTypeFactory ouw;

    public static ISDKTypeFactory getSdkTypeFactory() {
        Log.i("SDKTypeConfig", "getSdkTypeFactory: ");
        return ouw;
    }

    public static void setSdkTypeFactory(ISDKTypeFactory iSDKTypeFactory) {
        Log.i("SDKTypeConfig", "setSdkTypeFactory: ");
        ouw = iSDKTypeFactory;
    }
}
