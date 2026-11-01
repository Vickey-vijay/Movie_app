package l;

import android.app.Activity;
import com.facebook.ads.NativeBannerAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f63342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f63343b;

    public j(y yVar, Activity activity) {
        this.f63343b = yVar;
        this.f63342a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f63343b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        this.f63343b.D = new NativeBannerAd(this.f63342a.getApplicationContext(), this.f63343b.G);
        NativeBannerAd nativeBannerAd = this.f63343b.D;
        nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(this.f63343b.H).build());
    }
}
