package qk;

import kotlinx.coroutines.flow.SharedFlowImpl;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class r extends rk.c<SharedFlowImpl<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f66594a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rj.c<? super mj.r> f66595b;

    @Override // rk.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(SharedFlowImpl<?> sharedFlowImpl) {
        if (this.f66594a >= 0) {
            return false;
        }
        this.f66594a = sharedFlowImpl.X();
        return true;
    }

    @Override // rk.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public rj.c<mj.r>[] b(SharedFlowImpl<?> sharedFlowImpl) {
        long j10 = this.f66594a;
        this.f66594a = -1L;
        this.f66595b = null;
        return sharedFlowImpl.W(j10);
    }
}
