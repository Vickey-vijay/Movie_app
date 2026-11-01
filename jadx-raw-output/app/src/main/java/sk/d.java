package sk;

/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements nk.l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.coroutines.d f71942b;

    @Override // nk.l0
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f71942b;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }

    public d(kotlin.coroutines.d dVar) {
        this.f71942b = dVar;
    }
}
