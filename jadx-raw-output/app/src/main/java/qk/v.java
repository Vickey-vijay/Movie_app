package qk;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.eclipse.jetty.util.security.Constraint;
import sk.d0;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f66600a = new d0(Constraint.NONE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f66601b = new d0("PENDING");

    public static final <T> c<T> d(u<? extends T> uVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 2) {
            z10 = true;
        }
        return ((z10 || i10 == -2) && bufferOverflow == BufferOverflow.DROP_OLDEST) ? uVar : q.e(uVar, dVar, i10, bufferOverflow);
    }

    public static final <T> l<T> a(T t10) {
        if (t10 == null) {
            t10 = (T) rk.m.f66793a;
        }
        return new StateFlowImpl(t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(l<T> lVar, bk.l<? super T, ? extends T> lVar2) {
        a.i iVar;
        do {
            iVar = (Object) lVar.getValue();
        } while (!lVar.a(iVar, lVar2.invoke(iVar)));
    }
}
