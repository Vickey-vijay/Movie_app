package m7;

import android.app.Application;

/* JADX INFO: compiled from: FileDownloader.java */
/* JADX INFO: loaded from: classes8.dex */
public class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f64246c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f64247d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f64248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f64249b;

    /* JADX INFO: compiled from: FileDownloader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f64250a = new r();
    }

    public void bindService() {
        if (f()) {
            return;
        }
        n.f().o(w7.c.a());
    }

    public m7.a b(String str) {
        return new c(str);
    }

    public w d() {
        if (this.f64249b == null) {
            synchronized (f64247d) {
                if (this.f64249b == null) {
                    a0 a0Var = new a0();
                    this.f64249b = a0Var;
                    a(a0Var);
                }
            }
        }
        return this.f64249b;
    }

    public x e() {
        if (this.f64248a == null) {
            synchronized (f64246c) {
                if (this.f64248a == null) {
                    this.f64248a = new d0();
                }
            }
        }
        return this.f64248a;
    }

    public static r c() {
        return a.f64250a;
    }

    public static u7.c.a g(Application application) {
        w7.c.b(application.getApplicationContext());
        u7.c.a aVar = new u7.c.a();
        p7.a.j().o(aVar);
        return aVar;
    }

    public void a(e eVar) {
        f.e().a("event.service.connect.changed", eVar);
    }

    public boolean f() {
        return n.f().isConnected();
    }

    public void h(boolean z10) {
        n.f().b(z10);
    }

    public void bindService(Runnable runnable) {
        if (f()) {
            runnable.run();
        } else {
            n.f().n(w7.c.a(), runnable);
        }
    }
}
