package l;

import android.app.Activity;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yk.e.inf.IComCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f63329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f63330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f63331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f63332d;

    public g(k kVar, Activity activity, int i10, int i11) {
        this.f63332d = kVar;
        this.f63329a = activity;
        this.f63330b = i10;
        this.f63331c = i11;
    }

    public final /* synthetic */ void a(Activity activity, int i10, int i11, NativeAd nativeAd) {
        int i12;
        int i13;
        k kVar = this.f63332d;
        kVar.C = nativeAd;
        kVar.F = System.currentTimeMillis();
        nativeAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: l.f
            @Override // com.google.android.gms.ads.OnPaidEventListener
            public final void onPaidEvent(AdValue adValue) {
                this.f63327a.b(adValue);
            }
        });
        k kVar2 = this.f63332d;
        i.e eVar = kVar2.f61590k;
        if (eVar == null || (i12 = eVar.f54039d) == 0) {
            i12 = IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW;
        }
        int i14 = i12;
        if (eVar == null || (i13 = eVar.f54040e) == 0) {
            i13 = 465;
        }
        kVar2.D = new d.b(activity, nativeAd);
        this.f63332d.D.a(activity, i14, i13, i10, i11);
    }

    public final void b(AdValue adValue) {
        String str;
        this.f63332d.f(adValue.getValueMicros() / 1000000);
        this.f63332d.f61605z = "admob_" + this.f63332d.C.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName();
        this.f63332d.r(adValue);
        this.f63332d.E = new AdInfo();
        this.f63332d.E.setRevenue(adValue.getValueMicros() / 1000000);
        int precisionType = adValue.getPrecisionType();
        if (precisionType == 0) {
            str = "UNKNOWN";
        } else if (precisionType != 1) {
            str = precisionType != 3 ? "PUBLISHER_PROVIDED" : "PRECISE";
        } else {
            str = "ESTIMATED";
        }
        this.f63332d.E.setRevenuePrecision(str);
        k kVar = this.f63332d;
        kVar.E.setNetworkName(kVar.C.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName());
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f63332d.x(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        AdLoader.Builder builderWithNativeAdOptions = new AdLoader.Builder(this.f63329a, this.f63332d.G).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(false).build()).build());
        final Activity activity = this.f63329a;
        final int i10 = this.f63330b;
        final int i11 = this.f63331c;
        builderWithNativeAdOptions.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: l.e
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final void onNativeAdLoaded(NativeAd nativeAd) {
                this.f63323b.a(activity, i10, i11, nativeAd);
            }
        }).withAdListener(this.f63332d.H).withNativeAdOptions(new NativeAdOptions.Builder().setAdChoicesPlacement(2).build()).build().loadAd(new AdRequest.Builder().build());
    }
}
