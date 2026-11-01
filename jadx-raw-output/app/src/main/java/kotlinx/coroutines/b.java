package kotlinx.coroutines;

import bk.l;
import mj.r;
import nk.b2;
import nk.m0;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface b extends b2 {

    /* JADX INFO: compiled from: CancellableContinuationImpl.kt */
    public static final class a implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l<Throwable, r> f63032b;

        @Override // kotlinx.coroutines.b
        public void a(Throwable th2) {
            this.f63032b.invoke(th2);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + m0.a(this.f63032b) + '@' + m0.b(this) + ']';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Throwable, r> lVar) {
            this.f63032b = lVar;
        }
    }

    void a(Throwable th2);
}
