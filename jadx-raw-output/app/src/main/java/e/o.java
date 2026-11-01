package e;

import android.app.Activity;
import com.yk.e.inf.IComCallback;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.NativeAdLoader;
import sg.bigo.ads.api.NativeAdRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f52305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f52306b;

    public o(h hVar, Activity activity) {
        this.f52306b = hVar;
        this.f52305a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f52306b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        new NativeAdLoader.Builder().withAdLoadListener((AdLoadListener<NativeAd>) new e(this)).build().loadAd(new NativeAdRequest.Builder().withSlotId(this.f52306b.N).build());
    }
}
