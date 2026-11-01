package k;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f62009b;

    public g0(y yVar) {
        this.f62009b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.f62009b;
        if (yVar.F) {
            return;
        }
        yVar.v("load ad time out!");
        this.f62009b.G = true;
    }
}
