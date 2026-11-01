package com.mbridge.msdk.config.component.load.downloader;

/* JADX INFO: compiled from: MBDownloadConfig.java */
/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f33391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f33392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f33393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f33394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33397g;

    /* JADX INFO: compiled from: MBDownloadConfig.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f33398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f33399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f33400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f33401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f33402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f33403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f33404g;

        public b() {
            this(null);
        }

        public b(f fVar) {
            this.f33398a = 20000L;
            this.f33399b = 10L;
            this.f33400c = 20000L;
            this.f33401d = 20000L;
            this.f33402e = 64;
            this.f33403f = 20;
            this.f33404g = 10;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(fVar)) {
                this.f33400c = fVar.c();
                this.f33398a = fVar.a();
                this.f33402e = fVar.f();
                this.f33401d = fVar.d();
                this.f33403f = fVar.g();
                this.f33399b = fVar.b();
                this.f33404g = fVar.e();
            }
        }

        public f a() {
            return new f(this);
        }

        public b a(int i10) {
            this.f33404g = i10;
            return this;
        }
    }

    private f(b bVar) {
        this.f33391a = bVar.f33398a;
        this.f33393c = bVar.f33400c;
        this.f33394d = bVar.f33401d;
        this.f33395e = bVar.f33402e;
        this.f33396f = bVar.f33403f;
        this.f33392b = bVar.f33399b;
        this.f33397g = bVar.f33404g;
    }

    public long a() {
        return this.f33391a;
    }

    public long b() {
        return this.f33392b;
    }

    public long c() {
        return this.f33393c;
    }

    public long d() {
        return this.f33394d;
    }

    public int e() {
        return this.f33397g;
    }

    public int f() {
        return this.f33395e;
    }

    public int g() {
        return this.f33396f;
    }
}
