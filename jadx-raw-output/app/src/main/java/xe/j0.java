package xe;

import android.app.Activity;
import com.yk.e.pl.PreloadTask;
import com.yk.e.util.CoreUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 implements PreloadTask.IPreloadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f74450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f74451b;

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onCancel(int i10) {
    }

    public j0(u uVar, Activity activity) {
        this.f74451b = uVar;
        this.f74450a = activity;
    }

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onFailed(int i10, String str) {
        boolean z10;
        u uVar = this.f74451b;
        synchronized (uVar) {
            z10 = uVar.E == 0;
        }
        if (z10) {
            u.D(this.f74451b);
            this.f74451b.a(str);
        }
    }

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onSuccess(int i10) {
        CoreUtils.addCacheVideoAdsID(this.f74450a, this.f74451b.f61589j);
        this.f74450a.runOnUiThread(new b(this));
    }
}
