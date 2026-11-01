package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes5.dex */
public class v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f38296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.mbridge.msdk.tracker.network.b.a f38297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f38298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38299d;

    /* JADX INFO: compiled from: Response.java */
    public interface a {
        void a(b0 b0Var);
    }

    /* JADX INFO: compiled from: Response.java */
    public interface b<T> {
        void a(T t10);
    }

    private v(T t10, com.mbridge.msdk.tracker.network.b.a aVar) {
        this.f38299d = false;
        this.f38296a = t10;
        this.f38297b = aVar;
        this.f38298c = null;
    }

    public static <T> v<T> a(T t10, com.mbridge.msdk.tracker.network.b.a aVar) {
        return new v<>(t10, aVar);
    }

    public static <T> v<T> a(b0 b0Var) {
        return new v<>(b0Var);
    }

    public boolean a() {
        return this.f38298c == null;
    }

    private v(b0 b0Var) {
        this.f38299d = false;
        this.f38296a = null;
        this.f38297b = null;
        this.f38298c = b0Var;
    }
}
