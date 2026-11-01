package xe;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f74467b;

    public x(t tVar) {
        this.f74467b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar = this.f74467b;
        if (tVar.E) {
            return;
        }
        tVar.v("load ad time out!");
        this.f74467b.F = true;
    }
}
