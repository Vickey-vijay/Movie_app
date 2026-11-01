package nk;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class w1<T> extends q0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rj.c<mj.r> f64835e;

    public w1(kotlin.coroutines.d dVar, bk.p<? super l0, ? super rj.c<? super T>, ? extends Object> pVar) {
        super(dVar, false);
        this.f64835e = IntrinsicsKt__IntrinsicsJvmKt.a(pVar, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void O0() throws Throwable {
        tk.a.c(this.f64835e, this);
    }
}
