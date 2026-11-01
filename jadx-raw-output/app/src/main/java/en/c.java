package en;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ym.f;

/* JADX INFO: compiled from: ShutdownThread.java */
/* JADX INFO: loaded from: classes9.dex */
public class c extends Thread {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zm.c f52712d = zm.b.a(c.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f52713e = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f52714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<f> f52715c = new CopyOnWriteArrayList();

    public final synchronized void d() {
        try {
            if (!this.f52714b) {
                Runtime.getRuntime().addShutdownHook(this);
            }
            this.f52714b = true;
        } catch (Exception e10) {
            zm.c cVar = f52712d;
            cVar.h(e10);
            cVar.k("shutdown already commenced", new Object[0]);
        }
    }

    public final synchronized void f() {
        try {
            this.f52714b = false;
            Runtime.getRuntime().removeShutdownHook(this);
        } catch (Exception e10) {
            zm.c cVar = f52712d;
            cVar.h(e10);
            cVar.i("shutdown already commenced", new Object[0]);
        }
    }

    public static synchronized void a(f fVar) {
        c cVar = f52713e;
        cVar.f52715c.remove(fVar);
        if (cVar.f52715c.size() == 0) {
            cVar.f();
        }
    }

    public static c c() {
        return f52713e;
    }

    public static synchronized void e(f... fVarArr) {
        c cVar = f52713e;
        cVar.f52715c.addAll(Arrays.asList(fVarArr));
        if (cVar.f52715c.size() > 0) {
            cVar.d();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        for (f fVar : f52713e.f52715c) {
            try {
                if (fVar.isStarted()) {
                    fVar.stop();
                    f52712d.i("Stopped {}", fVar);
                }
                if (fVar instanceof ym.d) {
                    ((ym.d) fVar).destroy();
                    f52712d.i("Destroyed {}", fVar);
                }
            } catch (Exception e10) {
                f52712d.a(e10);
            }
        }
    }
}
