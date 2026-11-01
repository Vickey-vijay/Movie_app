package com.bytedance.sdk.openadsdk.vm.yu;

import com.vungle.ads.internal.signals.SignalManager;

/* JADX INFO: loaded from: classes7.dex */
public final class ouw {
    public static long ouw() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis - (jCurrentTimeMillis % SignalManager.TWENTY_FOUR_HOURS_MILLIS);
    }
}
