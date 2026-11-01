package k;

import com.yk.e.pl.PreloadTask;
import com.yk.e.util.CoreUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements PreloadTask.IPreloadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f62044a;

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onCancel(int i10) {
    }

    public z(x xVar) {
        this.f62044a = xVar;
    }

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onFailed(int i10, String str) {
        x xVar = this.f62044a;
        xVar.L = true;
        xVar.a(str);
    }

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onSuccess(int i10) {
        x xVar = this.f62044a;
        CoreUtils.addCacheVideoAdsID(xVar.G, xVar.f61589j);
        this.f62044a.G.runOnUiThread(new y0(this));
    }
}
