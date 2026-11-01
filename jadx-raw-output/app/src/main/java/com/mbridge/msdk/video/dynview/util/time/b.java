package com.mbridge.msdk.video.dynview.util.time;

import android.os.CountDownTimer;

/* JADX INFO: compiled from: MBCountDownTimer.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f38720a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f38721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.a f38722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f38723d;

    /* JADX INFO: compiled from: MBCountDownTimer.java */
    public static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.dynview.util.time.a f38724a;

        public void a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
            this.f38724a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f38724a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f38724a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }

        public a(long j10, long j11) {
            super(j10, j11);
        }
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f38721b = j10;
        return this;
    }

    public b b(long j10) {
        this.f38720a = j10;
        return this;
    }

    public b a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f38722c = aVar;
        return this;
    }

    public void b() {
        a aVar = this.f38723d;
        if (aVar != null) {
            aVar.cancel();
            this.f38723d = null;
        }
        if (this.f38721b <= 0) {
            this.f38721b = this.f38720a + 1000;
        }
        a aVar2 = new a(this.f38720a, this.f38721b);
        this.f38723d = aVar2;
        aVar2.a(this.f38722c);
    }

    public void c() {
        if (this.f38723d == null) {
            b();
        }
        this.f38723d.start();
    }

    public void a(long j10, com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f38720a = j10;
        this.f38722c = aVar;
        b();
        a aVar2 = this.f38723d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }

    public void a() {
        a aVar = this.f38723d;
        if (aVar != null) {
            aVar.cancel();
            this.f38723d = null;
        }
    }
}
