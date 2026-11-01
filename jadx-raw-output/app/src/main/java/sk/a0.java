package sk;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import nk.b2;
import sk.a0;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a0<S extends a0<S>> extends b<S> implements b2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f71935e = AtomicIntegerFieldUpdater.newUpdater(a0.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f71936d;

    public abstract int r();

    public abstract void s(int i10, Throwable th2, kotlin.coroutines.d dVar);

    public a0(long j10, S s10, int i10) {
        super(s10);
        this.f71936d = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // sk.b
    public boolean k() {
        if (f71935e.get(this) == r() && !l()) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if (f71935e.addAndGet(this, SupportMenu.CATEGORY_MASK) == r() && !l()) {
            return true;
        }
        return false;
    }

    public final void t() {
        if (f71935e.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        boolean z10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f71935e;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == r() && !l()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
