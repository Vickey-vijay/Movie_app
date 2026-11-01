package sk;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes9.dex */
public class p<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f71975a = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public p(boolean z10) {
        this._cur$volatile = new q(8, z10);
    }

    public final boolean a(E e10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71975a;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            int iA = qVar.a(e10);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                if (iA == 2) {
                    return false;
                }
            } else {
                androidx.concurrent.futures.a.a(f71975a, this, qVar, qVar.l());
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71975a;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            if (qVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.a.a(f71975a, this, qVar, qVar.l());
            }
        }
    }

    public final int c() {
        return ((q) f71975a.get(this)).g();
    }

    public final E e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71975a;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) qVar.m();
            if (e10 != q.f71979h) {
                return e10;
            }
            androidx.concurrent.futures.a.a(f71975a, this, qVar, qVar.l());
        }
    }
}
