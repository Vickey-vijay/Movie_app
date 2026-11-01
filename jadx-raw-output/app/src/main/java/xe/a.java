package xe;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f74432b;

    public a(u uVar) {
        this.f74432b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        u uVar = this.f74432b;
        synchronized (uVar) {
            z10 = uVar.E == 0;
        }
        if (z10) {
            u.D(this.f74432b);
            this.f74432b.a("视频缓冲超时");
        }
    }
}
