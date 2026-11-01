package f;

import android.app.Activity;
import com.facebook.ads.NativeAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f52762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f52763b;

    public y(f fVar, Activity activity) {
        this.f52763b = fVar;
        this.f52762a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f52763b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        this.f52763b.F = new NativeAd(this.f52762a.getApplicationContext(), this.f52763b.G);
        NativeAd nativeAd = this.f52763b.F;
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(this.f52763b.H).build());
    }
}
