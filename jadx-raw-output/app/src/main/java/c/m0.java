package c;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f5581b;

    public m0(v vVar) {
        this.f5581b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v vVar = this.f5581b;
        if (vVar.E) {
            return;
        }
        vVar.F = true;
        vVar.a("视频缓冲超时");
    }
}
