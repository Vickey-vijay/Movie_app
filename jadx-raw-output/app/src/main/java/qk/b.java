package qk;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes8.dex */
public class b<T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bk.p<pk.n<? super T>, rj.c<? super mj.r>, Object> f66584e;

    public /* synthetic */ b(bk.p pVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow, int i11, ck.i iVar) {
        this(pVar, (i11 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object e(pk.n<? super T> nVar, rj.c<? super mj.r> cVar) {
        return n(this, nVar, cVar);
    }

    public static /* synthetic */ <T> Object n(b<T> bVar, pk.n<? super T> nVar, rj.c<? super mj.r> cVar) {
        Object objMo1invoke = bVar.f66584e.mo1invoke(nVar, cVar);
        return objMo1invoke == sj.a.f() ? objMo1invoke : mj.r.f64562a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> f(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        return new b(this.f66584e, dVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return "block[" + this.f66584e + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(bk.p<? super pk.n<? super T>, ? super rj.c<? super mj.r>, ? extends Object> pVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        super(dVar, i10, bufferOverflow);
        this.f66584e = pVar;
    }
}
