package nk;

import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class m2<U, T extends U> extends sk.z<T> implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f64803f;

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.JobSupport
    public String G0() {
        return super.G0() + "(timeMillis=" + this.f64803f + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        Y(TimeoutKt.a(this.f64803f, s0.c(getContext()), this));
    }

    public m2(long j10, rj.c<? super U> cVar) {
        super(cVar.getContext(), cVar);
        this.f64803f = j10;
    }
}
