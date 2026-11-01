package kotlinx.coroutines;

import bk.p;
import nk.a0;
import nk.f0;
import nk.j0;
import nk.l0;
import nk.m0;
import nk.v1;
import nk.z;

/* JADX INFO: compiled from: AbstractCoroutine.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a<T> extends JobSupport implements rj.c<T>, l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlin.coroutines.d f63031d;

    public void f1(Throwable th2, boolean z10) {
    }

    public void g1(T t10) {
    }

    @Override // kotlinx.coroutines.JobSupport
    public String G0() {
        String strG = f0.g(this.f63031d);
        if (strG == null) {
            return super.G0();
        }
        return '\"' + strG + "\":" + super.G0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.JobSupport
    public final void N0(Object obj) {
        if (!(obj instanceof z)) {
            g1(obj);
        } else {
            z zVar = (z) obj;
            f1(zVar.f64844a, zVar.a());
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    public String e0() {
        return m0.a(this) + " was cancelled";
    }

    @Override // rj.c
    public final kotlin.coroutines.d getContext() {
        return this.f63031d;
    }

    @Override // nk.l0
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f63031d;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void x0(Throwable th2) {
        j0.a(this.f63031d, th2);
    }

    public a(kotlin.coroutines.d dVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            y0((g) dVar.get(g.E8));
        }
        this.f63031d = dVar.plus(this);
    }

    public void e1(Object obj) {
        V(obj);
    }

    public final <R> void h1(CoroutineStart coroutineStart, R r10, p<? super R, ? super rj.c<? super T>, ? extends Object> pVar) {
        coroutineStart.invoke(pVar, r10, this);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.g
    public boolean isActive() {
        return super.isActive();
    }

    @Override // rj.c
    public final void resumeWith(Object obj) {
        Object objF0 = F0(a0.b(obj));
        if (objF0 == v1.f64826b) {
            return;
        }
        e1(objF0);
    }
}
