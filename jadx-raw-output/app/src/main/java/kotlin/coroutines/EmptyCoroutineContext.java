package kotlin.coroutines;

import bk.p;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.Serializable;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptyCoroutineContext implements d, Serializable {
    public static final EmptyCoroutineContext INSTANCE = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, p<? super R, ? super d.b, ? extends R> pVar) {
        ck.p.j(pVar, "operation");
        return r10;
    }

    @Override // kotlin.coroutines.d
    public <E extends d.b> E get(d.c<E> cVar) {
        ck.p.j(cVar, C3426d4.i.W);
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.d
    public d minusKey(d.c<?> cVar) {
        ck.p.j(cVar, C3426d4.i.W);
        return this;
    }

    @Override // kotlin.coroutines.d
    public d plus(d dVar) {
        ck.p.j(dVar, GAMConfig.KEY_CONTEXT);
        return dVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    private final Object readResolve() {
        return INSTANCE;
    }
}
