package pk;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: compiled from: ChannelCoroutine.kt */
/* JADX INFO: loaded from: classes11.dex */
public class e<E> extends kotlinx.coroutines.a<mj.r> implements d<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d<E> f66157e;

    @Override // pk.q
    public void C(bk.l<? super Throwable, mj.r> lVar) {
        this.f66157e.C(lVar);
    }

    @Override // pk.q
    public boolean J(Throwable th2) {
        return this.f66157e.J(th2);
    }

    @Override // pk.p
    public Object L(rj.c<? super kotlinx.coroutines.channels.a<? extends E>> cVar) {
        Object objL = this.f66157e.L(cVar);
        sj.a.f();
        return objL;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void a0(Throwable th2) {
        CancellationException cancellationExceptionX0 = JobSupport.X0(this, th2, null, 1, null);
        this.f66157e.a(cancellationExceptionX0);
        Y(cancellationExceptionX0);
    }

    @Override // pk.p
    public Object e(rj.c<? super E> cVar) {
        return this.f66157e.e(cVar);
    }

    public final d<E> i1() {
        return this;
    }

    @Override // pk.p
    public f<E> iterator() {
        return this.f66157e.iterator();
    }

    @Override // pk.q
    public Object n(E e10) {
        return this.f66157e.n(e10);
    }

    @Override // pk.p
    public Object q() {
        return this.f66157e.q();
    }

    @Override // pk.q
    public Object u(E e10, rj.c<? super mj.r> cVar) {
        return this.f66157e.u(e10, cVar);
    }

    @Override // pk.q
    public boolean w() {
        return this.f66157e.w();
    }

    public final d<E> j1() {
        return this.f66157e;
    }

    public e(kotlin.coroutines.d dVar, d<E> dVar2, boolean z10, boolean z11) {
        super(dVar, z10, z11);
        this.f66157e = dVar2;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.g
    public final void a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(e0(), null, this);
        }
        a0(cancellationException);
    }
}
