package com.mbridge.msdk.out;

import android.annotation.SuppressLint;
import com.mbridge.msdk.system.MBridgeSDKImpl;

/* JADX INFO: loaded from: classes9.dex */
public class MBridgeSDKFactory {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile MBridgeSDKImpl instance;

    public static MBridgeSDKImpl getMBridgeSDK() {
        if (instance == null) {
            synchronized (MBridgeSDKFactory.class) {
                if (instance == null) {
                    instance = new MBridgeSDKImpl();
                }
            }
        }
        return instance;
    }

    private MBridgeSDKFactory() {
    }
}
