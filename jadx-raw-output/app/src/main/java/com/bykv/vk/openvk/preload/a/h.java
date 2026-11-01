package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: Pipe.java */
/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class<? extends d> f10511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f10512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f10513c;

    /* JADX INFO: compiled from: Pipe.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Class<? extends d> f10514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f10515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object[] f10516c;

        public static a a() {
            return new a();
        }

        public final h b() {
            return new h(this, (byte) 0);
        }

        private a() {
        }

        public final a a(Class<? extends d> cls) {
            if (cls != null) {
                this.f10514a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        public final a a(com.bykv.vk.openvk.preload.a.b.a aVar) {
            this.f10515b = aVar;
            return this;
        }

        public final a a(Object... objArr) {
            this.f10516c = objArr;
            return this;
        }
    }

    public /* synthetic */ h(a aVar, byte b10) {
        this(aVar);
    }

    private h(a aVar) {
        this.f10511a = aVar.f10514a;
        this.f10512b = aVar.f10515b;
        this.f10513c = aVar.f10516c;
        if (this.f10511a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }

    public final com.bykv.vk.openvk.preload.a.b.a a() {
        return this.f10512b;
    }

    public final Object[] b() {
        return this.f10513c;
    }
}
