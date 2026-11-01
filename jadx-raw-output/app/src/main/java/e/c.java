package e;

import android.app.Activity;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f52286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f52287b;

    public c(b0 b0Var, Activity activity) {
        this.f52287b = b0Var;
        this.f52286a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f52287b.x(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        new AdLoader.Builder(this.f52286a, this.f52287b.O).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(false).build()).build()).forNativeAd(new g(this)).withAdListener(this.f52287b.Q).withNativeAdOptions(new NativeAdOptions.Builder().setAdChoicesPlacement(2).build()).build().loadAd(new AdRequest.Builder().build());
    }
}
