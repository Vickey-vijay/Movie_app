package dp;

import android.app.Activity;
import com.yk.e.inf.IComCallback;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.NativeAdLoader;
import sg.bigo.ads.api.NativeAdRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f52254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f52255b;

    public i(i0 i0Var, Activity activity) {
        this.f52255b = i0Var;
        this.f52254a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f52255b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        new NativeAdLoader.Builder().withAdLoadListener((AdLoadListener<NativeAd>) new d0(this)).build().loadAd(new NativeAdRequest.Builder().withSlotId(this.f52255b.I).build());
    }
}
