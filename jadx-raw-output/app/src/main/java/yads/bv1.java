package yads;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class bv1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static bv1 f75973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f75974c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj.i f75975a = new nj.i();

    public final void a(du1 du1Var, String str, String str2) {
        if (eu1.f77192a.a()) {
            zu1 zu1Var = new zu1(System.currentTimeMillis(), du1Var.name(), str, str2);
            synchronized (f75974c) {
                if (this.f75975a.size() > 5000) {
                    this.f75975a.removeFirst();
                }
                this.f75975a.add(zu1Var);
            }
        }
    }

    public final List b() {
        List listO0;
        synchronized (f75974c) {
            listO0 = nj.b0.O0(this.f75975a);
        }
        return listO0;
    }

    public final void a() {
        synchronized (f75974c) {
            this.f75975a.clear();
            mj.r rVar = mj.r.f64562a;
        }
    }
}
