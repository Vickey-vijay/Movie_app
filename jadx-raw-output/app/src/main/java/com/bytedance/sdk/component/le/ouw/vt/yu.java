package com.bytedance.sdk.component.le.ouw.vt;

import android.os.Handler;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public final class yu {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public final PriorityBlockingQueue<com.bytedance.sdk.component.le.ouw.yu.ouw> f11850cf;
    private final Comparator<com.bytedance.sdk.component.le.ouw.yu.ouw> ryl;
    public volatile Handler tlj;
    public volatile com.bytedance.sdk.component.le.ouw.vt.lh.lh vt;
    public static final yu ouw = new yu();
    public static final com.bytedance.sdk.component.le.ouw.vt.ouw.ouw fkw = new com.bytedance.sdk.component.le.ouw.vt.ouw.ouw();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public static final AtomicLong f11848le = new AtomicLong(0);

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public static final AtomicLong f11849ra = new AtomicLong(0);
    public static final long pno = System.currentTimeMillis();
    public static long bly = 0;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public volatile boolean f11851lh = false;
    public volatile boolean yu = false;

    public final void ouw() {
        if (this.vt == null || !this.vt.isAlive()) {
            return;
        }
        synchronized (this) {
            if (this.vt != null && this.vt.isAlive()) {
                if (this.tlj != null) {
                    this.tlj.removeCallbacksAndMessages(null);
                }
                this.vt.ouw = false;
                this.vt.quitSafely();
                this.vt = null;
            }
        }
    }

    public final boolean vt() {
        try {
            if (this.vt != null || com.bytedance.sdk.component.le.ouw.vt.vt()) {
                return false;
            }
            synchronized (this) {
                if (this.vt != null) {
                    return false;
                }
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                this.vt = new com.bytedance.sdk.component.le.ouw.vt.lh.lh(this.f11850cf);
                this.vt.start();
                return true;
            }
        } catch (Throwable th2) {
            th2.getMessage();
            com.bytedance.sdk.component.le.ouw.lh.vt.lh();
            return false;
        }
    }

    private yu() {
        Comparator<com.bytedance.sdk.component.le.ouw.yu.ouw> comparator = new Comparator<com.bytedance.sdk.component.le.ouw.yu.ouw>() { // from class: com.bytedance.sdk.component.le.ouw.vt.yu.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar, com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar2) {
                return yu.ouw(ouwVar, ouwVar2);
            }
        };
        this.ryl = comparator;
        this.f11850cf = new PriorityBlockingQueue<>(8, comparator);
    }

    public static /* synthetic */ int ouw(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar, com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar2) {
        long jVt;
        long jLh;
        long jLh2;
        long jVt2;
        if (ouwVar == null) {
            return ouwVar2 == null ? 0 : -1;
        }
        if (ouwVar2 == null) {
            return 1;
        }
        if (ouwVar.fkw() == ouwVar2.fkw()) {
            if (ouwVar.ouw() != null) {
                jVt = ouwVar.ouw().vt();
                jLh = ouwVar.ouw().lh();
            } else {
                jVt = 0;
                jLh = 0;
            }
            if (ouwVar2.ouw() != null) {
                jVt2 = ouwVar2.ouw().vt();
                jLh2 = ouwVar2.ouw().lh();
            } else {
                jLh2 = 0;
                jVt2 = 0;
            }
            if (jVt == 0 || jVt2 == 0) {
                return 0;
            }
            long j10 = jVt - jVt2;
            if (Math.abs(j10) > 2147483647L) {
                return 0;
            }
            if (j10 != 0) {
                return (int) j10;
            }
            if (jLh == 0 || jLh2 == 0) {
                return 0;
            }
            return (int) (jLh - jLh2);
        }
        return ouwVar.fkw() - ouwVar2.fkw();
    }
}
