package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.view.WindowManager;
import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f17924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f17933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f17934k;

    public h() {
        double refreshRate = ((WindowManager) IAConfigManager.O.f15027v.a().getSystemService("window")).getDefaultDisplay().getRefreshRate();
        this.f17925b = true;
        this.f17924a = g.f17919e;
        long j10 = (long) (1.0E9d / refreshRate);
        this.f17926c = j10;
        this.f17927d = (j10 * 80) / 100;
    }
}
