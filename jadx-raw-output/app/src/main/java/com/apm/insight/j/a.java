package com.apm.insight.j;

import android.os.Handler;

/* JADX INFO: compiled from: BaseTask.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f6481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f6482b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6483c;

    public final void a() {
        this.f6481a.post(this);
    }

    public final void a(long j10) {
        if (j10 > 0) {
            this.f6481a.postDelayed(this, j10);
        } else {
            this.f6481a.post(this);
        }
    }

    public final long b() {
        return this.f6483c;
    }

    public a(Handler handler, long j10) {
        this.f6481a = handler;
        this.f6483c = j10;
    }
}
