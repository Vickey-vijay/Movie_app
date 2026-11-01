package kotlinx.coroutines.channels;

import bk.q;
import kotlin.coroutines.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import mj.r;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class BufferedChannel$bindCancellationFunResult$1<E> extends FunctionReferenceImpl implements q<Throwable, a<? extends E>, d, r> {
    public BufferedChannel$bindCancellationFunResult$1(Object obj) {
        super(3, obj, BufferedChannel.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    @Override // bk.q
    public /* bridge */ /* synthetic */ r invoke(Throwable th2, Object obj, d dVar) {
        m3470invoke5_sEAP8(th2, ((a) obj).k(), dVar);
        return r.f64562a;
    }

    /* JADX INFO: renamed from: invoke-5_sEAP8, reason: not valid java name */
    public final void m3470invoke5_sEAP8(Throwable th2, Object obj, d dVar) {
        ((BufferedChannel) this.receiver).E0(th2, obj, dVar);
    }
}
