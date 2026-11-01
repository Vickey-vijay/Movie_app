package kotlinx.coroutines.flow;

import bk.p;
import bk.q;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import mj.r;
import qk.c;
import qk.d;
import qk.e;
import sk.e0;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class FlowKt__MergeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f63113a = e0.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    public static final <T, R> c<R> a(c<? extends T> cVar, p<? super T, ? super rj.c<? super R>, ? extends Object> pVar) {
        return e.I(cVar, new FlowKt__MergeKt$mapLatest$1(pVar, null));
    }

    public static final <T, R> c<R> b(c<? extends T> cVar, q<? super d<? super R>, ? super T, ? super rj.c<? super r>, ? extends Object> qVar) {
        return new ChannelFlowTransformLatest(qVar, cVar, null, 0, null, 28, null);
    }
}
