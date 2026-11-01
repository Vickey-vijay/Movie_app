package rk;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperator;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class e<T> extends ChannelFlowOperator<T, T> {
    public /* synthetic */ e(qk.c cVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow, int i11, ck.i iVar) {
        this(cVar, (i11 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> f(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        return new e(this.f63158e, dVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public qk.c<T> j() {
        return (qk.c<T>) this.f63158e;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public Object q(qk.d<? super T> dVar, rj.c<? super mj.r> cVar) {
        Object objCollect = this.f63158e.collect((qk.d<? super S>) dVar, cVar);
        return objCollect == sj.a.f() ? objCollect : mj.r.f64562a;
    }

    public e(qk.c<? extends T> cVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        super(cVar, dVar, i10, bufferOverflow);
    }
}
