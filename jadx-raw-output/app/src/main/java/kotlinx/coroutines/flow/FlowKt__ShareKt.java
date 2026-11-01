package kotlinx.coroutines.flow;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.g;
import mj.r;
import nk.h;
import nk.l0;
import pk.d;
import qk.c;
import qk.k;
import qk.l;
import qk.m;
import qk.n;
import qk.p;
import qk.q;
import qk.s;
import qk.u;
import qk.v;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class FlowKt__ShareKt {
    public static final <T> u<T> g(c<? extends T> cVar, l0 l0Var, a aVar, T t10) {
        s sVarC = c(cVar, 1);
        l lVarA = v.a(t10);
        return new n(lVarA, d(l0Var, sVarC.f66599d, sVarC.f66596a, lVarA, aVar, t10));
    }

    public static final <T> p<T> a(k<T> kVar) {
        return new m(kVar, null);
    }

    public static final <T> u<T> b(l<T> lVar) {
        return new n(lVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    public static final <T> s<T> c(c<? extends T> cVar, int i10) {
        ChannelFlow channelFlow;
        c<T> cVarJ;
        int iD = ik.k.d(i10, d.G8.a()) - i10;
        if (!(cVar instanceof ChannelFlow) || (cVarJ = (channelFlow = (ChannelFlow) cVar).j()) == null) {
            return new s<>(cVar, iD, BufferOverflow.SUSPEND, EmptyCoroutineContext.INSTANCE);
        }
        int i11 = channelFlow.f63156c;
        if (i11 != -3 && i11 != -2 && i11 != 0) {
            iD = i11;
        } else if (channelFlow.f63157d == BufferOverflow.SUSPEND) {
            if (i11 == 0) {
                iD = 0;
            }
        } else if (i10 == 0) {
            iD = 1;
        } else {
            iD = 0;
        }
        return new s<>(cVarJ, iD, channelFlow.f63157d, channelFlow.f63155b);
    }

    public static final <T> g d(l0 l0Var, kotlin.coroutines.d dVar, c<? extends T> cVar, k<T> kVar, a aVar, T t10) {
        return h.c(l0Var, dVar, ck.p.e(aVar, a.f63151a.a()) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(aVar, cVar, kVar, t10, null));
    }

    public static final <T> p<T> e(p<? extends T> pVar, bk.p<? super qk.d<? super T>, ? super rj.c<? super r>, ? extends Object> pVar2) {
        return new SubscribedSharedFlow(pVar, pVar2);
    }

    public static final <T> p<T> f(c<? extends T> cVar, l0 l0Var, a aVar, int i10) {
        s sVarC = c(cVar, i10);
        k kVarA = q.a(i10, sVarC.f66597b, sVarC.f66598c);
        return new m(kVarA, d(l0Var, sVarC.f66599d, sVarC.f66596a, kVarA, aVar, q.f66593a));
    }
}
