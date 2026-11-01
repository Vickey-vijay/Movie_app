package nk;

import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u1 extends LockFreeLinkedListNode implements y0, o1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public JobSupport f64823e;

    @Override // nk.o1
    public z1 b() {
        return null;
    }

    @Override // nk.o1
    public boolean isActive() {
        return true;
    }

    public abstract boolean u();

    public abstract void v(Throwable th2);

    public final JobSupport t() {
        JobSupport jobSupport = this.f64823e;
        if (jobSupport != null) {
            return jobSupport;
        }
        ck.p.B("job");
        return null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return m0.a(this) + '@' + m0.b(this) + "[job@" + m0.b(t()) + ']';
    }

    public final void w(JobSupport jobSupport) {
        this.f64823e = jobSupport;
    }

    @Override // nk.y0
    public void dispose() {
        t().S0(this);
    }
}
