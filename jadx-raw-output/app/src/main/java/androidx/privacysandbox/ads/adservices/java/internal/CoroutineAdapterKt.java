package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import bk.l;
import ck.p;
import java.util.concurrent.CancellationException;
import mj.r;
import nk.p0;
import q5.i;

/* JADX INFO: compiled from: CoroutineAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CoroutineAdapterKt {
    public static final <T> i<T> asListenableFuture(final p0<? extends T> p0Var, final Object obj) {
        p.j(p0Var, "<this>");
        i<T> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.privacysandbox.ads.adservices.java.internal.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return CoroutineAdapterKt.asListenableFuture$lambda$0(p0Var, obj, completer);
            }
        });
        p.i(future, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return future;
    }

    public static /* synthetic */ i asListenableFuture$default(p0 p0Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return asListenableFuture(p0Var, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object asListenableFuture$lambda$0(final p0 p0Var, Object obj, final CallbackToFutureAdapter.Completer completer) {
        p.j(p0Var, "$this_asListenableFuture");
        p.j(completer, "completer");
        p0Var.F(new l<Throwable, r>() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
                invoke2(th2);
                return r.f64562a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                if (th2 == null) {
                    completer.set((T) p0Var.l());
                } else if (th2 instanceof CancellationException) {
                    completer.setCancelled();
                } else {
                    completer.setException(th2);
                }
            }
        });
        return obj;
    }
}
