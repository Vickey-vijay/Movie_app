package f;

import android.app.Activity;
import com.yk.e.inf.IComCallback;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.NativeAdLoader;
import sg.bigo.ads.api.NativeAdRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f52743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f52744b;

    public h(f0 f0Var, Activity activity) {
        this.f52744b = f0Var;
        this.f52743a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f52744b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        new NativeAdLoader.Builder().withAdLoadListener((AdLoadListener<NativeAd>) new k(this)).build().loadAd(new NativeAdRequest.Builder().withSlotId(this.f52744b.F).build());
    }
}
