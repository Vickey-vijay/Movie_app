package k4;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k3.v0;

/* JADX INFO: compiled from: BaseMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<r.b> f62365b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<r.b> f62366c = new HashSet<>(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0.a f62367d = new b0.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Looper f62368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public v0 f62369f;

    public final b0.a o(r.a aVar, long j10) {
        g5.a.a(aVar != null);
        return this.f62367d.P(0, aVar, j10);
    }

    public void p() {
    }

    public void q() {
    }

    public abstract void s(@Nullable e5.q qVar);

    public abstract void u();

    @Override // k4.r
    public final void a(r.b bVar) {
        boolean z10 = !this.f62366c.isEmpty();
        this.f62366c.remove(bVar);
        if (z10 && this.f62366c.isEmpty()) {
            p();
        }
    }

    @Override // k4.r
    public final void b(r.b bVar) {
        this.f62365b.remove(bVar);
        if (!this.f62365b.isEmpty()) {
            a(bVar);
            return;
        }
        this.f62368e = null;
        this.f62369f = null;
        this.f62366c.clear();
        u();
    }

    @Override // k4.r
    public final void d(b0 b0Var) {
        this.f62367d.M(b0Var);
    }

    @Override // k4.r
    public final void i(Handler handler, b0 b0Var) {
        this.f62367d.j(handler, b0Var);
    }

    @Override // k4.r
    public final void l(r.b bVar) {
        g5.a.e(this.f62368e);
        boolean zIsEmpty = this.f62366c.isEmpty();
        this.f62366c.add(bVar);
        if (zIsEmpty) {
            q();
        }
    }

    public final b0.a m(int i10, @Nullable r.a aVar, long j10) {
        return this.f62367d.P(i10, aVar, j10);
    }

    public final b0.a n(@Nullable r.a aVar) {
        return this.f62367d.P(0, aVar, 0L);
    }

    public final boolean r() {
        return !this.f62366c.isEmpty();
    }

    public final void t(v0 v0Var) {
        this.f62369f = v0Var;
        Iterator<r.b> it = this.f62365b.iterator();
        while (it.hasNext()) {
            it.next().c(this, v0Var);
        }
    }

    @Override // k4.r
    public final void e(r.b bVar, @Nullable e5.q qVar) {
        boolean z10;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f62368e;
        if (looper != null && looper != looperMyLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        g5.a.a(z10);
        v0 v0Var = this.f62369f;
        this.f62365b.add(bVar);
        if (this.f62368e == null) {
            this.f62368e = looperMyLooper;
            this.f62366c.add(bVar);
            s(qVar);
        } else if (v0Var != null) {
            l(bVar);
            bVar.c(this, v0Var);
        }
    }
}
