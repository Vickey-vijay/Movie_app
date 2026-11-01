package qk;

import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class m<T> implements p<T>, c, rk.j<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p<T> f66588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.g f66589c;

    @Override // qk.p, qk.c
    public Object collect(d<? super T> dVar, rj.c<?> cVar) {
        return this.f66588b.collect(dVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(p<? extends T> pVar, kotlinx.coroutines.g gVar) {
        this.f66588b = pVar;
        this.f66589c = gVar;
    }

    @Override // rk.j
    public c<T> b(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        return q.e(this, dVar, i10, bufferOverflow);
    }
}
