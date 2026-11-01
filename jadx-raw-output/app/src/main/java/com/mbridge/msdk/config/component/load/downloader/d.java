package com.mbridge.msdk.config.component.load.downloader;

/* JADX INFO: compiled from: DownloadResponse.java */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f33347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f33348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33349c;

    public a a() {
        return this.f33347a;
    }

    public boolean b() {
        return this.f33348b;
    }

    public void a(a aVar) {
        this.f33347a = aVar;
        b(false);
    }

    public void b(boolean z10) {
        this.f33349c = z10;
    }

    public boolean c() {
        return this.f33349c;
    }

    public void a(Exception exc) {
        a(new a(exc));
    }

    public void a(boolean z10) {
        this.f33348b = z10;
    }
}
