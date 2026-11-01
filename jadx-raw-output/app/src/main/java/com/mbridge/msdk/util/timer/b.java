package com.mbridge.msdk.util.timer;

import android.os.CountDownTimer;

/* JADX INFO: compiled from: MBCountDownTimer.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.util.timer.a f38370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f38371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f38372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f38373d = 0;

    /* JADX INFO: compiled from: MBCountDownTimer.java */
    public static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.util.timer.a f38374a;

        public void a(com.mbridge.msdk.util.timer.a aVar) {
            this.f38374a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.util.timer.a aVar = this.f38374a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.util.timer.a aVar = this.f38374a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }

        public a(long j10, long j11) {
            super(j10, j11);
        }
    }

    public void a() {
        a aVar = this.f38372c;
        if (aVar != null) {
            aVar.cancel();
            this.f38372c = null;
        }
    }

    public b b(long j10) {
        this.f38373d = j10;
        return this;
    }

    public void b() {
        a aVar = this.f38372c;
        if (aVar != null) {
            aVar.cancel();
            this.f38372c = null;
        }
        if (this.f38371b <= 0) {
            this.f38371b = this.f38373d + 1000;
        }
        a aVar2 = new a(this.f38373d, this.f38371b);
        this.f38372c = aVar2;
        aVar2.a(this.f38370a);
    }

    public void c() {
        if (this.f38372c == null) {
            b();
        }
        this.f38372c.start();
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f38371b = j10;
        return this;
    }

    public b a(com.mbridge.msdk.util.timer.a aVar) {
        this.f38370a = aVar;
        return this;
    }
}
