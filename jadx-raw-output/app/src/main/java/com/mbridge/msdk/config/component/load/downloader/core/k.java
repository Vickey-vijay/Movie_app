package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;

/* JADX INFO: compiled from: FindFileFromCache.java */
/* JADX INFO: loaded from: classes9.dex */
class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.c f33323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.b f33325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d<?> f33326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.b<?> f33327e;

    public static m a(d<?> dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, String str, com.mbridge.msdk.config.component.load.downloader.b<?> bVar2) {
        return new k(dVar, bVar, cVar, str, bVar2);
    }

    private boolean a() {
        try {
            return Boolean.parseBoolean(this.f33326d.a("do_us_fi_re", Boolean.toString(true)));
        } catch (Exception unused) {
            q0.a(IDownloadTask.TAG, "类型转换错误： do_us_fi_re");
            return false;
        }
    }

    private void b(com.mbridge.msdk.config.component.load.downloader.d dVar, File file) {
        long length = file.length();
        long jLastModified = file.lastModified();
        this.f33326d.b(this.f33325c.g());
        this.f33326d.a(file.length());
        l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f33325c.c(), file.getAbsolutePath(), this.f33325c.b(), this.f33325c.i(), jLastModified, this.f33325c.g(), this.f33325c.a(), this.f33325c.f(), this.f33325c.d()), this.f33327e.e());
        dVar.b(a(length));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.d run() {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(this.f33325c)) {
            return null;
        }
        com.mbridge.msdk.config.component.load.downloader.d dVar = new com.mbridge.msdk.config.component.load.downloader.d();
        File file = new File(this.f33327e.e());
        if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(file)) {
            this.f33326d.a(0L);
            this.f33323a.remove(this.f33324b);
            dVar.b(false);
            return dVar;
        }
        long jC = com.mbridge.msdk.config.component.load.downloader.resource.a.a().c(file);
        if (jC == this.f33325c.g()) {
            this.f33326d.b(this.f33325c.g());
            this.f33326d.a(jC);
            dVar.b(a(jC));
            return dVar;
        }
        boolean zA = a();
        q0.a(IDownloadTask.TAG, "数据库记录和文件大小不一致，是否以文件大小为基准进行断点续传： " + zA);
        if (zA) {
            b(dVar, file);
        } else {
            a(dVar, file);
        }
        return dVar;
    }

    private k(d<?> dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, String str, com.mbridge.msdk.config.component.load.downloader.b<?> bVar2) {
        this.f33326d = dVar;
        this.f33325c = bVar;
        this.f33323a = cVar;
        this.f33324b = str;
        this.f33327e = bVar2;
    }

    private void a(com.mbridge.msdk.config.component.load.downloader.d dVar, File file) {
        this.f33326d.a(0L);
        this.f33326d.b(0L);
        this.f33323a.remove(this.f33324b);
        com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(file);
        dVar.b(false);
    }

    private boolean a(long j10) {
        return com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.f33325c.g(), j10) >= this.f33327e.c();
    }
}
