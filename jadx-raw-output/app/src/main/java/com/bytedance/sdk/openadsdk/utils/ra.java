package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.applovin.sdk.AppLovinEventTypes;

/* JADX INFO: loaded from: classes2.dex */
public final class ra {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static long f13404lh = 0;
    public static int ouw = -1;
    public static float vt;

    public static class ouw {
        public final int ouw;
        public final float vt;

        public ouw(int i10, float f10) {
            this.ouw = i10;
            this.vt = f10;
        }
    }

    @NonNull
    public static ouw ouw() {
        if (f13404lh == 0 || SystemClock.elapsedRealtime() - f13404lh > 60000) {
            Intent intentRegisterReceiver = com.bytedance.sdk.openadsdk.core.zih.ouw().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(intentRegisterReceiver)));
            if (intentRegisterReceiver != null) {
                if (intentRegisterReceiver.getIntExtra("status", -1) == 2) {
                    ouw = 1;
                } else {
                    ouw = 0;
                }
                vt = (intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intentRegisterReceiver.getIntExtra("scale", -1);
                com.bytedance.sdk.component.utils.ko.vt("BatteryDataWatcher", "updateFromIntent: status=" + ouw + ", level=" + vt);
                f13404lh = SystemClock.elapsedRealtime();
            }
        }
        ouw ouwVar = new ouw(ouw, vt);
        com.bytedance.sdk.component.utils.ko.vt("BatteryDataWatcher", "obtainCurrentState: " + ouwVar.ouw + ", " + ouwVar.vt);
        return ouwVar;
    }
}
