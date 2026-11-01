package androidx.work;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import nk.l;
import q5.i;
import rj.c;

/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"R", "Lmj/r;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class ListenableFutureKt$await$2$1 implements Runnable {
    public final /* synthetic */ l<R> $cancellableContinuation;
    public final /* synthetic */ i<R> $this_await;

    /* JADX WARN: Multi-variable type inference failed */
    public ListenableFutureKt$await$2$1(l<? super R> lVar, i<R> iVar) {
        this.$cancellableContinuation = lVar;
        this.$this_await = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.$cancellableContinuation.resumeWith(Result.m3458constructorimpl(this.$this_await.get()));
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                cause = th2;
            }
            if (th2 instanceof CancellationException) {
                this.$cancellableContinuation.j(cause);
                return;
            }
            c cVar = this.$cancellableContinuation;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(cause)));
        }
    }
}
