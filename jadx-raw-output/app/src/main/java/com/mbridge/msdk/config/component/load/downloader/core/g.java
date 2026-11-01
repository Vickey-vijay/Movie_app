package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: DownloadTask.java */
/* JADX INFO: loaded from: classes9.dex */
public class g implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.c f33310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f33311c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile d f33314f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f33309a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.database.b f33312d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f33313e = true;

    /* JADX INFO: compiled from: DownloadTask.java */
    public class a implements com.mbridge.msdk.config.component.load.downloader.database.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f33315a;

        public a(CountDownLatch countDownLatch) {
            this.f33315a = countDownLatch;
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.database.c.a
        public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            synchronized (g.this.f33309a) {
                if (g.this.f33313e) {
                    g.this.f33312d = bVar;
                }
            }
            this.f33315a.countDown();
        }
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.d run() {
        String strF = this.f33314f.f();
        if (this.f33314f.j() == com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            com.mbridge.msdk.config.component.load.downloader.d dVar = new com.mbridge.msdk.config.component.load.downloader.d();
            dVar.a(true);
            return dVar;
        }
        if (this.f33311c.c() == 0) {
            com.mbridge.msdk.config.component.load.downloader.d dVar2 = new com.mbridge.msdk.config.component.load.downloader.d();
            dVar2.b(true);
            return dVar2;
        }
        String strE = this.f33311c.e();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f33310b.a(strF, strE, new a(countDownLatch));
        try {
            try {
                countDownLatch.await(10L, TimeUnit.SECONDS);
                synchronized (this.f33309a) {
                    this.f33313e = false;
                }
            } catch (InterruptedException e10) {
                q0.a(IDownloadTask.TAG, e10.getMessage(), e10);
                countDownLatch.countDown();
                synchronized (this.f33309a) {
                    this.f33313e = false;
                }
            }
            com.mbridge.msdk.config.component.load.downloader.d dVarRun = k.a(this.f33314f, this.f33312d, this.f33310b, strF, this.f33311c).run();
            if (!com.mbridge.msdk.config.component.load.downloader.utils.a.a(dVarRun) || !dVarRun.c()) {
                if (this.f33311c != null) {
                    this.f33311c.a(false);
                }
                return n.a(this.f33314f, this.f33312d, this.f33310b, this.f33311c).run();
            }
            if (this.f33311c != null) {
                this.f33311c.a(true);
                this.f33311c.a(this.f33314f.l());
                this.f33311c.a(this.f33312d.d());
                this.f33311c.a(((this.f33314f.g() * 1.0f) / this.f33314f.l()) * 100.0f);
            }
            a(this.f33314f, this.f33311c);
            this.f33312d = com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f33312d.c(), this.f33312d.e(), this.f33312d.b(), this.f33312d.i(), System.currentTimeMillis(), this.f33314f.l(), this.f33312d.a(), this.f33312d.f(), this.f33312d.d());
            this.f33310b.a(this.f33312d, this.f33311c.e());
            return dVarRun;
        } catch (Throwable th2) {
            synchronized (this.f33309a) {
                this.f33313e = false;
                throw th2;
            }
        }
    }

    private g(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar) {
        this.f33314f = dVar;
        this.f33311c = bVar;
        this.f33310b = cVar;
    }

    public static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar) {
        return new g(dVar, bVar, cVar);
    }

    private void a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (dVar.j() != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            long jG = this.f33314f.g();
            long jL = this.f33314f.l();
            dVar.a(bVar, new DownloadProgress(jG, jL, com.mbridge.msdk.config.component.load.downloader.utils.b.a(jL, jG)));
        }
    }
}
