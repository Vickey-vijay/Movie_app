package com.bykv.vk.openvk.preload.geckox.a.a;

/* JADX INFO: compiled from: CacheConfig.java */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f10552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f10553c;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CacheConfig.java */
    public static final class C0064a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f10555b = b.f10557a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f10556c;

        public final C0064a a() {
            this.f10554a = 20;
            return this;
        }

        public final a b() {
            return new a(this, (byte) 0);
        }

        public final C0064a a(b bVar) {
            if (bVar == null) {
                bVar = b.f10557a;
            }
            this.f10555b = bVar;
            return this;
        }
    }

    public /* synthetic */ a(C0064a c0064a, byte b10) {
        this(c0064a);
    }

    private a(C0064a c0064a) {
        this.f10551a = c0064a.f10554a;
        this.f10553c = c0064a.f10555b;
        this.f10552b = c0064a.f10556c;
    }

    public final b a() {
        return this.f10553c;
    }
}
