package com.bytedance.sdk.component.utils;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class tc {
    public static volatile String ouw;

    public static int ouw(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().icon;
        } catch (Exception unused) {
            return 0;
        }
    }
}
