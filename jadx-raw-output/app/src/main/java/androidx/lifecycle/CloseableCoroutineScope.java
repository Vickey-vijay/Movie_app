package androidx.lifecycle;

import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.Closeable;
import kotlinx.coroutines.JobKt__JobKt;
import nk.l0;

/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class CloseableCoroutineScope implements Closeable, l0 {
    private final kotlin.coroutines.d coroutineContext;

    public CloseableCoroutineScope(kotlin.coroutines.d dVar) {
        p.j(dVar, GAMConfig.KEY_CONTEXT);
        this.coroutineContext = dVar;
    }

    @Override // nk.l0
    public kotlin.coroutines.d getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        JobKt__JobKt.d(getCoroutineContext(), null, 1, null);
    }
}
