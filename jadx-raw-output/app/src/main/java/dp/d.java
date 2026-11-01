package dp;

import android.widget.ImageView;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.nativead.NativeAd;
import com.yk.e.adview.AdmobNativeMediaView;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements NativeAd.OnNativeAdLoadedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f52245b;

    public d(k kVar) {
        this.f52245b = kVar;
    }

    public final void a(AdValue adValue) {
        String str;
        this.f52245b.f52259b.f(adValue.getValueMicros() / 1000000);
        this.f52245b.f52259b.f61605z = "admob_" + this.f52245b.f52259b.G.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName();
        this.f52245b.f52259b.r(adValue);
        this.f52245b.f52259b.H = new AdInfo();
        this.f52245b.f52259b.H.setRevenue(adValue.getValueMicros() / 1000000);
        int precisionType = adValue.getPrecisionType();
        if (precisionType == 0) {
            str = "UNKNOWN";
        } else if (precisionType != 1) {
            str = precisionType != 3 ? "PUBLISHER_PROVIDED" : "PRECISE";
        } else {
            str = "ESTIMATED";
        }
        this.f52245b.f52259b.H.setRevenuePrecision(str);
        a0 a0Var = this.f52245b.f52259b;
        a0Var.H.setNetworkName(a0Var.G.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName());
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        int i10;
        int i11;
        ImageView imageView;
        this.f52245b.f52259b.G = nativeAd;
        nativeAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: dp.c
            @Override // com.google.android.gms.ads.OnPaidEventListener
            public final void onPaidEvent(AdValue adValue) {
                this.f52243a.a(adValue);
            }
        });
        k kVar = this.f52245b;
        a0 a0Var = kVar.f52259b;
        i.e eVar = a0Var.f61590k;
        if (eVar == null || (i10 = eVar.f54039d) == 0) {
            i10 = 1000;
        }
        int i12 = i10;
        if (eVar == null || (i11 = eVar.f54040e) == 0) {
            i11 = 570;
        }
        int i13 = i11;
        a0Var.I = new d.b(kVar.f52258a, nativeAd);
        AdmobNativeMediaView admobNativeMediaView = this.f52245b.f52259b.I.f51754c;
        if (admobNativeMediaView != null && (imageView = admobNativeMediaView.f3324Ll1) != null) {
            imageView.setVisibility(0);
        }
        a0 a0Var2 = this.f52245b.f52259b;
        d.b bVar = a0Var2.I;
        h hVar = a0Var2.L;
        AdmobNativeMediaView admobNativeMediaView2 = bVar.f51754c;
        if (admobNativeMediaView2 != null) {
            admobNativeMediaView2.setCloseImageViewClickListener(hVar);
        }
        k kVar2 = this.f52245b;
        a0 a0Var3 = kVar2.f52259b;
        a0Var3.I.a(kVar2.f52258a, i12, i13, a0Var3.B, a0Var3.C);
    }
}
