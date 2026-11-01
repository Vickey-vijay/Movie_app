package yads;

import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class s92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f82552a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f82553b = new WeakHashMap();

    public final boolean a() {
        boolean z10;
        synchronized (this.f82552a) {
            z10 = !this.f82553b.isEmpty();
        }
        return z10;
    }

    public final void b() {
        ArrayList<ld3> arrayList;
        synchronized (this.f82552a) {
            arrayList = new ArrayList(this.f82553b.keySet());
            this.f82553b.clear();
            mj.r rVar = mj.r.f64562a;
        }
        for (ld3 ld3Var : arrayList) {
            if (ld3Var != null) {
                ld3Var.a();
            }
        }
    }

    public final void a(ld3 ld3Var) {
        synchronized (this.f82552a) {
            this.f82553b.put(ld3Var, null);
            mj.r rVar = mj.r.f64562a;
        }
    }

    public final void b(ld3 ld3Var) {
        synchronized (this.f82552a) {
            this.f82553b.remove(ld3Var);
        }
    }
}
