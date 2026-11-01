package pk;

import nk.j0;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class m<E> extends e<E> implements n<E> {
    public m(kotlin.coroutines.d dVar, d<E> dVar2) {
        super(dVar, dVar2, true, true);
    }

    @Override // kotlinx.coroutines.a
    public void f1(Throwable th2, boolean z10) {
        if (!j1().J(th2) && !z10) {
            j0.a(getContext(), th2);
        }
    }

    @Override // pk.n
    public /* bridge */ /* synthetic */ q h() {
        return i1();
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.JobSupport, kotlinx.coroutines.g
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.a
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public void g1(mj.r rVar) {
        q.a.a(j1(), null, 1, null);
    }
}
