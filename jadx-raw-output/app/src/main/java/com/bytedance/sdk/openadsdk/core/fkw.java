package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public class fkw extends le {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile fkw ouw;

    @Override // com.bytedance.sdk.openadsdk.core.le
    public final /* bridge */ /* synthetic */ le.lh ouw() {
        return super.ouw();
    }

    public static fkw ouw(Context context) {
        if (ouw == null) {
            synchronized (fkw.class) {
                if (ouw == null) {
                    ouw = new fkw(context);
                }
            }
        }
        return ouw;
    }

    private fkw(Context context) {
        super(context);
    }
}
