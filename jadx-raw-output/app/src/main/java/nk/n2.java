package nk;

/* JADX INFO: compiled from: Unconfined.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class n2 extends h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n2 f64808b = new n2();

    @Override // nk.h0
    public boolean isDispatchNeeded(kotlin.coroutines.d dVar) {
        return false;
    }

    @Override // nk.h0
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // nk.h0
    public void dispatch(kotlin.coroutines.d dVar, Runnable runnable) {
        r2 r2Var = (r2) dVar.get(r2.f64819c);
        if (r2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        r2Var.f64820b = true;
    }

    @Override // nk.h0
    public h0 limitedParallelism(int i10, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }
}
