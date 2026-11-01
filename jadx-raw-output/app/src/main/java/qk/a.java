package qk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import nk.l0;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a<T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66581g = AtomicIntegerFieldUpdater.newUpdater(a.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pk.p<T> f66582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f66583f;

    public /* synthetic */ a(pk.p pVar, boolean z10, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow, int i11, ck.i iVar) {
        this(pVar, z10, (i11 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String c() {
        return "channel=" + this.f66582e;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, qk.c
    public Object collect(d<? super T> dVar, rj.c<? super mj.r> cVar) throws Throwable {
        if (this.f63156c != -3) {
            Object objCollect = super.collect(dVar, cVar);
            return objCollect == sj.a.f() ? objCollect : mj.r.f64562a;
        }
        o();
        Object objC = FlowKt__ChannelsKt.c(dVar, this.f66582e, this.f66583f, cVar);
        return objC == sj.a.f() ? objC : mj.r.f64562a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object e(pk.n<? super T> nVar, rj.c<? super mj.r> cVar) throws Throwable {
        Object objC = FlowKt__ChannelsKt.c(new rk.q(nVar), this.f66582e, this.f66583f, cVar);
        return objC == sj.a.f() ? objC : mj.r.f64562a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> f(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        return new a(this.f66582e, this.f66583f, dVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public c<T> j() {
        return new a(this.f66582e, this.f66583f, null, 0, null, 28, null);
    }

    public final void o() {
        if (this.f66583f) {
            if (!(f66581g.getAndSet(this, 1) != 1)) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public pk.p<T> m(l0 l0Var) {
        o();
        if (this.f63156c == -3) {
            return this.f66582e;
        }
        return super.m(l0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(pk.p<? extends T> pVar, boolean z10, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        super(dVar, i10, bufferOverflow);
        this.f66582e = pVar;
        this.f66583f = z10;
    }
}
