package p4;

import android.util.SparseArray;
import g5.g0;

/* JADX INFO: compiled from: TimestampAdjusterProvider.java */
/* JADX INFO: loaded from: classes8.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<g0> f65998a = new SparseArray<>();

    public g0 a(int i10) {
        g0 g0Var = this.f65998a.get(i10);
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0(Long.MAX_VALUE);
        this.f65998a.put(i10, g0Var2);
        return g0Var2;
    }

    public void b() {
        this.f65998a.clear();
    }
}
