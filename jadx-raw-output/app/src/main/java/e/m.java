package e;

import android.app.Activity;
import com.facebook.ads.NativeBannerAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f52302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f52303b;

    public m(r rVar, Activity activity) {
        this.f52303b = rVar;
        this.f52302a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f52303b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        this.f52303b.N = new NativeBannerAd(this.f52302a.getApplicationContext(), this.f52303b.O);
        NativeBannerAd nativeBannerAd = this.f52303b.N;
        nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(this.f52303b.P).build());
    }
}
