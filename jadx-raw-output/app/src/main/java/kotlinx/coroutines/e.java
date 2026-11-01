package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import nk.a0;
import nk.v1;
import sk.z;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class e<T> extends z<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f63083f = AtomicIntegerFieldUpdater.newUpdater(e.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public e(kotlin.coroutines.d dVar, rj.c<? super T> cVar) {
        super(dVar, cVar);
    }

    @Override // sk.z, kotlinx.coroutines.JobSupport
    public void V(Object obj) {
        e1(obj);
    }

    @Override // sk.z, kotlinx.coroutines.a
    public void e1(Object obj) {
        if (l1()) {
            return;
        }
        sk.h.b(IntrinsicsKt__IntrinsicsJvmKt.c(this.f71995e), a0.a(obj, this.f71995e));
    }

    public final Object j1() {
        if (m1()) {
            return sj.a.f();
        }
        Object objH = v1.h(t0());
        if (!(objH instanceof nk.z)) {
            return objH;
        }
        throw ((nk.z) objH).f64844a;
    }

    public final boolean l1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f63083f;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f63083f.compareAndSet(this, 0, 2));
        return true;
    }

    public final boolean m1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f63083f;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f63083f.compareAndSet(this, 0, 1));
        return true;
    }
}
