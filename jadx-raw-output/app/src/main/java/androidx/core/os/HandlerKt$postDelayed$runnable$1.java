package androidx.core.os;

import mj.r;

/* JADX INFO: compiled from: Handler.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class HandlerKt$postDelayed$runnable$1 implements Runnable {
    public final /* synthetic */ bk.a<r> $action;

    public HandlerKt$postDelayed$runnable$1(bk.a<r> aVar) {
        this.$action = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
