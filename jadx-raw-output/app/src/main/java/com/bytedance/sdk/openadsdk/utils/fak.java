package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes10.dex */
public final class fak {
    public long ouw;
    public long vt;

    public static fak ouw() {
        return new fak(true);
    }

    public static fak vt() {
        return new fak(false);
    }

    public final boolean fkw() {
        return this.vt > 0;
    }

    public final long ouw(fak fakVar) {
        return Math.abs(fakVar.vt - this.vt);
    }

    public final String toString() {
        return String.valueOf(this.ouw);
    }

    private fak(boolean z10) {
        if (z10) {
            yu();
        }
    }

    public final long lh() {
        return SystemClock.elapsedRealtime() - this.vt;
    }

    public final void yu() {
        this.ouw = System.currentTimeMillis();
        this.vt = SystemClock.elapsedRealtime();
    }
}
