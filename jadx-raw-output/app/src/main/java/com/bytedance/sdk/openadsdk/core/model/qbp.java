package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes5.dex */
public final class qbp {
    public long ouw = 10000;
    public long vt = 10000;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public long f12802lh = 10;
    public long yu = 20;
    public String fkw = "";

    public final void lh(long j10) {
        if (j10 <= 0) {
            this.f12802lh = 10L;
        } else {
            this.f12802lh = j10;
        }
    }

    public final void ouw(long j10) {
        if (j10 <= 0) {
            this.ouw = 10L;
        } else {
            this.ouw = j10;
        }
    }

    public final void vt(long j10) {
        if (j10 < 0) {
            this.vt = 20L;
        } else {
            this.vt = j10;
        }
    }

    public final void yu(long j10) {
        if (j10 < 0) {
            this.yu = 20L;
        } else {
            this.yu = j10;
        }
    }
}
