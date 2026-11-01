package com.bytedance.sdk.component.le.ouw.yu.vt;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw {
    public int ouw;
    public int vt;

    public static ouw ouw() {
        return new ouw(1);
    }

    public ouw(int i10) {
        if (100 >= i10) {
            this.ouw = i10;
            this.vt = 100;
            return;
        }
        throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
    }
}
