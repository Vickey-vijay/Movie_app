package dp;

import android.app.Activity;
import com.facebook.ads.NativeBannerAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f52249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f52250b;

    public f0(m0 m0Var, Activity activity) {
        this.f52250b = m0Var;
        this.f52249a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f52250b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        this.f52250b.H = new NativeBannerAd(this.f52249a.getApplicationContext(), this.f52250b.J);
        NativeBannerAd nativeBannerAd = this.f52250b.H;
        nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(this.f52250b.K).build());
    }
}
