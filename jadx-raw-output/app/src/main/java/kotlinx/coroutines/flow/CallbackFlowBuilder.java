package kotlinx.coroutines.flow;

import bk.p;
import ck.i;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import mj.r;
import pk.n;
import qk.b;
import rj.c;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class CallbackFlowBuilder<T> extends b<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p<n<? super T>, c<? super r>, Object> f63085f;

    public /* synthetic */ CallbackFlowBuilder(p pVar, d dVar, int i10, BufferOverflow bufferOverflow, int i11, i iVar) {
        this(pVar, (i11 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk.b, kotlinx.coroutines.flow.internal.ChannelFlow
    public Object e(n<? super T> nVar, c<? super r> cVar) throws Throwable {
        CallbackFlowBuilder$collectTo$1 callbackFlowBuilder$collectTo$1;
        if (cVar instanceof CallbackFlowBuilder$collectTo$1) {
            callbackFlowBuilder$collectTo$1 = (CallbackFlowBuilder$collectTo$1) cVar;
            int i10 = callbackFlowBuilder$collectTo$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                callbackFlowBuilder$collectTo$1.label = i10 - Integer.MIN_VALUE;
            } else {
                callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, cVar);
            }
        } else {
            callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, cVar);
        }
        Object obj = callbackFlowBuilder$collectTo$1.result;
        Object objF = sj.a.f();
        int i11 = callbackFlowBuilder$collectTo$1.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            callbackFlowBuilder$collectTo$1.L$0 = nVar;
            callbackFlowBuilder$collectTo$1.label = 1;
            if (super.e(nVar, callbackFlowBuilder$collectTo$1) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (n) callbackFlowBuilder$collectTo$1.L$0;
            kotlin.c.b(obj);
        }
        if (nVar.w()) {
            return r.f64562a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // qk.b, kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> f(d dVar, int i10, BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.f63085f, dVar, i10, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallbackFlowBuilder(p<? super n<? super T>, ? super c<? super r>, ? extends Object> pVar, d dVar, int i10, BufferOverflow bufferOverflow) {
        super(pVar, dVar, i10, bufferOverflow);
        this.f63085f = pVar;
    }
}
