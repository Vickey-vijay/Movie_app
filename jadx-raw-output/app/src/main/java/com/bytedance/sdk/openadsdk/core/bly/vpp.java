package com.bytedance.sdk.openadsdk.core.bly;

import android.os.SystemClock;
import com.ironsource.C3426d4;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class vpp implements com.bytedance.sdk.openadsdk.core.cf.ra.lh {

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private String f12571le;
    private long ouw = 0;
    private long vt = 0;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f12572lh = 0;
    private String yu = null;
    private String fkw = null;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final AtomicBoolean f12573ra = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
    public final void ouw(String str) {
        this.f12571le = str;
        this.ouw = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
    public final void vt(String str) {
        this.fkw = str;
        this.vt = SystemClock.elapsedRealtime();
        this.f12573ra.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
    public final void ouw(int i10, String str, String str2) {
        this.f12572lh = i10;
        this.yu = str;
        this.fkw = str2;
        this.vt = SystemClock.elapsedRealtime();
        this.f12573ra.set(false);
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str) {
        if (this.f12573ra.get()) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, false, str, "success", this.vt - this.ouw, this.fkw, this.f12571le, 0, null);
        } else {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, false, str, C3426d4.g.f28496e, this.vt - this.ouw, this.fkw, this.f12571le, this.f12572lh, this.yu);
        }
    }
}
