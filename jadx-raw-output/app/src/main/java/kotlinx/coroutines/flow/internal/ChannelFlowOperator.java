package kotlinx.coroutines.flow.internal;

import ck.p;
import kotlinx.coroutines.channels.BufferOverflow;
import mj.r;
import nk.f0;
import pk.n;
import qk.c;
import qk.d;
import rk.q;
import sj.a;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c<S> f63158e;

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, qk.c
    public Object collect(d<? super T> dVar, rj.c<? super r> cVar) {
        return n(this, dVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object e(n<? super T> nVar, rj.c<? super r> cVar) {
        return o(this, nVar, cVar);
    }

    public abstract Object q(d<? super T> dVar, rj.c<? super r> cVar);

    public static /* synthetic */ <S, T> Object n(ChannelFlowOperator<S, T> channelFlowOperator, d<? super T> dVar, rj.c<? super r> cVar) {
        if (channelFlowOperator.f63156c == -3) {
            kotlin.coroutines.d context = cVar.getContext();
            kotlin.coroutines.d dVarJ = f0.j(context, channelFlowOperator.f63155b);
            if (p.e(dVarJ, context)) {
                Object objQ = channelFlowOperator.q(dVar, cVar);
                return objQ == a.f() ? objQ : r.f64562a;
            }
            kotlin.coroutines.c.b bVar = kotlin.coroutines.c.D8;
            if (p.e(dVarJ.get(bVar), context.get(bVar))) {
                Object objP = channelFlowOperator.p(dVar, dVarJ, cVar);
                return objP == a.f() ? objP : r.f64562a;
            }
        }
        Object objCollect = super.collect(dVar, cVar);
        return objCollect == a.f() ? objCollect : r.f64562a;
    }

    public static /* synthetic */ <S, T> Object o(ChannelFlowOperator<S, T> channelFlowOperator, n<? super T> nVar, rj.c<? super r> cVar) {
        Object objQ = channelFlowOperator.q(new q(nVar), cVar);
        return objQ == a.f() ? objQ : r.f64562a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return this.f63158e + " -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowOperator(c<? extends S> cVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        super(dVar, i10, bufferOverflow);
        this.f63158e = cVar;
    }

    public final Object p(d<? super T> dVar, kotlin.coroutines.d dVar2, rj.c<? super r> cVar) {
        return rk.d.c(dVar2, rk.d.d(dVar, cVar.getContext()), null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), cVar, 4, null);
    }
}
