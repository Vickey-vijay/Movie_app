package com.bytedance.sdk.component.le.ouw.ouw.ouw;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class ouw extends vt {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile ouw ouw;

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.vt
    public final /* bridge */ /* synthetic */ vt.C0093vt ouw() {
        return super.ouw();
    }

    public static ouw ouw(Context context) {
        if (ouw == null) {
            synchronized (ouw.class) {
                if (ouw == null) {
                    ouw = new ouw(context);
                }
            }
        }
        return ouw;
    }

    private ouw(Context context) {
        super(context);
    }
}
