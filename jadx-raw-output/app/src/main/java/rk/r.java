package rk;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class r<T> implements rj.c<T>, tj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rj.c<T> f66798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlin.coroutines.d f66799c;

    @Override // tj.c
    public tj.c getCallerFrame() {
        rj.c<T> cVar = this.f66798b;
        if (cVar instanceof tj.c) {
            return (tj.c) cVar;
        }
        return null;
    }

    @Override // rj.c
    public kotlin.coroutines.d getContext() {
        return this.f66799c;
    }

    @Override // rj.c
    public void resumeWith(Object obj) {
        this.f66798b.resumeWith(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(rj.c<? super T> cVar, kotlin.coroutines.d dVar) {
        this.f66798b = cVar;
        this.f66799c = dVar;
    }
}
