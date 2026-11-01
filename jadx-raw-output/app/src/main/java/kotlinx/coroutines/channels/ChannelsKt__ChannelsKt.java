package kotlinx.coroutines.channels;

import mj.r;
import nk.i;
import pk.q;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class ChannelsKt__ChannelsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object a(q<? super E> qVar, E e10) {
        Object objN = qVar.n(e10);
        if (!(objN instanceof a.c)) {
            return a.f63077b.c(r.f64562a);
        }
        return ((a) i.b(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(qVar, e10, null), 1, null)).k();
    }
}
