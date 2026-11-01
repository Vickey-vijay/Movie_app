package dp;

import com.yk.e.pl.PreloadTask;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements PreloadTask.IPreloadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f52272a;

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onCancel(int i10) {
    }

    public q0(n nVar) {
        this.f52272a = nVar;
    }

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onFailed(int i10, String str) {
        n nVar = this.f52272a;
        nVar.J = true;
        nVar.a(str);
    }

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onSuccess(int i10) {
        this.f52272a.G.runOnUiThread(new n0(this));
    }
}
