package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3507hd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EnumC3578ld f29085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f29087f;

    /* JADX INFO: renamed from: com.ironsource.hd$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f29088a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f29089b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f29090c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private EnumC3578ld f29091d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f29092e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f29093f = 0;

        public a a(boolean z10) {
            this.f29088a = z10;
            return this;
        }

        public a a(boolean z10, EnumC3578ld enumC3578ld, int i10) {
            this.f29089b = z10;
            if (enumC3578ld == null) {
                enumC3578ld = EnumC3578ld.PER_DAY;
            }
            this.f29091d = enumC3578ld;
            this.f29092e = i10;
            return this;
        }

        public a a(boolean z10, int i10) {
            this.f29090c = z10;
            this.f29093f = i10;
            return this;
        }

        public C3507hd a() {
            return new C3507hd(this.f29088a, this.f29089b, this.f29090c, this.f29091d, this.f29092e, this.f29093f);
        }
    }

    private C3507hd(boolean z10, boolean z11, boolean z12, EnumC3578ld enumC3578ld, int i10, int i11) {
        this.f29082a = z10;
        this.f29083b = z11;
        this.f29084c = z12;
        this.f29085d = enumC3578ld;
        this.f29086e = i10;
        this.f29087f = i11;
    }

    public EnumC3578ld a() {
        return this.f29085d;
    }

    public int b() {
        return this.f29086e;
    }

    public int c() {
        return this.f29087f;
    }

    public boolean d() {
        return this.f29083b;
    }

    public boolean e() {
        return this.f29082a;
    }

    public boolean f() {
        return this.f29084c;
    }
}
