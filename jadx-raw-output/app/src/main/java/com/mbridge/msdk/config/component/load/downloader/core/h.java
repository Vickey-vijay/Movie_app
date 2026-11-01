package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: Downloader.java */
/* JADX INFO: loaded from: classes9.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.config.component.load.downloader.c f33317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile d f33319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f33320d;

    @Override // java.lang.Runnable
    public void run() {
        q0.a(IDownloadTask.TAG, "开始下载任务");
        if (this.f33319c.j() != com.mbridge.msdk.config.component.load.downloader.e.RETRY) {
            this.f33319c.d(this.f33319c.d());
        }
        this.f33319c.a(com.mbridge.msdk.config.component.load.downloader.e.RUNNING);
        this.f33320d = this.f33319c.d();
        q0.a(IDownloadTask.TAG, "filePath ： " + this.f33320d.e());
        com.mbridge.msdk.config.component.load.downloader.d dVarRun = g.a(this.f33319c, this.f33320d, l.c().b()).run();
        if (dVarRun.c()) {
            this.f33319c.e(this.f33320d);
        } else if (dVarRun.a() != null) {
            this.f33319c.a(this.f33320d, dVarRun.a());
        } else if (dVarRun.b()) {
            this.f33319c.b(this.f33320d);
        }
    }

    public h(d<?> dVar) {
        this.f33319c = dVar;
        this.f33317a = dVar.e();
        this.f33318b = dVar.i();
    }
}
