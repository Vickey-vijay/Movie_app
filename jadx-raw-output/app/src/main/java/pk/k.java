package pk;

import java.util.concurrent.CancellationException;
import nk.h1;

/* JADX INFO: compiled from: Channels.common.kt */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k {
    public static final void a(p<?> pVar, Throwable th2) {
        CancellationException cancellationExceptionA = null;
        if (th2 != null) {
            cancellationExceptionA = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = h1.a("Channel was consumed, consumer had failed", th2);
            }
        }
        pVar.a(cancellationExceptionA);
    }
}
