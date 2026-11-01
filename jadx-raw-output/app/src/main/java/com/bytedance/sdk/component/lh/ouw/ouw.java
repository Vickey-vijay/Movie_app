package com.bytedance.sdk.component.lh.ouw;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw {
    public long fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public long f11861le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public long f11862lh;
    public long ouw = SystemClock.elapsedRealtime();
    public long pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public long f11863ra;
    public long vt;
    public long yu;

    public final String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.ouw + ", asyncCallExecTs=" + this.vt + ", requestStartExecTs=" + this.f11862lh + ", requestConnectStartTs=" + this.yu + ", requestConnectFinishTs=" + this.fkw + ", reqCallServerStartTs=" + this.f11863ra + ", reqCallServerFinishTs=" + this.pno + '}';
    }
}
