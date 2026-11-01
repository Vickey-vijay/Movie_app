package qk;

import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class n<T> implements u<T>, c, rk.j<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u<T> f66590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.g f66591c;

    @Override // qk.p, qk.c
    public Object collect(d<? super T> dVar, rj.c<?> cVar) {
        return this.f66590b.collect(dVar, cVar);
    }

    @Override // qk.u
    public T getValue() {
        return this.f66590b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(u<? extends T> uVar, kotlinx.coroutines.g gVar) {
        this.f66590b = uVar;
        this.f66591c = gVar;
    }

    @Override // rk.j
    public c<T> b(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        return v.d(this, dVar, i10, bufferOverflow);
    }
}
