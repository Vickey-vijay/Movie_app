package dp;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f52279b;

    public x(n nVar) {
        this.f52279b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f52279b;
        if (nVar.I) {
            return;
        }
        nVar.J = true;
        nVar.a("视频缓冲超时");
    }
}
