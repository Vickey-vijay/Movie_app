package e;

import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.nativead.NativeAd;
import com.yk.e.adview.AdmobNativeMediaView;
import com.yk.e.object.AdInfo;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements NativeAd.OnNativeAdLoadedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f52294b;

    public g(c cVar) {
        this.f52294b = cVar;
    }

    public final void a(AdValue adValue) {
        String str;
        this.f52294b.f52287b.f(adValue.getValueMicros() / 1000000);
        this.f52294b.f52287b.f61605z = "admob_" + this.f52294b.f52287b.M.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName();
        this.f52294b.f52287b.r(adValue);
        this.f52294b.f52287b.P = new AdInfo();
        this.f52294b.f52287b.P.setRevenue(adValue.getValueMicros() / 1000000);
        int precisionType = adValue.getPrecisionType();
        if (precisionType == 0) {
            str = "UNKNOWN";
        } else if (precisionType != 1) {
            str = precisionType != 3 ? "PUBLISHER_PROVIDED" : "PRECISE";
        } else {
            str = "ESTIMATED";
        }
        this.f52294b.f52287b.P.setRevenuePrecision(str);
        b0 b0Var = this.f52294b.f52287b;
        b0Var.P.setNetworkName(b0Var.M.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName());
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        RelativeLayout relativeLayout;
        this.f52294b.f52287b.M = nativeAd;
        nativeAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: e.f
            @Override // com.google.android.gms.ads.OnPaidEventListener
            public final void onPaidEvent(AdValue adValue) {
                this.f52292a.a(adValue);
            }
        });
        int dimensionPixelOffset = this.f52294b.f52286a.getResources().getDimensionPixelOffset(IDUtil.getDimen(this.f52294b.f52286a, "dp_135"));
        c cVar = this.f52294b;
        cVar.f52287b.N = new d.b(cVar.f52286a, nativeAd);
        AdmobNativeMediaView admobNativeMediaView = this.f52294b.f52287b.N.f51754c;
        if (admobNativeMediaView != null && (relativeLayout = admobNativeMediaView.f3327lIiI) != null) {
            relativeLayout.setVisibility(8);
        }
        c cVar2 = this.f52294b;
        cVar2.f52287b.N.a(cVar2.f52286a, -1, dimensionPixelOffset, -1, dimensionPixelOffset);
    }
}
