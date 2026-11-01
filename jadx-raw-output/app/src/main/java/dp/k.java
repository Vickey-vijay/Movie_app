package dp;

import android.app.Activity;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f52258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f52259b;

    public k(a0 a0Var, Activity activity) {
        this.f52259b = a0Var;
        this.f52258a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f52259b.x(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        new AdLoader.Builder(this.f52258a, this.f52259b.J).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(false).build()).build()).forNativeAd(new d(this)).withAdListener(this.f52259b.K).withNativeAdOptions(new NativeAdOptions.Builder().setAdChoicesPlacement(2).build()).build().loadAd(new AdRequest.Builder().build());
    }
}
