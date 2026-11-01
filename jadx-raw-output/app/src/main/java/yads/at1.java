package yads;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import yads.at1;

/* JADX INFO: loaded from: classes9.dex */
public final class at1 implements io2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f75620e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f75621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f75623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mj.g f75624d;

    public static void a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(nj.l0.f(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), nj.n.q0((Object[]) entry.getValue()));
        }
        linkedHashMap.toString();
        boolean z10 = ad1.f75480a;
    }

    @Override // yads.io2
    public final void reportAnr(final Map map) {
        if (this.f75621a != null) {
            this.f75623c.execute(new Runnable() { // from class: cp.c
                @Override // java.lang.Runnable
                public final void run() {
                    at1.a(this.f51253b, map);
                }
            });
        } else {
            boolean z10 = ad1.f75480a;
        }
    }

    @Override // yads.rm0
    public final void reportError(final String str, final Throwable th2) {
        if (this.f75622b) {
            if (this.f75621a != null) {
                this.f75623c.execute(new Runnable() { // from class: cp.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        at1.a(this.f51268b, str, th2);
                    }
                });
            } else {
                boolean z10 = ad1.f75480a;
            }
        }
    }

    @Override // yads.io2
    public final void reportUnhandledException(final Throwable th2) {
        if (this.f75621a != null) {
            this.f75623c.execute(new Runnable() { // from class: cp.f
                @Override // java.lang.Runnable
                public final void run() {
                    at1.a(this.f51316b, th2);
                }
            });
        } else {
            boolean z10 = ad1.f75480a;
        }
    }

    public at1(gh ghVar, mj.g gVar, boolean z10, Executor executor) {
        this.f75621a = ghVar;
        this.f75622b = z10;
        this.f75623c = executor;
        this.f75624d = gVar;
    }

    public static void a(String str, Throwable th2) {
        Objects.toString(th2);
        boolean z10 = ad1.f75480a;
    }

    public static void a(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(nj.l0.f(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), nj.k.c(new Object[]{entry.getValue()}));
        }
        linkedHashMap.toString();
        boolean z10 = ad1.f75480a;
    }

    public static void a(Throwable th2) {
        Objects.toString(th2);
        boolean z10 = ad1.f75480a;
    }

    public static final void a(at1 at1Var, Map map) {
        try {
            at1Var.getClass();
            a(map);
            at1Var.f75621a.reportAnr(map);
        } catch (Throwable unused) {
            boolean z10 = ad1.f75480a;
        }
    }

    public static final void a(at1 at1Var, String str, Throwable th2) {
        try {
            at1Var.getClass();
            a(str, th2);
            at1Var.f75621a.reportError(str, th2);
        } catch (Throwable unused) {
            boolean z10 = ad1.f75480a;
        }
    }

    @Override // yads.io2
    public final void a(final eo2 eo2Var) {
        if (this.f75621a != null) {
            this.f75623c.execute(new Runnable() { // from class: cp.e
                @Override // java.lang.Runnable
                public final void run() {
                    at1.a(this.f51293b, eo2Var);
                }
            });
        } else {
            boolean z10 = ad1.f75480a;
        }
    }

    public static final void a(at1 at1Var, eo2 eo2Var) {
        try {
            xb3.a((ou3) at1Var.f75624d.getValue(), eo2Var);
            a(eo2Var.f77158a, eo2Var.f77159b);
            at1Var.f75621a.a(eo2Var);
        } catch (Throwable unused) {
            boolean z10 = ad1.f75480a;
        }
    }

    public static final void a(at1 at1Var, Throwable th2) {
        try {
            at1Var.getClass();
            a(th2);
            at1Var.f75621a.reportUnhandledException(th2);
        } catch (Throwable unused) {
            boolean z10 = ad1.f75480a;
        }
    }
}
