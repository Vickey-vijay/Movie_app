package gj;

import ii.s;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: Schedulers.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f53420a = ej.a.h(new h());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f53421b = ej.a.e(new b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f53422c = ej.a.f(new c());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f53423d = aj.g.f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f53424e = ej.a.g(new f());

    /* JADX INFO: renamed from: gj.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Schedulers.java */
    public static final class C0479a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f53425a = new aj.a();
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class b implements Callable<s> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public s call() throws Exception {
            return C0479a.f53425a;
        }
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class c implements Callable<s> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public s call() throws Exception {
            return d.f53426a;
        }
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f53426a = new aj.c();
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f53427a = new aj.d();
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class f implements Callable<s> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public s call() throws Exception {
            return e.f53427a;
        }
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f53428a = new io.reactivex.internal.schedulers.b();
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class h implements Callable<s> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public s call() throws Exception {
            return g.f53428a;
        }
    }

    public static s a() {
        return ej.a.r(f53421b);
    }

    public static s b() {
        return ej.a.t(f53422c);
    }

    public static s c() {
        return f53423d;
    }
}
