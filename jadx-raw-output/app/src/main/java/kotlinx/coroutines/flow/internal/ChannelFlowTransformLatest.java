package kotlinx.coroutines.flow.internal;

import bk.q;
import ck.i;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import mj.r;
import qk.d;
import rj.c;
import sj.a;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ChannelFlowTransformLatest<T, R> extends ChannelFlowOperator<T, R> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q<d<? super R>, T, c<? super r>, Object> f63159f;

    public /* synthetic */ ChannelFlowTransformLatest(q qVar, qk.c cVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow, int i11, i iVar) {
        this(qVar, cVar, (i11 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<R> f(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.f63159f, this.f63158e, dVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public Object q(d<? super R> dVar, c<? super r> cVar) {
        Object objE = kotlinx.coroutines.d.e(new ChannelFlowTransformLatest$flowCollect$3(this, dVar, null), cVar);
        return objE == a.f() ? objE : r.f64562a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest(q<? super d<? super R>, ? super T, ? super c<? super r>, ? extends Object> qVar, qk.c<? extends T> cVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        super(cVar, dVar, i10, bufferOverflow);
        this.f63159f = qVar;
    }
}
