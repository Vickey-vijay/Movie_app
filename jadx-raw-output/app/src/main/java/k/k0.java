package k;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f62015b;

    public k0(x xVar) {
        this.f62015b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f62015b;
        if (xVar.K) {
            return;
        }
        xVar.L = true;
        xVar.a("视频缓冲超时");
    }
}
