package com.mbridge.msdk.config.component.load.downloader.core;

/* JADX INFO: compiled from: ExecutorManager.java */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f33321a;

    /* JADX INFO: compiled from: ExecutorManager.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final i f33322a = new i();
    }

    public void a(int i10) {
        this.f33321a = new com.mbridge.msdk.config.component.load.downloader.core.a(i10);
    }

    private i() {
    }

    public j a() {
        if (this.f33321a == null) {
            this.f33321a = new com.mbridge.msdk.config.component.load.downloader.core.a(10);
        }
        return this.f33321a;
    }

    public static i b() {
        return b.f33322a;
    }
}
