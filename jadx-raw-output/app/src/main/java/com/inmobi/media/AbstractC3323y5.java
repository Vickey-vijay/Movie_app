package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.widget.ActivityChooserModel;

/* JADX INFO: renamed from: com.inmobi.media.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3323y5 {
    public static final int a() {
        int i10 = Resources.getSystem().getDisplayMetrics().densityDpi;
        if (640 <= i10 && i10 <= Integer.MAX_VALUE) {
            return 1080;
        }
        if (480 <= i10 && i10 < 640) {
            return 720;
        }
        if (320 > i10 || i10 >= 480) {
            return (240 > i10 || i10 >= 320) ? 240 : 360;
        }
        return 480;
    }

    public static final boolean a(Context context) {
        ck.p.j(context, "<this>");
        Object systemService = context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ck.p.h(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) systemService;
        ck.p.j(activityManager, "<this>");
        C3298x5.f25687a.getClass();
        if (!(C3298x5.u() ? activityManager.isLowRamDevice() : true)) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.availMem / ((long) 1048576) >= 100) {
                return false;
            }
        }
        return true;
    }
}
