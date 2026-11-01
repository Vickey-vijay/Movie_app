package pk;

import nk.q2;
import sk.a0;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class o<E> implements q2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.c<kotlinx.coroutines.channels.a<? extends E>> f66160b;

    @Override // nk.q2
    public void c(a0<?> a0Var, int i10) {
        this.f66160b.c(a0Var, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(kotlinx.coroutines.c<? super kotlinx.coroutines.channels.a<? extends E>> cVar) {
        this.f66160b = cVar;
    }
}
